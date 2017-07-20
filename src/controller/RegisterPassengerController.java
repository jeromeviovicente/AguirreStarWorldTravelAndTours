package controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import crud.CRUD;
import encryption.Encrypt;
import encryption.GenerateIV;
import enumerated.Role;
import model.AddressModel;
import model.RegisterPassengerModel;
import tables.Accounts;
import tables.Address;
import tables.Passenger;
import tables.TransactionHistory;
import transactionhistory.SaveHistory;

@Controller
public class RegisterPassengerController {

	@RequestMapping(value="/passenger-reg")
	public String RegisterPassenger(){
		return "registerpassenger";
	}

	@RequestMapping(value="/passenger-reg", method = RequestMethod.POST)
	public ModelAndView RegisterPassenger(@ModelAttribute("PassInfo") @Valid RegisterPassengerModel rmp, @ModelAttribute("AddressInfo") @Valid AddressModel addmodel, BindingResult result) {

		ModelAndView modelAndView;
		modelAndView = new ModelAndView("testresults");
		String message = "";

		if(result.hasErrors()){
			System.out.println(result.getAllErrors());
			for(ObjectError errors : result.getAllErrors()){
				message += "\n" + errors.getDefaultMessage();
			}

		}
		else{
			Passenger passenger = new Passenger();
			Accounts account = new Accounts();

			try {
				new GenerateIV();
				byte[] iv = GenerateIV.getIV();

				new Encrypt();
				account.setPassword(Encrypt.encrypt(rmp.getPassword(), iv));
				account.setIv(iv);	

			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			account.setRole(Role.PASSENGER.toString());
			account.setEmail(rmp.getEmail());

			passenger.setFirstName(rmp.getFirstName());
			passenger.setLastName(rmp.getLastName());
			passenger.setMiddleName(rmp.getMiddleName());
			passenger.setBirthDay(rmp.getBirthDay());
			passenger.setAge(rmp.getAge());
			passenger.setContactNumber(rmp.getContactNumber());
			passenger.setAccounts(account);

			Address address = new Address();
			address.setLine1(addmodel.getLine1());
			address.setLine2(addmodel.getLine2());
			address.setLine3(addmodel.getLine3());
			address.setCountry(addmodel.getCountry());
			address.setState(addmodel.getState());
			address.setCity(addmodel.getCity());
			address.setZipCode(addmodel.getZipCode());
			address.setPassenger(passenger);

			try {
				boolean crudResult = CRUD.RegisterPassenger(account, passenger, address);
				if(crudResult){
					
					//Save a transaction for history
					SaveHistory.saveToMyHistory("Register Account", account);
					
					
					message = "Success registration";
				}
				else{
					message = "Failed registration";
				}
			}
			catch(ConstraintViolationException ex){
		    	ex.printStackTrace();
		   
		    	String[] toSplit = ("" + ex.getCause().getMessage()).split("'");
		    	
		    	message = "Duplicate Entry, \n" + toSplit[1] + " is not available";
		    	
		    }
			catch (Exception e) {
				e.printStackTrace();
				message = "Exception rule, \n"+ e.getCause().getMessage().toString();

			}
			
			
		}


		modelAndView.addObject("message", message);
		return modelAndView;

	}



}

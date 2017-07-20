package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import crud.CRUD;
import encryption.Encrypt;
import encryption.GenerateIV;
import enumerated.Role;
import model.RegisterDriverModel;
import model.WorkingDetailsModel;
import tables.Accounts;
import tables.Driver;
import tables.WorkingDetails;

@Controller
public class RegisterDriverController {

	@RequestMapping(value="/driver-reg")
	public String RegisterDriver(){
		System.out.println("driver form");
		return "registerdriver";
	}
	
	@RequestMapping(value="/reg-driver", method = RequestMethod.POST)
	public ModelAndView RegisterDriver(@ModelAttribute("PassInfo") RegisterDriverModel dm, WorkingDetailsModel wdm, BindingResult result){
		ModelAndView modelAndView = new ModelAndView("testloginresults");
		System.out.println("driver process");
		
		if(result.hasFieldErrors()){
			System.out.println(result.getAllErrors());
		}
		
		
		String message = "";
		Accounts account = new Accounts();
		Driver driver = new Driver();
		WorkingDetails workingDetails = new WorkingDetails();
		account.setRole(Role.DRIVER.toString());
		try {
			new GenerateIV();
			byte[] iv = GenerateIV.getIV();
			new Encrypt();
			account.setPassword(Encrypt.encrypt(dm.getPassword(), iv));
			account.setIv(iv);	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.setEmail(dm.getEmailAddress());
		
		driver.setVehicleType(dm.getVehicleType());
		driver.setPlateNumber(dm.getPlateNumber());
		driver.setFirstName(dm.getFirstName());
		driver.setMiddleName(dm.getMiddleName());
		driver.setLastName(dm.getLastName());
		driver.setBirthDay(dm.getBirthDay());
		driver.setAge(dm.getAge());
		driver.setCurrentCity(dm.getCurrentCity());
		driver.setHomeProvince(dm.getHomeProvince());
		driver.setContactNumber(String.valueOf(dm.getMobileNumber()));
		driver.setAccounts(account);
		
		workingDetails.setWorkingCities(wdm.getWorkingCity());
		workingDetails.setWorkingProvince(wdm.getWorkingProvince());
		workingDetails.setWorkingBarangay(wdm.getWorkingBarangay());
		workingDetails.setWorkingSubdivision(wdm.getWorkingSubdivision());
		workingDetails.setTimeAvailability(wdm.getTimeAvailability());
		workingDetails.setDriver(driver);
		
		try {
			boolean crudResult = CRUD.RegisterDiver(account, driver, workingDetails);
			if (crudResult){
				message = "Successfully Registered";
			} else 
				message = "Registration Failed";
		} catch(MySQLIntegrityConstraintViolationException e){
			e.printStackTrace();
			message = "Failed registration, \nDuplicate Entry, \n" + e.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message = "Exception rule, \n"+ e.getMessage();
		}
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
}

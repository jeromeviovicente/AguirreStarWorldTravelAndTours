package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import authenticaton.Login;
import model.AddressModel;
import model.LoginModel;
import model.RegisterPassengerModel;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String RegisterPassenger(){
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute("PassInfo") LoginModel model, BindingResult result) {
		System.out.println(model.getUserName());
		
		ModelAndView modelAndView = new ModelAndView("testresults");
		
		//Instantiate Login object
		Login login = new Login();
		
		
		String message = ""; // will hold the message that will pass to the views
		
		try {
			
			message = login.Authenticate(model.getUserName(), model.getPassword());
			
			if(login.isAuth()){
				
				modelAndView.addObject("message", message);
				
			}
			else{
				
				modelAndView.addObject("message", message);
				
			}
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			message = e.getMessage();
			
			modelAndView.addObject("message", message);
			
		}
		
		System.out.println("Controller: "+ message);
		
		return modelAndView;
	}
		
}

package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import authenticaton.Login;
import model.LoginModel;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String RegisterPassenger(){
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute("PassInfo") LoginModel model, BindingResult result, HttpServletRequest sessionRequest) {
		//System.out.println(model.getEmail() + " : " + model.getPassword());
		
		ModelAndView modelAndView = new ModelAndView("testloginresults");
		
		//Instantiate Login object
		Login login = new Login();
		
		
		String message = ""; // will hold the message that will pass to the views
		
		try {
			
			message = login.Authenticate(model.getEmail(), model.getPassword());
			
			if(login.isAuth()){
				
				String email = login.getEmailAndRole().getEmail();
				String role = login.getEmailAndRole().getRole();
				
				//System.out.println("email : " + email + "\nrole : " + role);
				
				modelAndView.addObject("message", message);
				modelAndView.addObject("email", email);
				
				
				// Set the session on or active
				HttpSession session = sessionRequest.getSession();
				sessionRequest.getSession(false);
				session.setAttribute("activeSession", "active");
				session.setAttribute("email", email);
				session.setAttribute("role", role);
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
		
		
		
		//System.out.println("Controller: "+ message);
		
		return modelAndView;
	}
		
}

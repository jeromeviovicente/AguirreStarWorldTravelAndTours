package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import enumerated.Role;
import model.RegisterPassengerModel;

@Controller
public class HomeController {

	@RequestMapping({"/", "home", "index"})
	public String IndexPage(){
		return "home";
	}
	
	@RequestMapping({"admin", "/adminlogin"})
	public String AdminPage(){
		return "adminlogin";
	}
	
	
	
	@RequestMapping("admin-dashboard")
	public String AdminDaxhBoard(){
		return "admin-dashboard";
	}
}

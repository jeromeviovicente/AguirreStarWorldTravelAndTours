package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import model.MarkUpModel;

@Controller
public class AdminDashBoardController {
	
	@RequestMapping(value="update-Markup")
	public static void setMarkUp(@ModelAttribute("") MarkUpModel mu, BindingResult result ){
		
	} 
	
}

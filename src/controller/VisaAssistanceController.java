package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisaAssistanceController {
	
	@RequestMapping("/visa_assistance")
	public String VisaAssistance(){
		return "visa_assistance";
	}
	
	
}

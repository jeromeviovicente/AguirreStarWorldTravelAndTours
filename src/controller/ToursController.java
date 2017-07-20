package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.AirTicketingSearchModel;

@Controller
public class ToursController {

	@RequestMapping("/international_tour")
	public String InternationalTour(){
		return "international_tour";
	}
	
	
	@RequestMapping(value="/international_tour", method = RequestMethod.POST)
	public ModelAndView InternationalTourPost(@ModelAttribute("PassInfo") AirTicketingSearchModel model , BindingResult result){
		
		ModelAndView modelAndView = new ModelAndView("international_tour");
		
		
		if(result.hasErrors()){
			System.out.println(result.getAllErrors());
		}
		else{
			System.out.println(
				model.getPlan() + "\n"+ 
				model.getAdult() + "\n"+ 
				model.getInfant() + "\n"+ 
				model.getChildren() + "\n"+ 
				model.getOrigin() + "\n"+ 
				model.getDestination() + "\n"+ 
				model.getClassFlight() + "\n"+ 
				model.getOnwardDate() + "\n"+ 
				model.getReturnDate() + "\n"+ 
				model.isSenior()
					);
			
		}
		
		
		
		
		
		
		
		return modelAndView;
	}
	
	
	
	
	@RequestMapping("/domestic_tour")
	public String Domestic(){
		return "domestic_tour";
	}
	
	@RequestMapping("/cruise")
	public String Cruise(){
		return "cruise";
	}
	
}

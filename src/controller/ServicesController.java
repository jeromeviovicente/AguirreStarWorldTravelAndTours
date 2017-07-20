package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import crud.CRUD;
import model.BusReservationModel;
import portals.WTVPortal;

@Controller
public class ServicesController {

	@RequestMapping("/airline_ticketing")
	public ModelAndView AirlineTicketing(){
		ModelAndView model = new ModelAndView("airline_ticketing");
		model.addObject("classlist", CRUD.getDomesticAirLineClass());
		model.addObject("destinationlist", CRUD.getDomesticAirLineDestination());
		model.addObject("originlist", CRUD.getDomesticAirLineOrigin());
		return model;
	}
	
	/*@RequestMapping(value="/airline_ticketing", method=RequestMethod.POST )
	@ResponseBody
	public String SearchAirlineTicketing() throws Exception{
		return WTVPortal.SearchDomesticAirLines();
	}*/
	
	@RequestMapping("/bus_reservation")
	public String BusReservation(){
		return "bus_reservation";
	}
	
	@RequestMapping(value="/bus_reservation", method=RequestMethod.POST )
	public String BusReservation(@ModelAttribute() BusReservationModel model){
		
		/*model.getOrigin()
		model.getDestination()
		model.getDate()
		model.getPax()*/
		
		return "bus_reservation";
	}
	
	
	@RequestMapping("/car_rentals")
	public String CarRentals(){
		return "car_rentals";
	}
	
	
	@RequestMapping("/ferry")
	public String Ferry(){
		return "ferry";
	}
	
	
	@RequestMapping("/hotel_accomodation")
	public String Hotel_accomodation(){
		return "hotel_accomodation";
	}
}

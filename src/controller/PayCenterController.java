package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayCenterController {

	@RequestMapping("/pay_center")
	public String InternationalTour(){
		return "pay_center";
	}
}

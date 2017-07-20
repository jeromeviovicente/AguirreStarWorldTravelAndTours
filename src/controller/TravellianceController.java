package controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import crud.CRUD;
import model.FitSearchModel;
import model.FitSearchOutputModel;
import model.GitSearchModel;
import model.GitSearchOutputModel;
import model.TourSearchModel;
import portals.TravelliancePortal;
import tables.GitCountry;

@Controller
public class TravellianceController {

/*
	@RequestMapping(value="/getRakso")
	@ResponseBody
	public String getRakso() throws Exception{
		WebClient webClient = new WebClient();
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setPrintContentOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.waitForBackgroundJavaScript(5000);

		HtmlPage currentPage = webClient.getPage("http://raksotravel.com/Default.aspx?aspxerrorpath=/destination/default.aspx");
		
		
		return currentPage.getWebResponse().getContentAsString();
	}*/
	
	
	
	@RequestMapping(value="/search")
	public ModelAndView Search(){
		ModelAndView modelAndView = new ModelAndView("search");
		
		modelAndView.addObject("gitCountry", CRUD.getGitCountry());
		modelAndView.addObject("gitFrom", CRUD.getGitFrom());
		modelAndView.addObject("gitTo", CRUD.getGitTo());
		
		modelAndView.addObject("fitCountry", CRUD.getFitOrLandCountry());
		modelAndView.addObject("fitTo", CRUD.getFitOrLandTo());
		
		modelAndView.addObject("tourCountry", CRUD.getTourCountry());

		return modelAndView;
	}
	
	@RequestMapping(value="/git_search")
	public ModelAndView GitSearch(@ModelAttribute("") GitSearchModel model, BindingResult result){
		ModelAndView modelAndView = new ModelAndView("git_search_result");
		//System.out.println(model.getOrigin() +"\n"+ model.getDestination() +"\n"+ model.getCountry() +"\n"+ model.getDate());
		
		if(result.hasErrors()){
			
		}
		else{
			try {
				List<GitSearchOutputModel> list = TravelliancePortal.Git(model.getOrigin(), model.getDestination(), model.getCountry(), model.getDate());
				
				/*for(GitSearchOutputModel data : list){
					System.out.println(data.getGit()+
						"\t"+data.getDeparture()+
						"\t"+data.getAirport()+
						"\t"+data.getPrice());
				}*/
				
				modelAndView.addObject("list", list);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				modelAndView.addObject(e.getMessage());
			}
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/fit_search")
	//@ResponseBody
	public ModelAndView FitSearch(@ModelAttribute("") FitSearchModel model, BindingResult result){
		ModelAndView modelAndView = new ModelAndView("fit_search_result");
		
		if(result.hasErrors()){
			
		}
		else{
			try {
				List<FitSearchOutputModel> list = TravelliancePortal.Land(model.getDestination(), model.getCountry(), model.getDate());
				
				/*for(FitSearchOutputModel data : list){
					System.out.println(data.getFit()+
					"\t"+data.getHotel()+
					"\t"+data.getPrice());
				}*/
				
				modelAndView.addObject("list", list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/tour_search")
	public ModelAndView TourSearch(@ModelAttribute("") TourSearchModel model, BindingResult result){
		ModelAndView modelAndView = new ModelAndView("tour_search_result");
		return modelAndView;
		
	}
	
}

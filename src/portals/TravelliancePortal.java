package portals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import crud.CRUD;
import model.FitSearchOutputModel;
import model.GitSearchOutputModel;
import tables.FitOrLandCountry;
import tables.FitOrLandTo;
import tables.GitCountry;
import tables.GitFrom;
import tables.GitTo;
import tables.TourCountry;

public class TravelliancePortal {

	private static String git;
	private static String fit;
	
	public static HtmlPage Login() throws Exception{
		WebClient webClient = new WebClient();
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setPrintContentOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.waitForBackgroundJavaScript(5000);

		HtmlPage currentPage = webClient.getPage("http://travelliance.com/login");

		final HtmlForm form = (HtmlForm) currentPage.getElementById("form1");

		final HtmlTextInput userId = form.getInputByName("username");
		userId.setValueAttribute("AGUIRRETRAVEL");

		final HtmlPasswordInput password = form.getInputByName("password") ;
		password.setValueAttribute("RAKSO1234");

		final HtmlSubmitInput button = form.getInputByName("login_button");

		final HtmlPage page2 = button.click();
		return page2;
	}


	public static List<GitSearchOutputModel> Git(String originString, String destinationString, String countryString, String departureDateString)throws Exception{

		HtmlPage currentPage = Login();

		final HtmlForm form = (HtmlForm) currentPage.getElementById("form1");

		final HtmlSelect origin = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_from");
		HtmlOption optionOrigin = origin.getOptionByValue(originString);
		origin.setSelectedAttribute(optionOrigin, true);

		final HtmlSelect destination = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_destination");
		HtmlOption optionDestination = destination.getOptionByValue(destinationString);
		destination.setSelectedAttribute(optionDestination, true);

		final HtmlSelect country = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_to");
		HtmlOption optionCountry = country.getOptionByValue(countryString);
		country.setSelectedAttribute(optionCountry, true);

		final HtmlTextInput departureDate = form.getInputByName("ctl00$ContentPlaceHolder1$txt_git_departure");
		departureDate.setValueAttribute(departureDateString);

		final HtmlSubmitInput searchButton = form.getInputByName("ctl00$ContentPlaceHolder1$search_git");


		HtmlPage resultpage =  searchButton.click();
		//********************************** JSOUP API ***********************************************************************************************
		String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";
		int rowSize=0;

		Document doc = Jsoup.parse(resultpage.asXml());
		Elements tableElements = doc.select("table");

		Elements tableHeaderEles = tableElements.select("thead tr th");

		Elements tableRowElements = tableElements.select(":not(thead) tr");

		List<GitSearchOutputModel> output = new ArrayList<GitSearchOutputModel>();
		
		for (int i1 = 1; i1 < tableRowElements.size(); i1++) {
			Element row = tableRowElements.get(i1);

			Elements rowItems = row.select("td");
			//System.out.print("row :" + i1 + "\tcolumn size:" + rowItems.size());
			//System.out.print("\tchildNo: "+rowItems.get(0).childNodeSize() + "\n");
		
			if(rowItems.size() == 9){
				//System.out.print("\t"+ rowItems.get(2).child(0).attr("data-status")+"\t");
				
				//This if statement is to check if open otherwise close and then not include
				if(rowItems.get(2).child(0).attr("data-status").equalsIgnoreCase("icon_open")){
					char oldchar1 = '“';
					char oldchar2 = '”';
					char newchar = '"';
					char oldchar3 = '–';
					char newchar2 = '-';
					
					String oldString1 = "’";
					String newSring1 = "'";
					
					git = rowItems.get(0).text().replace(oldchar1, newchar).replace(oldchar2, newchar).replace(oldchar3, newchar2).replaceAll(oldString1, newSring1);
					String date = rowItems.get(1).text();
					String airport = rowItems.get(3).text();
					String price = rowItems.get(4).text();
					
					output.add(new GitSearchOutputModel(git, date, airport, price));
					
				}
			}
			else{
				//System.out.print("\t"+ rowItems.get(1).child(0).attr("data-status")+"\t");
				
				//This if statement is to check if open otherwise close and then not include
				if(rowItems.get(1).child(0).attr("data-status").equalsIgnoreCase("icon_open")){
					
					String date = rowItems.get(0).text();
					String airport = rowItems.get(2).text();
					String price = rowItems.get(3).text();
					
					output.add(new GitSearchOutputModel(git, date, airport, price));
					
				}
			}
			
			//System.out.print("\n");
		}

		return output;

	}


	public static List<FitSearchOutputModel> Land(String origin, String country, String date)throws Exception{

		HtmlPage currentPage = Login();

		final HtmlForm form = (HtmlForm) currentPage.getElementById("form1");

		final HtmlSelect destination = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_fit_destination");
		HtmlOption optionDestination = destination.getOptionByValue(origin);
		destination.setSelectedAttribute(optionDestination, true);

		final HtmlSelect to = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_fit_to");
		HtmlOption optionTo = to.getOptionByValue(country);
		to.setSelectedAttribute(optionTo, true);


		final HtmlTextInput departureDate = form.getInputByName("ctl00$ContentPlaceHolder1$txt_fit_departure");
		departureDate.setValueAttribute(date);

		final HtmlSubmitInput searchButton = form.getInputByName("ctl00$ContentPlaceHolder1$search_fit");
		//searchButton.click();

		HtmlPage resultpage =  searchButton.click();
		
		//********************************** JSOUP API ***********************************************************************************************
		String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";
		
		Document doc = Jsoup.parse(resultpage.asXml());
		Elements tableElements = doc.select("table");

		Elements tableHeaderEles = tableElements.select("thead tr th");

		Elements tableRowElements = tableElements.select(":not(thead) tr");
		
		List<FitSearchOutputModel> output = new ArrayList<FitSearchOutputModel>();
		
		for (int i1 = 1; i1 < tableRowElements.size(); i1++) {
			Element row = tableRowElements.get(i1);

			Elements rowItems = row.select("td");
			
			
			if(rowItems.size() == 6){
				char oldchar1 = '“';
				char oldchar2 = '”';
				char newchar = '"';
				char oldchar3 = '–';
				char newchar2 = '-';
				
				String oldString1 = "’";
				String newSring1 = "'";
				
				fit = rowItems.get(0).text();//.replace(oldchar1, newchar).replace(oldchar2, newchar).replace(oldchar3, newchar2).replaceAll(oldString1, newSring1);
				String hotel = rowItems.get(1).text();
				String price = rowItems.get(2).text();
			
				output.add(new FitSearchOutputModel(fit, hotel, price));
			}
			else{
				String hotel = rowItems.get(0).text();
				String price = rowItems.get(1).text();
				
				output.add(new FitSearchOutputModel(fit, hotel, price));
			}
		}
		
		return output;//searchButton.click().getWebResponse().getContentAsString();
	}


	public static String Tour()throws Exception{
		return "";
	}


	public static String UpdateGit()throws Exception{
		String message = "";
		CRUD.DeleteTable("GitFrom");
		CRUD.DeleteTable("GitTo");
		CRUD.DeleteTable("GitCountry");

		HtmlPage currentPage = Login();

		final HtmlForm form = (HtmlForm) currentPage.getElementById("form1");

		HtmlSelect gitFrom = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_from"); 			//From
		HtmlSelect gitTo = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_destination"); 		//To
		
		

		for( DomElement elements : gitFrom.getChildElements() ) 
		{ 
			GitFrom tableGitFrom = new GitFrom();
			//System.out.println(element.getTextContent()+  " : "+ element.getAttribute("value"));
			tableGitFrom.setName(elements.getTextContent().toString());
			tableGitFrom.setValue(elements.getAttribute("value").toString());
			CRUD.GitFrom(tableGitFrom);
		} 
		
		for( DomElement elements : gitTo.getChildElements() ) 
		{ 
			GitTo tableGitTo = new GitTo();
			//System.out.println(element.getTextContent()+  " : "+ element.getAttribute("value"));
			tableGitTo.setName(elements.getTextContent().toString());
			tableGitTo.setValue(elements.getAttribute("value").toString());
			CRUD.GitTo(tableGitTo);
		} 
		
		/*int count = 0;
		for(GitTo to: CRUD.getGitTo()){
			HtmlSelect getSelectDestination = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_destination"); 		//To
			List<HtmlOption> optionDestination = (List<HtmlOption>) getSelectDestination.getOptions();
			getSelectDestination.setSelectedAttribute(optionDestination.get(count), true);
			
			System.out.println("to: "+ getSelectDestination.asText());
			getSelectDestination.click();
			
			Thread.sleep(2000);
			count++;
			
			HtmlSelect gitCountry = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_to"); 				//Country
			
			for(int loop = 0; loop <gitCountry.getChildElementCount(); loop++){
				System.out.println(gitCountry.getOption(loop).asText());
			}
			
			
			
			for( DomElement elements : gitCountry.getChildElements() ) 
			{ 
				GitCountry tableGitCountry = new GitCountry();
				//System.out.println(element.getTextContent()+  " : "+ element.getAttribute("value"));
				tableGitCountry.setDestination(to.getName());
				tableGitCountry.setName(elements.getTextContent().toString());
				tableGitCountry.setValue(elements.getAttribute("value").toString());
				CRUD.GitCountry(tableGitCountry);
			} 
			
		}
		*/
		
		HtmlSelect gitCountry = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_git_to"); 				//Country
		for( DomElement elements : gitCountry.getChildElements() ) 
		{ 
			GitCountry tableGitCountry = new GitCountry();
			//System.out.println(element.getTextContent()+  " : "+ element.getAttribute("value"));
			tableGitCountry.setDestination("ASIA");//to.getName());
			tableGitCountry.setName(elements.getTextContent().toString());
			tableGitCountry.setValue(elements.getAttribute("value").toString());
			CRUD.GitCountry(tableGitCountry);
		}
		
		
		return "";
	}

	
	
	
	
	public static String UpdateLand()throws Exception{
		CRUD.DeleteTable("FitOrLandCountry");
		CRUD.DeleteTable("FitOrLandTo");
		HtmlPage currentPage = Login();

		final HtmlForm form = (HtmlForm) currentPage.getElementById("form1");

		HtmlSelect landTo = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_fit_destination"); 			//To
		HtmlSelect landCountry = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_fit_to"); 				//Country


		for(DomElement elements: landTo.getChildElements()){
			//System.out.println(elements.getTextContent()+  " : "+ elements.getAttribute("value"));
			FitOrLandCountry tableFitCountry = new FitOrLandCountry();
			tableFitCountry.setName(elements.getTextContent().toString());
			tableFitCountry.setValue(elements.getAttribute("value").toString());
			CRUD.FitCountry(tableFitCountry);
		}

		for(DomElement elements: landCountry.getChildElements()){
			//System.out.println(elements.getTextContent()+  " : "+ elements.getAttribute("value"));
			FitOrLandTo tableFito = new FitOrLandTo();
			tableFito.setName(elements.getTextContent().toString());
			tableFito.setValue(elements.getAttribute("value").toString());
			CRUD.FitTo(tableFito);
		} 

		return "";	
	}


	public static String UpdateTour()throws Exception{
		CRUD.DeleteTable("TourCountry");
		HtmlPage currentPage = Login();

		final HtmlForm form = (HtmlForm) currentPage.getElementById("form1");

		HtmlSelect country = form.getSelectByName("ctl00$ContentPlaceHolder1$drp_tour_to"); 			//Country

		for(DomElement elements: country.getChildElements()){
			//System.out.println(elements.getTextContent()+  " : "+ elements.getAttribute("value"));
			TourCountry tableTourCountry = new TourCountry();
			tableTourCountry.setName(elements.getTextContent().toString());
			tableTourCountry.setValue(elements.getAttribute("value").toString());
			CRUD.TourCountry(tableTourCountry);
		}

		return "";
	}


}

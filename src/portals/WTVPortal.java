package portals;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlCheckBoxInput;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlHiddenInput;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlRadioButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptJobManager;

import crud.CRUD;
import tables.DomesticAirLineClass;
import tables.DomesticAirLineDestination;
import tables.DomesticAirLineOrigin;

public class WTVPortal {

	private static HtmlPage Login() throws Exception{
		WebClient webClient = new WebClient();
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setPrintContentOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.waitForBackgroundJavaScript(5000);

		HtmlPage currentPage = webClient.getPage("http://202.54.157.7/WTVholidaysandtours/BKWLTOlogin.aspx");

		final HtmlForm form = currentPage.getFormByName("aspnetForm");

		final HtmlTextInput terminalId = form.getInputByName("ctl00$cpg$txtterminalid");
		terminalId.setValueAttribute("PHMNL029737200");

		final HtmlTextInput userId = form.getInputByName("ctl00$cpg$txtloginid");
		userId.setValueAttribute("cjaguirre");

		final HtmlPasswordInput password = form.getInputByName("ctl00$cpg$txtpassword") ;
		password.setValueAttribute("182314cat");

		final HtmlSubmitInput button = form.getInputByName("ctl00$cpg$btnlogin");

		final HtmlPage page2 = button.click();

		
		
		final HtmlAnchor airDomAnchor = (HtmlAnchor) page2.getAnchorByHref("/WTVholidaysandtours/AIR-DOMESTIC.ASPX");

		HtmlPage airDomesticPage = airDomAnchor.click();
		
		
		
		return page2;
	}


	//

	public static String AirDomestic() throws Exception {


		//HtmlPage currentPage = webClient.getPage("http://202.54.157.7/WTVholidaysandtours/AIR-DOMESTIC.ASPX");


		HtmlPage currentPage = Login();

		final HtmlAnchor airDomAnchor = (HtmlAnchor) currentPage.getAnchorByHref("/WTVholidaysandtours/AIR-DOMESTIC.ASPX");

		HtmlPage airDomesticPage = airDomAnchor.click();

		//System.out.println(airDomesticPage.getWebResponse().getContentAsString());

		final HtmlForm form = airDomesticPage.getFormByName("aspnetForm");

		//System.out.println(form);

		/////////////////////////////----------//////////
		final HtmlRadioButtonInput oneWay = (HtmlRadioButtonInput) airDomesticPage.getElementById("RbtOngoingval");
		oneWay.setChecked(true);

		//final HtmlRadioButtonInput roundTrip = (HtmlRadioButtonInput) currentPage.getElementById("RbtReturnval");
		//roundTrip.setChecked(false);
		////////////////////////////-----------/////////


		final HtmlSelect origin = (HtmlSelect) airDomesticPage.getElementById("ddlfrom");
		HtmlOption optionOrigin = origin.getOptionByValue("MNL");
		origin.setSelectedAttribute(optionOrigin, true);

		final HtmlSelect destination = (HtmlSelect) airDomesticPage.getElementById("ddlto");
		HtmlOption optionDestination = destination.getOptionByValue("ZAM");
		destination.setSelectedAttribute(optionDestination, true);

		final HtmlTextInput onwardDate =(HtmlTextInput) airDomesticPage.getElementById("ddate");
		onwardDate.setValueAttribute("18/07/2017");

		final HtmlTextInput returnDate =  (HtmlTextInput)airDomesticPage.getElementById("rdate");
		returnDate.setValueAttribute("18/07/2017");

		final HtmlSelect adult = (HtmlSelect) airDomesticPage.getElementById("ddladult");
		HtmlOption optionAdult = adult.getOptionByValue("1");
		adult.setSelectedAttribute(optionAdult, true);

		final HtmlSelect child = (HtmlSelect) airDomesticPage.getElementById("ddlchild");
		HtmlOption optionChild= child.getOptionByValue("0");
		child.setSelectedAttribute(optionChild, true);

		final HtmlSelect infant = (HtmlSelect) airDomesticPage.getElementById("ddlinfant");
		HtmlOption optionInfant = infant.getOptionByValue("0");
		infant.setSelectedAttribute(optionInfant, true);

		final HtmlSelect classFlight = (HtmlSelect) airDomesticPage.getElementById("ddlclass");
		HtmlOption optionClassFlight = classFlight.getOptionByValue("2");
		classFlight.setSelectedAttribute(optionClassFlight, true);

		final HtmlCheckBoxInput chkbxHostSearch = (HtmlCheckBoxInput) airDomesticPage.getHtmlElementById("chkbxHostSearch");
		chkbxHostSearch.setChecked(false);

		final HtmlCheckBoxInput chkbxSeniorCitizen = (HtmlCheckBoxInput) airDomesticPage.getHtmlElementById("chkbxSeniorCitizen");
		chkbxSeniorCitizen.setChecked(false);

		//////////////// Check Box ///////////////////////////////////////
		String[] checkBox = {"chkAllAirlines",
				"chklstAirlines_0", "chklstAirlines_1", "chklstAirlines_2",
				"chklstAirlines_3", "chklstAirlines_4", "chklstAirlines_5", };

		HtmlCheckBoxInput[] checkBoxInput = new HtmlCheckBoxInput[checkBox.length];
		
		for(int loop=0; loop<checkBox.length; loop++){
			checkBoxInput[loop] = (HtmlCheckBoxInput) airDomesticPage.getHtmlElementById(checkBox[loop]);
			checkBoxInput[loop].setChecked(true);
		}

		/////////////////////////////////////////Hidden Input////////////////////////////
		String[] ids = {"__EVENTTARGET", "__EVENTARGUMENT", "__VIEWSTATE", "__VIEWSTATEGENERATOR",
				"__EVENTVALIDATION", "ctl00_HdnJSWrking", "HdnServerDate", "HdnBackflag",
				"HdnAllowsearch", "hdnUsertTrack", "HdnPageTrackId", "Hdnoldpop",
				"ctl00_cpg_Hdncaldate", "ctl00_cpg_HdnToday", "ctl00_cpg_HdnOrgin", "ctl00_cpg_HdnDest",
				"ctl00_HdnTerminalId", "ctl00_HdnUserName", "ctl00_HdnTerminalDetail", "ctl00_HdnHandShakeId",
				"Hidden1"};
		
		HtmlHiddenInput[] hiddenInput = new HtmlHiddenInput[ids.length];
		for(int loop=0; loop<ids.length; loop++){
			hiddenInput[loop] =(HtmlHiddenInput) airDomesticPage.getElementById(ids[loop]);
			hiddenInput[loop].setValueAttribute(airDomesticPage.getHtmlElementById(ids[loop]).getTextContent());
		}



		//final HtmlButtonInput searchButton = form.getInputByName("Search");

		final HtmlButtonInput searchButton = (HtmlButtonInput) form.getByXPath("//input[@id='Search']").get(0);

		HtmlElement submitButton = (HtmlElement) airDomesticPage.createElement("button");
		submitButton.setAttribute("type", "submit");

		form.appendChild(submitButton);

		/*final List<?> divs = airDomesticPage.getByXPath("//input");

		for(int loop = 0; loop<divs.size(); loop++){
			System.out.println(divs.get(loop));
		}
		 */


		//airDomesticPage = submitButton.click();
		airDomesticPage = searchButton.click();


		//synchronized (airDomesticPage) {
		//airDomesticPage.wait(5000);
		//}
		//webClient.waitForBackgroundJavaScript(5);


		JavaScriptJobManager manager = airDomesticPage.getEnclosingWindow().getJobManager();
		while (manager.getJobCount() > 0) {
				Thread.sleep(4000);
		}

		///////////////////  JSOUP  ///////////////////////////////////////////////////////////////
		String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";
		//Document doc = Jsoup.connect(resultFlight.getUrl().toString()).userAgent(userAgent).timeout(6000).get();
		Document doc = Jsoup.parse(airDomesticPage.asXml());
		Elements divElements = doc.select("div#OnResholder");

		//StringBuilder builder = new StringBuilder();

		for(Element ele : divElements.select("div#OngoingRes")){
			System.out.println(ele);
		}
		System.out.println("//////// LINE BREAK /////////");
		///////////////////////////


		return airDomesticPage.getWebResponse().getContentAsString();
	}

	
	
	
	
	
	
	public static String SearchDomesticAirLines() throws Exception{
		
		WebClient webClient = new WebClient();
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.waitForBackgroundJavaScript(5000);

		HtmlPage currentPage = webClient.getPage("http://202.54.157.7/WTVholidaysandtours/BKWLTOlogin.aspx");

		final HtmlForm form = currentPage.getFormByName("aspnetForm");
		
		final HtmlTextInput terminalId = form.getInputByName("ctl00$cpg$txtterminalid");
		terminalId.setValueAttribute("PHMNL029737200");

		final HtmlTextInput userId = form.getInputByName("ctl00$cpg$txtloginid");
		userId.setValueAttribute("cjaguirre");

		final HtmlPasswordInput password = form.getInputByName("ctl00$cpg$txtpassword") ;
		password.setValueAttribute("182314cat");

		final HtmlSubmitInput button = form.getInputByName("ctl00$cpg$btnlogin");

		final HtmlPage page2 = button.click();
		
		final HtmlAnchor airDomAnchor = (HtmlAnchor) page2.getAnchorByHref("/WTVholidaysandtours/AIR-DOMESTIC.ASPX");

		final HtmlPage airDomesticPage = airDomAnchor.click();
		
		//return airDomesticPage.getWebResponse().getContentAsString();
		
	
		
		final HtmlForm formSearch = (HtmlForm) airDomesticPage.getElementById("aspnetForm");
		
		HtmlSelect origin = (HtmlSelect) airDomesticPage.getElementById("ddlfrom");
		HtmlOption optionOrigin = origin.getOptionByValue("MNL");
		origin.setSelectedAttribute(optionOrigin, true);
		
		HtmlSelect destination = formSearch.getSelectByName("ddlto");
		HtmlOption optionDestination = destination.getOptionByValue("CEB");
		destination.setSelectedAttribute(optionDestination, true);
		
		final HtmlTextInput onwardDate =(HtmlTextInput) airDomesticPage.getElementById("ddate");
		onwardDate.setValueAttribute("30/07/2017");

		final HtmlTextInput returnDate =  (HtmlTextInput)airDomesticPage.getElementById("rdate");
		returnDate.setValueAttribute("30/07/2017");
		
		HtmlSelect adult = formSearch.getSelectByName("ddladult");
		HtmlOption optionAdult = adult.getOptionByValue("1");
		adult.setSelectedAttribute(optionAdult, true);
		
		HtmlSelect infant = formSearch.getSelectByName("ddlchild");
		HtmlOption optionInfant = infant.getOptionByValue("0");
		infant.setSelectedAttribute(optionInfant, true);
		
		HtmlSelect children = formSearch.getSelectByName("ddlinfant");
		HtmlOption optionChildren = children.getOptionByValue("0");
		children.setSelectedAttribute(optionChildren, true);
		
		HtmlSelect classflight = (HtmlSelect) airDomesticPage.getElementById("ddlclass");
		HtmlOption optionClassflight = classflight.getOptionByValue("2");
		classflight.setSelectedAttribute(optionClassflight, true);
		
		HtmlCheckBoxInput pal = (HtmlCheckBoxInput) airDomesticPage.getElementById("chklstAirlines_0");
		pal.setChecked(true);
		HtmlCheckBoxInput skyjet = (HtmlCheckBoxInput) airDomesticPage.getElementById("chklstAirlines_5");
		skyjet.setChecked(true);
		HtmlCheckBoxInput asiazest = (HtmlCheckBoxInput) airDomesticPage.getElementById("chklstAirlines_2");
		asiazest.setChecked(true);
		HtmlCheckBoxInput airAsia = (HtmlCheckBoxInput) airDomesticPage.getElementById("chklstAirlines_3");
		airAsia.setChecked(true);
		HtmlCheckBoxInput cebpac = (HtmlCheckBoxInput) airDomesticPage.getElementById("chklstAirlines_1");
		cebpac.setChecked(true);
		HtmlCheckBoxInput cebgo = (HtmlCheckBoxInput) airDomesticPage.getElementById("chklstAirlines_4");
		cebgo.setChecked(true);
		HtmlCheckBoxInput senior = (HtmlCheckBoxInput) airDomesticPage.getElementById("chkbxSeniorCitizen");
		senior.setChecked(false);
		
		
		final HtmlButtonInput searchButton = (HtmlButtonInput) airDomesticPage.getElementById("Search");
		final HtmlPage result = searchButton.click();
		
		
		
		return result.getWebResponse().getContentAsString();
		
		
	}
	
	
	
	
	
	
	/****************************************************************************************************
	 * Domestic Airlines 
	 * **************************************************************************************************
	 */
	public static void UpdateDomesticAirLines() throws Exception{
		
		CRUD.DeleteTable("DomesticAirLineOrigin");
		CRUD.DeleteTable("DomesticAirLineDestination");
		CRUD.DeleteTable("DomesticAirLineClass");
		
		WebClient webClient = new WebClient();
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.waitForBackgroundJavaScript(5000);

		HtmlPage currentPage = webClient.getPage("http://202.54.157.7/WTVholidaysandtours/BKWLTOlogin.aspx");

		final HtmlForm form = currentPage.getFormByName("aspnetForm");
		
		final HtmlTextInput terminalId = form.getInputByName("ctl00$cpg$txtterminalid");
		terminalId.setValueAttribute("PHMNL029737200");

		final HtmlTextInput userId = form.getInputByName("ctl00$cpg$txtloginid");
		userId.setValueAttribute("cjaguirre");

		final HtmlPasswordInput password = form.getInputByName("ctl00$cpg$txtpassword") ;
		password.setValueAttribute("182314cat");

		final HtmlSubmitInput button = form.getInputByName("ctl00$cpg$btnlogin");

		final HtmlPage page2 = button.click();
		
		final HtmlAnchor airDomAnchor = (HtmlAnchor) page2.getAnchorByHref("/WTVholidaysandtours/AIR-DOMESTIC.ASPX");

		final HtmlPage airDomesticPage = airDomAnchor.click();
		
		final HtmlForm formSearch = (HtmlForm) airDomesticPage.getElementById("aspnetForm");
		
		HtmlSelect origin = formSearch.getSelectByName("ddlfrom");
		HtmlSelect destination = formSearch.getSelectByName("ddlto");
		/*HtmlSelect adult = formSearch.getSelectByName("ddladult");
		HtmlSelect infant = formSearch.getSelectByName("ddlchild");
		HtmlSelect children = formSearch.getSelectByName("ddlinfant");*/
		HtmlSelect classflight = (HtmlSelect) airDomesticPage.getElementById("ddlclass");
		
		
		for(DomElement elements: origin.getChildElements()){
			DomesticAirLineOrigin table = new DomesticAirLineOrigin();
			table.setOriginName(elements.getTextContent().toString());
			table.setOriginValue(elements.getAttribute("value").toString());
			//System.out.println("origin : "+ nameOrigin[countOrigin]);
			CRUD.DomesticAirLinesOrigin(table);
		}
		
		for(DomElement elements: destination.getChildElements()){
			DomesticAirLineDestination table = new DomesticAirLineDestination();
			table.setDestinationName(elements.getTextContent().toString());
			table.setDestinationValue(elements.getAttribute("value").toString());
			//System.out.println("destination: "+ nameDestination[countDestination]);
			CRUD.DomesticAirLinesDestination(table);
		}
		
		/*for(DomElement elements: adult.getChildElements()){
			DomesticAirLineAdult table = new DomesticAirLineAdult();
			table.setAdultName(elements.getTextContent().toString());
			table.setAdultValue(elements.getAttribute("value").toString());
			//System.out.println("adult: "+ nameAdult[countAdult]);
			CRUD.DomesticAirLinesAdult(table);
		}
		
		for(DomElement elements: infant.getChildElements()){
			DomesticAirLineInfant table = new DomesticAirLineInfant();
			table.setInfantName(elements.getTextContent().toString());
			table.setInfantValue(elements.getAttribute("value").toString());
			//System.out.println("infant: "+ nameInfant[countInfant]);
			CRUD.DomesticAirLinesInfant(table);
		}
		
		for(DomElement elements: children.getChildElements()){
			DomesticAirLineChildren table = new DomesticAirLineChildren();
			table.setChildrenName(elements.getTextContent().toString());
			table.setChildrenValue(elements.getAttribute("value").toString());
			//System.out.println("children"+ nameChildren[countChildren]);
			CRUD.DomesticAirLinesChildren(table);
		}*/
		
		for(DomElement elements: classflight.getChildElements()){
			DomesticAirLineClass table = new DomesticAirLineClass();
			table.setClassFlightName(elements.getTextContent().toString());
			table.setClassFlightValue(elements.getAttribute("value").toString());
			//System.out.println("class: "+ nameClassflight[countClassflight]);
			CRUD.DomesticAirLinesClass(table);
		}
		
	}
	
	
	/****************************************************************************************************
	 * Bus 
	 * **************************************************************************************************
	 */
	
	/*public static void UpdateDomestBus() throws Exception{
		
		//CRUD.DeleteTable("DomesticAirLineOrigin");
		//CRUD.DeleteTable("DomesticAirLineDestination");
		//CRUD.DeleteTable("DomesticAirLineClass");
		
		WebClient webClient = new WebClient();
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.waitForBackgroundJavaScript(5000);

		HtmlPage currentPage = webClient.getPage("http://202.54.157.7/WTVholidaysandtours/BKWLTOlogin.aspx");

		final HtmlForm form = currentPage.getFormByName("aspnetForm");
		
		final HtmlTextInput terminalId = form.getInputByName("ctl00$cpg$txtterminalid");
		terminalId.setValueAttribute("PHMNL029737200");

		final HtmlTextInput userId = form.getInputByName("ctl00$cpg$txtloginid");
		userId.setValueAttribute("cjaguirre");

		final HtmlPasswordInput password = form.getInputByName("ctl00$cpg$txtpassword") ;
		password.setValueAttribute("182314cat");

		final HtmlSubmitInput button = form.getInputByName("ctl00$cpg$btnlogin");

		final HtmlPage page2 = button.click();
		
		final HtmlAnchor airDomAnchor = (HtmlAnchor) page2.getAnchorByHref("/WTVholidaysandtours/pgBusSearch.aspx" );

		final HtmlPage airDomesticPage = airDomAnchor.click();
		
		final HtmlForm formSearch = (HtmlForm) airDomesticPage.getElementById("aspnetForm");
		
		HtmlSelect origin = formSearch.getSelectByName("ddlfrom");
		HtmlSelect destination = formSearch.getSelectByName("ddlto");
		
		
	}*/
	
	
	
	
	
}

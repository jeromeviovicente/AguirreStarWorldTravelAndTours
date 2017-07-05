package controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;

@Controller
public class TestController {

	@RequestMapping(value="/test"/*, produces = MediaType.TEXT_HTML_VALUE*/)
	@ResponseBody
    public String helloWorld(HttpServletResponse response) throws Exception {
		
		/*response.setContentType("text/html");
	    response.setCharacterEncoding("UTF-8");*/
		
		WebClient webClient = new WebClient();
		
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52);
		webClient.getOptions().setPrintContentOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
		
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

	    String authpage = page2.getWebResponse().getContentAsString();
	    
	    //webClient.waitForBackgroundJavaScript(50000);
	    
        return authpage;
    }
	
	
	
	
	
	
}

package init;

import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.hibernate.Session;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import authenticaton.Login;
import dbsessions.DatabaseSession;
import encryption.Decrypt;
import encryption.Encrypt;
import encryption.GenerateIV;
import encryption.GenereateCryption;

import tables.Accounts;
import tables.Address;
import tables.Admin;
import tables.AdminSettings;
import tables.Driver;
import tables.Passenger;
import tables.TransactionHistory;
import tables.WorkingDetails;
import util.Date;

public class MainForTesting {

	public static void main(String[] args) throws Exception{
		
		//Login.AsPassenger("NewAccount", "PASSW)RD");
		//testDatabaseCreatingTables();
		//genSecretKey();
		//testGenerateCryption();
		
		
		
		
		/*WebClient webClient = new WebClient();
		
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient = new WebClient(BrowserVersion.FIREFOX_52); // depending on HtmlUnit version
		 	
		
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

	    
	    
		System.out.println(page2.getWebResponse().getContentAsString());*/
	}
	
	
	
	
	// A Method for creating all tables, 
	private static void testDatabaseCreatingTables() throws Exception{
		Session session = DatabaseSession.getInstance();
		session.beginTransaction();

		Accounts accounttable = new Accounts();
		Admin admintable = new Admin();
		AdminSettings setting = new AdminSettings();
		Driver drivertable  = new Driver();
		Passenger passengertable = new Passenger();
		Address addresstable = new Address();
		WorkingDetails workingdetailstable = new WorkingDetails();
		TransactionHistory history = new TransactionHistory();
		
		

		for(int loop = 0; loop < 6; loop++){
			if(loop == 0){
				session.save(accounttable);
				session.getTransaction().commit();
			}
			if(loop == 1){
				session.save(admintable);
				session.getTransaction().commit();
			}
			if(loop == 2){
				session.save(setting);
				session.getTransaction().commit();
			}
			if(loop == 3){
				session.save(drivertable);
				session.getTransaction().commit();
			}
			if(loop == 4){
				session.save(passengertable);
				session.getTransaction().commit();
			}
			if(loop == 5){
				session.save(addresstable);
				session.getTransaction().commit();
			}
			if(loop == 6){
				session.save(workingdetailstable);
				session.getTransaction().commit();
			}
			if(loop == 7){
				session.save(history);
				session.getTransaction().commit();
			}
		}
		
		DatabaseSession.close();
	}
	
	
	
	private static void genSecretKey() throws Exception{
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		
		SecretKey secretKey = keyGen.generateKey();
		
		String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
		
		System.out.println(encodedKey);
	}
	
	
	private static void testGenerateCryption() throws Exception{
		
		byte[] iv = GenerateIV.getIV();
		System.out.println(iv);
		
		String en = Encrypt.encrypt("", iv);
		String de = Decrypt.decrypt(en, iv);
		
		System.out.println("encrypted value :" + en);
		System.out.println("decrypted value :" + de);
		
		
		GenereateCryption.genereatecryption("");
		
	}
	
}

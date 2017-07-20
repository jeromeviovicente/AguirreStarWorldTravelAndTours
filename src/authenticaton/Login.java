package authenticaton;

import java.util.List;

import org.springframework.web.bind.annotation.SessionAttributes;

import bean.EmailAndRole;
import crud.CRUD;
import encryption.Decrypt;
import tables.Accounts;



public class Login {
	private static boolean isAuth = false;
	
	private static EmailAndRole emailAndRole;

	public static String Authenticate(String email, String password) throws Exception{
		
		List<Accounts> account ;
		
		String passwordToDecrypt =""; 	// will get the password from database
		String returnMessage = "";		// will hold  a message from Login Objcst
		String decreptPassword = "";	// will hold a decrypted value
		
		byte[] iv = null;
		
		if((account = CRUD.GetAdminAccount(email)).size() > 0){
			
			for(Accounts acc :account){
				passwordToDecrypt = acc.getPassword();
				iv = acc.getIv();
			}
			
			decreptPassword = Decrypt.decrypt(passwordToDecrypt, iv);
			
			if(decreptPassword.equals(password)){
				System.out.println("login successful");
				isAuth = true;
				returnMessage = "Login successful";
				
				
				for(Accounts as : account){
					emailAndRole = new EmailAndRole(as.getEmail(), as.getRole());
				}
				
				
				return returnMessage;
			}
			else{
				System.out.println("login failed invalid password");
				isAuth = false;
				returnMessage = "login failed, Invalid password";
				return returnMessage;
			}
		}
		else if((account = CRUD.GetPassengerAccount(email)).size() > 0){
			
			for(Accounts acc :account){
				passwordToDecrypt = acc.getPassword();
				iv = acc.getIv();
			}
			
			decreptPassword = Decrypt.decrypt(passwordToDecrypt, iv);
			
			if(decreptPassword.equals(password)){
				System.out.println("login successful");
				isAuth = true;
				returnMessage = "Login successful";
				
				for(Accounts as : account){
					emailAndRole = new EmailAndRole(as.getEmail(), as.getRole());
				}
				
				return returnMessage;
			}
			else{
				System.out.println("login failed invalid password");
				isAuth = false;
				returnMessage = "login failed, Invalid password";
				return returnMessage;
			}
		}
		else if((account = CRUD.GetDriverAccount(email)).size() > 0){
			
			for(Accounts acc :account){
				passwordToDecrypt = acc.getPassword();
				iv = acc.getIv();
			}
			
			decreptPassword = Decrypt.decrypt(passwordToDecrypt, iv);
			
			if(decreptPassword.equals(password)){
				System.out.println("login successful");
				isAuth = true;
				returnMessage = "Login successful";
				
				for(Accounts as : account){
					emailAndRole = new EmailAndRole(as.getEmail(), as.getRole());
				}
				
				return returnMessage;
			}
			else{
				System.out.println("login failed invalid password");
				isAuth = false;
				returnMessage = "login failed, Invalid password";
				return returnMessage;
			}
		}
		else if((account = CRUD.GetHomeOwnerAccount(email)).size() > 0){
			
			for(Accounts acc :account){
				passwordToDecrypt = acc.getPassword();
				iv = acc.getIv();
			}
			
			decreptPassword = Decrypt.decrypt(passwordToDecrypt, iv);
			
			if(decreptPassword.equals(password)){
				System.out.println("login successful");
				isAuth = true;
				returnMessage = "Login successful";
				
				for(Accounts as : account){
					emailAndRole = new EmailAndRole(as.getEmail(), as.getRole());
				}
				
				return returnMessage;
			}
			else{
				System.out.println("login failed invalid password");
				isAuth = false;
				returnMessage = "login failed, Invalid password";
				return returnMessage;
			}
			
		}
		else{
			
			System.out.println("No account found");
			isAuth = false;
			returnMessage = "login failed, No account found";
			return returnMessage;
		}
	}
	
	
	public static boolean isAuth(){
		return isAuth;
	}
	
	public static EmailAndRole getEmailAndRole(){
		return emailAndRole;
	}
	
	
}

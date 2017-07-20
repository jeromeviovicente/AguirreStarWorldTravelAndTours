package session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionChecker {
	
	public boolean CheckSession(HttpServletRequest sessionRequest){
		boolean ret = true;
		HttpSession session = sessionRequest.getSession();
		if((boolean) session.getAttribute("activeSession")){
			 ret = true;
		}
		else{
			 ret = false;
		}
		return ret;
	}
	
}

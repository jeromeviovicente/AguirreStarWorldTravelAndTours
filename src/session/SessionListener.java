package session;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    @SuppressWarnings("unused")
	public void sessionDestroyed(HttpSessionEvent event)  { 
         // TODO Auto-generated method stub
    	if(event != null){
    		try{
    			HttpSession session = event.getSession();
    			/*if(session.getAttribute("user")!=null){
    				String userId=(String)session.getAttribute("user");
    				ClientLogoutRequest clientlogoutReq = new ClientLogoutRequest();
    				clientlogoutReq.setUser(userId);
    				clientlogoutReq.setUserReferenceNumber(Util.getUserReferenceNumber());
    				WebServiceEndpointImplProxy WSEPIP = new WebServiceEndpointImplProxy();
    				ClientLogoutResponse clientlogoutRes= WSEPIP.BPVClientLogout(clientlogoutReq);
    			}*/
    			
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    }
}

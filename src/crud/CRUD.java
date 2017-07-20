package crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import dbsessions.DatabaseSession;
import tables.Accounts;
import tables.Address;
import tables.DomesticAirLineClass;
import tables.DomesticAirLineDestination;
import tables.DomesticAirLineOrigin;
import tables.Driver;
import tables.FitOrLandCountry;
import tables.FitOrLandTo;
import tables.GitCountry;
import tables.GitFrom;
import tables.GitTo;
import tables.Passenger;
import tables.TransactionHistory;
import tables.WorkingDetails;

public class CRUD {

	//Getting the admins account
	public static List<Accounts> GetAdminAccount(String email) throws Exception{
		List<Accounts> results = GetAccount(email, "ADMIN");
		return results;

	}

	//Getting the passenger account
	public static List<Accounts> GetPassengerAccount(String email) throws Exception{
		List<Accounts> results = GetAccount(email, "PASSENGER");
		return results;

	}

	//Getting the drivers account
	public static List<Accounts> GetDriverAccount(String email) throws Exception{
		List<Accounts> results = GetAccount(email, "DRIVER");
		return results;
	}

	//Getting the homeowners account
	public static List<Accounts> GetHomeOwnerAccount(String email) throws Exception{
		List<Accounts> results = GetAccount(email, "HOMEOWNER");
		return results;
	}


	public static List<TransactionHistory> GetAccountHistory(String accountId) throws Exception{
		List<TransactionHistory> results = GetHistory(accountId);
		return results;
	}

	public static boolean RegisterPassenger(Accounts account, Passenger passenger, Address address) throws Exception{
		if(InsertSave(account) && InsertSave(passenger) && InsertSave(address)){
			return true;
		}
		else{
			return false;
		}
	}


	public static boolean RegisterDiver(Accounts account, Driver driver, WorkingDetails workingDetails) throws Exception{
		if(InsertSave(account) && InsertSave(driver) && InsertSave(workingDetails)){
			return true;
		}
		else{
			return false;
		}
	}


	public static boolean SaveTransaction(TransactionHistory hisroty)throws Exception{
		if(InsertSave(hisroty)){
			return true;
		}
		else{
			return false;
		}
	}



	/*************************************************************************************************************
	 * CREATE or INSERT part
	 *************************************************************************************************************
	 */


	/***************************************************
	 * Insert Git Values
	 ***************************************************
	 */
	public static boolean GitFrom(GitFrom from) throws Exception{
		if(InsertSave(from)){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean GitTo(GitTo to) throws Exception{
		if(InsertSave(to)){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean GitCountry(GitCountry country) throws Exception{
		if(InsertSave(country)){
			return true;
		}
		else{
			return false;
		}
	}

	/***************************************************
	 * Insert Fit Values
	 ***************************************************
	 */
	public static boolean FitCountry(FitOrLandCountry country)throws Exception{
		if(InsertSave(country)){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean FitTo(FitOrLandTo to)throws Exception{
		if(InsertSave(to)){
			return true;
		}
		else{
			return false;
		}
	}

	/***************************************************
	 * Insert Fit Values
	 ***************************************************
	 */
	public static boolean TourCountry(tables.TourCountry country)throws Exception{
		if(InsertSave(country)){
			return true;
		}
		else{
			return false;
		}
	}

	/***************************************************
	 * Insert Fit AirLinesDomestic Entities
	 ***************************************************
	 */
	public static boolean DomesticAirLinesOrigin(DomesticAirLineOrigin origin)throws Exception{
		if(InsertSave(origin)){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean DomesticAirLinesDestination(DomesticAirLineDestination destination)throws Exception{
		if(InsertSave(destination)){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean DomesticAirLinesClass(DomesticAirLineClass classFlight)throws Exception{
		if(InsertSave(classFlight)){
			return true;
		}
		else{
			return false;
		}
	}

	/***************************************************
	 * Insert Bus Reservation
	 ***************************************************
	 */
	public static boolean BusReservation(tables.BusReservation reservation)throws Exception{
		if(InsertSave(reservation)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	private static boolean InsertSave(Object model) throws Exception{
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		session.save(model);
		session.getTransaction().commit();
		session.close();
		return true;
	}









	/*************************************************************************************************************
	 * READ Part
	 *************************************************************************************************************
	 */


	/**********************************************************************
	 * READ the account
	 **********************************************************************
	 */
	private static List<Accounts> GetAccount(String email, String role){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from Accounts where email='"+email+"' and role='"+role+"'");
		List<Accounts> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}


	/*********************************************************************
	 * 
	 * *******************************************************************
	 */
	private static List<TransactionHistory> GetHistory(String accountId){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from TransactionHistory where accountId='"+accountId+"' ");
		List<TransactionHistory> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}


	/*********************************************************************
	 * Get all the  options for Git
	 * *******************************************************************
	 */
	public static List<GitCountry> getGitCountry(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from GitCountry");
		List<GitCountry> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}

	public static List<GitFrom> getGitFrom(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from GitFrom");
		List<GitFrom> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}

	public static List<GitTo> getGitTo(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from GitTo");
		List<GitTo> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}

	/*********************************************************************
	 * Get all the  options for Fit or Land
	 * *******************************************************************
	 */
	public static List<FitOrLandCountry> getFitOrLandCountry(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from FitOrLandCountry");
		List<FitOrLandCountry> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}

	public static List<FitOrLandTo> getFitOrLandTo(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from FitOrLandTo");
		List<FitOrLandTo> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}


	/*********************************************************************
	 * Get all the  options for Tour
	 * *******************************************************************
	 */
	public static List<tables.TourCountry> getTourCountry(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from TourCountry");
		List<tables.TourCountry> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}

	
	/*********************************************************************************************************************
	 * Get all the  options for Domestic Entities
	 *********************************************************************************************************************
	 */
	
	/*********************************************************************
	 * Get all the  options for DA Origin
	 * *******************************************************************
	 */
	public static List<DomesticAirLineOrigin> getDomesticAirLineOrigin(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from DomesticAirLineOrigin");
		List<DomesticAirLineOrigin> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}
	
	public static List<DomesticAirLineDestination> getDomesticAirLineDestination(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from DomesticAirLineDestination");
		List<DomesticAirLineDestination> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}
	
	
	public static List<DomesticAirLineClass> getDomesticAirLineClass(){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from DomesticAirLineClass");
		List<DomesticAirLineClass> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}
	
	
	
	/*************************************************************************************************************
	 * UPDATE Part
	 *************************************************************************************************************
	 */




	/*************************************************************************************************************
	 * DELETE Part
	 *************************************************************************************************************
	 */


	public static boolean DeleteTable(String table)throws Exception{
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		session.createQuery("delete from "+table).executeUpdate();
		session.getTransaction().commit();
		session.close();
		return true;
	}




}

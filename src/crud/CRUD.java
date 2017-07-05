package crud;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import dbsessions.DatabaseSession;
import enumerated.Role;
import tables.Accounts;
import tables.Address;
import tables.Driver;
import tables.Passenger;
import tables.TransactionHistory;
import tables.WorkingDetails;

public class CRUD {

	//Getting the admins account
	public static List<Accounts> GetAdminAccount(String userName) throws Exception{
		List<Accounts> results = GetAccount(userName, "ADMIN");
		return results;

	}

	//Getting the passenger account
	public static List<Accounts> GetPassengerAccount(String userName) throws Exception{
		List<Accounts> results = GetAccount(userName, "PASSENGER");
		return results;

	}

	//Getting the drivers account
	public static List<Accounts> GetDriverAccount(String userName) throws Exception{
		List<Accounts> results = GetAccount(userName, "DRIVER");
		return results;
	}

	//Getting the homeowners account
	public static List<Accounts> GetHomeOwnerAccount(String userName) throws Exception{
		List<Accounts> results = GetAccount(userName, "HOMEOWNER");
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
	
	private static List<Accounts> GetAccount(String userName, String role){
		DatabaseSession databaseSession= new DatabaseSession();
		Session session = databaseSession.getInstance();
		session.beginTransaction();
		Query query = session.createQuery("from Accounts where userName='"+userName+"' and role='"+role+"'");
		List<Accounts> results = query.list();
		session.getTransaction().commit();
		session.close();
		return results;
	}

	
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
	
	
	/*************************************************************************************************************
	 * UPDATE Part
	 *************************************************************************************************************
	 */
	
	
	
	
	/*************************************************************************************************************
	 * DELETE Part
	 *************************************************************************************************************
	 */
	
	
}

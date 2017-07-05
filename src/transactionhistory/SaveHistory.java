package transactionhistory;

import crud.CRUD;
import tables.Accounts;
import tables.TransactionHistory;

public class SaveHistory {

	public static void saveToMyHistory(String action, Accounts accounts) throws Exception {
		TransactionHistory history = new TransactionHistory();
		history.setTransaction(action);
		history.setAccounts(accounts);
		
		CRUD.SaveTransaction(history);
		
	}

}

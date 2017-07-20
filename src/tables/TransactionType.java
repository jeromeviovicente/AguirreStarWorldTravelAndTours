package tables;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity()
@Table(name = "TransactionType")
public class TransactionType {
	
	/*
	 * 1. Register Account
	 * 		1.1 Passenger
	 * 		1.2 Driver or Cars Owner
	 * 		1.3 Hotel Owner
	 * 2. Flight Application
	 * 3. Tours Application	
	 * 		3.1 International Tour
	 * 		3.2 Domestic Tour
	 * 		3.3 Cruise
	 * 4. Bus Reservation
	 * 5. Car Reservation
	 * 6. Hotel Reservation
	 * 7. Visa Assistance
	 * 8. Pay Center
	 * 
	 */	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transactionId")
	private long transactionId;
	
	@Column(name = "transactionType", nullable = false)
	private String transactionType;
	
	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}

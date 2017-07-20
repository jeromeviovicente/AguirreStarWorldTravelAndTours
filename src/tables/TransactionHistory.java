package tables;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity()
@Table(name = "TransactionHistory")
public class TransactionHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotEmpty @DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "dateOfTransaction", nullable = false)
	private Date dateOfTransaction;
	
	@Column(name = "transaction", nullable = false)
	private String transaction;
	
	@Column(name = "amount", columnDefinition="Decimal(10,2) default '00.00'")
	private float amount;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Accounts accounts;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	
}

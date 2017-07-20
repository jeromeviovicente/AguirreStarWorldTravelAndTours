package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity()
@Table(name = "BusReservation")
public class BusReservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@NotEmpty
	@Column(name = "origin", nullable = false)
	private String origin;
	
	@NotEmpty
	@Column(name = "destination", nullable = false)
	private String destination;
	
	@NotEmpty @DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "date", nullable = false)
	private String date;
	
	@NotEmpty 
	@Column(name = "pax", nullable = false)
	private int pax;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Accounts accounts;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPax() {
		return pax;
	}

	public void setPax(int pax) {
		this.pax = pax;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
	
	
}

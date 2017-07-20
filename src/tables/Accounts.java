package tables;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;

import javax.persistence.Entity;

@Entity()
@Table(name = "accounts")
public class Accounts implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="accountId")
	private String accountId;
	
	@NotEmpty
	@Column(name = "password", nullable = false)
	private String password;
	
	@NotEmpty
	@Column(name = "iv", nullable = false)
	private byte[] iv;
	
	@NotEmpty @Email
	@Column(name = "email", unique = true)
	private String email;
	
	@NotEmpty
	@Column(name = "role", nullable = false)
	private String role;

	@NotEmpty
	@OneToMany(mappedBy = "accounts")
	private Set<Admin> admin;
	
	@OneToMany(mappedBy = "accounts")
	private Set<Driver> driver;
	
	@OneToMany(mappedBy = "accounts")
	private Set<Passenger> passenger;
	
	@OneToMany(mappedBy = "accounts")
	private Set<TransactionHistory> transactionHistory;
	
	@OneToMany(mappedBy = "accounts")
	private Set<AdminSettings> settings;
	
	@OneToMany(mappedBy = "accounts")
	private Set<BusReservation> busReservation;
	
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getIv() {
		return iv;
	}

	public void setIv(byte[] iv) {
		this.iv = iv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Admin> getAdmin() {
		return admin;
	}

	public void setAdmin(Set<Admin> admin) {
		this.admin = admin;
	}

	public Set<Driver> getDriver() {
		return driver;
	}

	public void setDriver(Set<Driver> driver) {
		this.driver = driver;
	}

	public Set<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(Set<Passenger> passenger) {
		this.passenger = passenger;
	}

	public Set<TransactionHistory> getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(Set<TransactionHistory> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	public Set<AdminSettings> getSettings() {
		return settings;
	}

	public void setSettings(Set<AdminSettings> settings) {
		this.settings = settings;
	}

	public Set<BusReservation> getBusReservation() {
		return busReservation;
	}

	public void setBusReservation(Set<BusReservation> busReservation) {
		this.busReservation = busReservation;
	}
	
	
	
}

package tables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;


@Entity()
@Table(name = "Address")
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="addressId")
	private int addressId;
	
	@NotEmpty
	@Column(name = "line1", nullable = false)
	private String line1;
	
	@NotEmpty
	@Column(name = "line2", nullable = false)
	private String line2;
	
	@NotEmpty
	@Column(name = "line3", nullable = false)
	private String line3;
	
	@NotEmpty 
	@Column(name = "country", nullable = false)
	private String country;
	
	@NotEmpty
	@Column(name = "state", nullable = false)
	private String state;
	
	@NotEmpty
	@Column(name = "city", nullable = false)
	private String city;
	
	@NotEmpty
	@Column(name = "zipCode", nullable = false)
	private String zipCode;
	
	@ManyToOne
	@JoinColumn(name="passengerId")
	private Passenger passenger;

	/*
	@ManyToOne
	@JoinColumn(name="driversId")
	private Driver driver;
	*/
	
	
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
}

package tables;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

@Entity()
@Table(name = "driver")
public class Driver implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="driversId")
	private String driversId;
	
	@NotEmpty
	@Column(name = "vehicleType", nullable = false)
	private String vehicleType;
	
	@NotEmpty
	@Column(name = "plateNumber", nullable = false)
	private String plateNumber;
	
	@NotEmpty
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@NotEmpty
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@NotEmpty
	@Column(name = "middleName", nullable = false)
	private String middleName;
	
	@NotEmpty @DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "birthDay", nullable = false)
	private Date birthDay;
	
	@NotEmpty
	@Column(name = "age", nullable = false)
	private int age;

	@NotEmpty
	@Column(name = "currentCity", nullable = false)
	private String currentCity;
	
	@NotEmpty
	@Column(name = "homeProvince", nullable = false)
	private String homeProvince;
	
	@NotEmpty @Size(min=11, max=11)
	@Column(name = "mobileNumber", nullable = false)
	private int mobileNumber;
	
	/*
	@OneToMany(mappedBy = "driver")
	private Set<Address> address;
	*/
	
	@NotEmpty @Size(min=11, max=11)
	@Column(name = "contactNumber", nullable = false)
	private String contactNumber;
	
	
	@OneToMany(mappedBy = "driver")
	private Set<WorkingDetails> workingdetails;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Accounts accounts;

	public String getDriversId() {
		return driversId;
	}

	public void setDriversId(String driversId) {
		this.driversId = driversId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getHomeProvince() {
		return homeProvince;
	}

	public void setHomeProvince(String homeProvince) {
		this.homeProvince = homeProvince;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Set<WorkingDetails> getWorkingdetails() {
		return workingdetails;
	}

	public void setWorkingdetails(Set<WorkingDetails> workingdetails) {
		this.workingdetails = workingdetails;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	
	
}

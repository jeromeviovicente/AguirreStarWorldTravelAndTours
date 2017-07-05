package model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class DriverModel {

private String driversId;

	@NotNull @NotEmpty
	private String userName;
	
	@NotNull @NotEmpty
	private String password;
	
	@NotNull @NotEmpty
	private String vehicleType;
	
	@NotNull @NotEmpty
	private String plateNumber;
	
	@NotNull @NotEmpty
	private String firstName;
	
	@NotNull @NotEmpty
	private String lastName;
	
	@NotNull @NotEmpty
	private String middleName;
	
	@NotNull @NotEmpty 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthDay;
	
	@NotNull @NotEmpty
	private int age;
	
	@NotNull @NotEmpty @Email
	private String emailAddress;
	
	@NotNull @NotEmpty
	private String currentCity;
	
	@NotNull @NotEmpty
	private String homeProvince;
	
	@NotEmpty
	@NotNull @Size(min=11, max=11)
	private int mobileNumber;
	
	@NotNull @NotEmpty
	private String timeAvailabilities;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public String getTimeAvailabilities() {
		return timeAvailabilities;
	}
	public void setTimeAvailabilities(String timeAvailabilities) {
		this.timeAvailabilities = timeAvailabilities;
	}
	
	
	
	
	
}

package model;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class RegisterPassengerModel {
	@NotNull @NotEmpty
	private String userName;
	
	@NotNull @NotEmpty
	private String password;
	
	@NotNull @NotEmpty
	private String firstName;
	
	@NotNull @NotEmpty
	private String lastName;
	
	@NotNull @NotEmpty
	private String middleName;
	
	@NotNull @NotEmpty @Email
	private String email;
	
	@NotNull @NotEmpty
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthDay;
	
	@NotNull @NotEmpty
	private int age;
	
	@NotNull @NotEmpty
	private String contactNumber;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
}

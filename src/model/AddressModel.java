package model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.NotEmpty;

public class AddressModel {

	@NotNull @NotEmpty
	private String line1;
	
	@NotNull @NotEmpty
	private String line2;
	
	@NotNull @NotEmpty
	private String line3;
	
	@NotNull @NotEmpty
	private String country;
	
	@NotNull @NotEmpty
	private String state;
	
	@NotNull @NotEmpty
	private String city;
	
	@NotNull @NotEmpty
	private String zipCode;
	
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

	
}

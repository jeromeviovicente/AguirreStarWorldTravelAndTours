package tables;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity()
@Table(name = "Passenger")
public class Passenger implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="passengerId")
	private String passengerId;
	
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
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@OneToMany(mappedBy = "passenger")
	private Set<Address> address;
	
	@NotEmpty @Size(min=11, max=11) 
	@Column(name = "contactNumber", nullable = false)
	private String contactNumber;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Accounts accounts;

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
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

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	
}

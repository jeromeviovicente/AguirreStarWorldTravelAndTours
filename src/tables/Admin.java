package tables;



import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.NotEmpty;

import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity()
@Table(name = "Admin")
public class Admin implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="adminId")
	private String adminId;
	
	@NotEmpty
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@NotEmpty
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@NotEmpty
	@Column(name = "middleName", nullable = false)
	private String middleName;
	
	@NotEmpty
	@Column(name = "age", nullable = false)
	private int age;
	
	@NotEmpty
	@Column(name = "employeeId", nullable = false)
	private String employeeId;
	
	@NotEmpty
	@Column(name = "employeeNumber", nullable = false)
	private String employeeNumber;
	
	@NotEmpty
	@Column(name = "department", nullable = false)
	private String department;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Accounts accounts;

	
	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	
}

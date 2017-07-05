package tables;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity()
@Table(name = "WorkingDetails")
public class WorkingDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "workingId", nullable = false)
	private long workingId;
	
	@NotEmpty
	@Column(name = "workingCities", nullable = false)
	private String workingCities;
	
	@NotEmpty
	@Column(name = "workingBarangay", nullable = false)
	private String workingBarangay;
	
	@NotEmpty
	@Column(name = "workingSubdivision", nullable = false)
	private String workingSubdivision;
	
	@NotEmpty
	@Column(name = "workingProvince", nullable = false)
	private String workingProvince;
	
	@NotEmpty
	@Column(name = "timeAvailability", nullable = false)
	private String timeAvailability;
	
	@ManyToOne
	@JoinColumn(name="driversId")
	private Driver driver;



	public long getWorkingId() {
		return workingId;
	}

	public void setWorkingId(long workingId) {
		this.workingId = workingId;
	}

	public String getWorkingCities() {
		return workingCities;
	}

	public void setWorkingCities(String workingCities) {
		this.workingCities = workingCities;
	}

	public String getWorkingBarangay() {
		return workingBarangay;
	}

	public void setWorkingBarangay(String workingBarangay) {
		this.workingBarangay = workingBarangay;
	}

	public String getWorkingSubdivision() {
		return workingSubdivision;
	}

	public void setWorkingSubdivision(String workingSubdivision) {
		this.workingSubdivision = workingSubdivision;
	}

	public String getWorkingProvince() {
		return workingProvince;
	}

	public void setWorkingProvince(String workingProvince) {
		this.workingProvince = workingProvince;
	}

	public String getTimeAvailability() {
		return timeAvailability;
	}

	public void setTimeAvailability(String timeAvailability) {
		this.timeAvailability = timeAvailability;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	
}

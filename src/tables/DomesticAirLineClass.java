package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "DomesticAirLineClass")
public class DomesticAirLineClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	
	@Column(name = "classFlightName")
	private String classFlightName;
	
	@Column(name = "classFlightValue")
	private String classFlightValue;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getClassFlightName() {
		return classFlightName;
	}

	public void setClassFlightName(String classFlightName) {
		this.classFlightName = classFlightName;
	}

	public String getClassFlightValue() {
		return classFlightValue;
	}

	public void setClassFlightValue(String classFlightValue) {
		this.classFlightValue = classFlightValue;
	}
	
	
	
}

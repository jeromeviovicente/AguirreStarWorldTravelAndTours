package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "DomesticAirLineDestination")
public class DomesticAirLineDestination {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	
	@Column(name = "destinationName")
	private String destinationName;
	
	@Column(name = "destinationValue")
	private String destinationValue;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationValue() {
		return destinationValue;
	}

	public void setDestinationValue(String destinationValue) {
		this.destinationValue = destinationValue;
	}
	
	
}

package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "DomesticAirLineOrigin")
public class DomesticAirLineOrigin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	
	@Column(name = "originName")
	private String originName;
	
	@Column(name = "originValue")
	private String originValue;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getOriginValue() {
		return originValue;
	}

	public void setOriginValue(String originValue) {
		this.originValue = originValue;
	}
	
}

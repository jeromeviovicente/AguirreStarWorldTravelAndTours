package list;

import javax.persistence.Column;

import org.hibernate.validator.NotEmpty;

public class AirDomesticEntityList {
	private String originName;
	private String originValue;
	private String destinationName;
	private String destinationValue;
	private String adultName;
	private String adultValue;
	private String childrenName;
	private String childrenValue;
	private String infantName;
	private String infantValue;
	private String classFlightName;
	private String classFlightValue;
	
	public AirDomesticEntityList(String originName, String originValue, String destinationName, String destinationValue,
			String adultName, String adultValue, String childrenName, String childrenValue, String infantName,
			String infantValue, String classFlightName, String classFlightValue) {
		super();
		this.originName = originName;
		this.originValue = originValue;
		this.destinationName = destinationName;
		this.destinationValue = destinationValue;
		this.adultName = adultName;
		this.adultValue = adultValue;
		this.childrenName = childrenName;
		this.childrenValue = childrenValue;
		this.infantName = infantName;
		this.infantValue = infantValue;
		this.classFlightName = classFlightName;
		this.classFlightValue = classFlightValue;
	}
	
	

	public String getOriginName() {
		return originName;
	}

	public String getOriginValue() {
		return originValue;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public String getDestinationValue() {
		return destinationValue;
	}

	public String getAdultName() {
		return adultName;
	}

	public String getAdultValue() {
		return adultValue;
	}

	public String getChildrenName() {
		return childrenName;
	}

	public String getChildrenValue() {
		return childrenValue;
	}

	public String getInfantName() {
		return infantName;
	}

	public String getInfantValue() {
		return infantValue;
	}

	public String getClassFlightName() {
		return classFlightName;
	}

	public String getClassFlightValue() {
		return classFlightValue;
	}
	
	
}

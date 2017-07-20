package model;

public class AirTicketingSearchModel {
	private String plan;
	private String origin;
	private String destination;
	private String onwardDate;
	private String returnDate;
	private int adult;
	private int children;
	private int infant;
	private String classFlight;
	private boolean senior;
	
	
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOnwardDate() {
		return onwardDate;
	}
	public void setOnwardDate(String onwardDate) {
		this.onwardDate = onwardDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int getAdult() {
		return adult;
	}
	public void setAdult(int adult) {
		this.adult = adult;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getInfant() {
		return infant;
	}
	public void setInfant(int infant) {
		this.infant = infant;
	}
	public String getClassFlight() {
		return classFlight;
	}
	public void setClassFlight(String classFlight) {
		this.classFlight = classFlight;
	}
	public boolean isSenior() {
		return senior;
	}
	public void setSenior(boolean senior) {
		this.senior = senior;
	}
	
	
}

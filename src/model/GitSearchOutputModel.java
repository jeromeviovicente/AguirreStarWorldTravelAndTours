package model;

public class GitSearchOutputModel {
	private String git;
	private String departure;
	private String airport;
	private String price;
	
	public GitSearchOutputModel(String git2, String date, String airport2, String price2) {
		// TODO Auto-generated constructor stub
		
		this.git = git2;
		this.departure = date;
		this.airport = airport2;
		this.price = price2;
		
	}
	
	public String getGit() {
		return git;
	}
	public String getDeparture() {
		return departure;
	}
	public String getAirport() {
		return airport;
	}
	public String getPrice() {
		return price;
	}
}

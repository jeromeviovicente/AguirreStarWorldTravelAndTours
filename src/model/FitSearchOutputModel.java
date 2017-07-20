package model;

public class FitSearchOutputModel {
	private String fit;
	private String hotel;
	private String price;
	
	public FitSearchOutputModel(String fit2, String hotel2, String price2) {
		this.fit = fit2;
		this.hotel = hotel2;
		this.price = price2;
	}
	
	public String getFit() {
		return fit;
	}
	
	public String getHotel() {
		return hotel;
	}
	
	public String getPrice() {
		return price;
	}
	
	
	
}

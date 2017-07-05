package util;

public class Date {
	private static final String[] month = { "January", "February", "March", "April",
			 								"May", "June", "July", "August", "September",
											"October", "November", "December"};
	
	
	public static String getMonth(){
		return month[new java.util.Date().getMonth()];
	}
}

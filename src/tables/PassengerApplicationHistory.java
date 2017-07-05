package tables;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.validator.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class PassengerApplicationHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="applicationId")
	private String applicationId;
	
	@NotEmpty
	@Column(name = "passportNumber", nullable = false)
	private String passportNumber;
	
	@NotEmpty
	@Column(name = "passportExpiration", nullable = false)
	private Date passportExpiration;
	
	@NotEmpty
	@Column(name = "noOfAdult", nullable = false)
	private int noOfAdult;
	
	@NotEmpty
	@Column(name = "noOfChildren", nullable = false)
	private int noOfChildren;
	
	@NotEmpty
	@Column(name = "noOfInfant", nullable = false)
	private int noOfInfant;
	
	@NotEmpty
	@Column(name = "plan", nullable = false)
	private String plan;
	
	@NotEmpty
	@Column(name = "category", nullable = false)
	private String category;
	
	@NotEmpty
	@Column(name = "flightClass", nullable = false)
	private String flightClass;
	
	@NotEmpty
	@Column(name = "origin", nullable = false)
	private String origin;
	
	@NotEmpty
	@Column(name = "destination", nullable = false)
	private String destination;
	
	@NotEmpty
	@Column(name = "airport", nullable = false)
	private String airport;
	
	@NotEmpty
	@Column(name = "departure", nullable = false)
	private Date departure;
	
	@NotEmpty
	@Column(name = "arrival", nullable = false)
	private Date arrival;
	
	@NotEmpty
	@Column(name = "duration", nullable = false)
	private String duration;
	
	@NotEmpty
	@Column(name = "departureTime", nullable = false)
	private Date departureTime;
	
	@NotEmpty
	@Column(name = "flightNumber", nullable = false)
	private String flightNumber;
	
	@NotEmpty
	@Column(name = "airlineCompany", nullable = false)
	private String airlineCompany;
	
	@NotEmpty
	@Column(name = "flightPrive", nullable = false)
	private float flightPrive;
	
	@NotEmpty
	@Column(name = "paymentMode", nullable = false)
	private String paymentMode;
	
	@NotEmpty
	@Column(name="passportNamePage", nullable=false)
    private String passportNamePage;
 
    @Lob
    @Column(name="image", nullable=false, columnDefinition="mediumblob")
    private byte[] image;
    
    @NotEmpty @DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "applicaitonDate", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date applicaitonDate;
    
    @ManyToOne
	@JoinColumn(name="passengerId")
	private Passenger passenger;
    
    
    
}

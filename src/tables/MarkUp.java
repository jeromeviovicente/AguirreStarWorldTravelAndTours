package tables;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

public class MarkUp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	
	@Column(name = "markUpValue", nullable = false, columnDefinition="Decimal(10,2) default '00.00'")
	private float markUpValue;
	
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateModified")
	private Date dateModified;
	
	@ManyToOne
	@JoinColumn(name="set_by")
	private Accounts accounts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getMarkUpValue() {
		return markUpValue;
	}

	public void setMarkUpValue(float markUpValue) {
		this.markUpValue = markUpValue;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
	
}

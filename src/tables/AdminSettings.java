package tables;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.NotEmpty;

@Entity()
@Table(name = "Settings")
public class AdminSettings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateModified")
	private Date dateModified;
	
	@NotEmpty @Column(name = "onLive", nullable = false)
	private boolean onLive;
	
	@NotEmpty @Column(name = "reason", nullable = false)
	private String reason;
	
	@ManyToOne
	@JoinColumn(name="setBy")
	private Accounts accounts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public boolean isOnLive() {
		return onLive;
	}

	public void setOnLive(boolean onLive) {
		this.onLive = onLive;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	
}

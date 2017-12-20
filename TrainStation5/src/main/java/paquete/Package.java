package paquete;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Package")
public class Package implements Serializable {

	private int packageID;
	private String description;
	@OneToOne
	private int packageState;
	@OneToOne
	private int userID;
	private int train;
	private int originStation;
	private int destinationStation;
	private Date sendDate;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPackageID() {
		return packageID;
	}

	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPackageState() {
		return packageState;
	}

	public void setPackageState(int packageState) {
		this.packageState = packageState;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getTrain() {
		return train;
	}

	public void setTrain(int train) {
		this.train = train;
	}

	public int getOriginStation() {
		return originStation;
	}

	public void setOriginStation(int originStation) {
		this.originStation = originStation;
	}

	public int getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(int destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
}
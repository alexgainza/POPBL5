package paquete;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import station.Station;
import train.Train;

@SuppressWarnings("serial")
@Entity
public class Package implements Serializable {

	private int packageID;
	private String description;
	private int packageStateID;
	private int userID;
	private Train train;
	private Station originStation;
	private Station destinationStation;
	private Date sendDate;

	@Id
	@GeneratedValue
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

	public int getPackageStateID() {
		return packageStateID;
	}

	public void setPackageStateID(int packageStateID) {
		this.packageStateID = packageStateID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrainID(Train train) {
		this.train = train;
	}

	public Station getOriginStation() {
		return originStation;
	}

	public void setOriginStation(Station originStation) {
		this.originStation = originStation;
	}

	public Station getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(Station destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
}
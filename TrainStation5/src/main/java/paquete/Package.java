package paquete;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Package")
public class Package implements Serializable {
	
	private int packageID;
	private String description;
	private int packageStateID;
	private int userID ;
	private int trainID;
	private int originStationID;
	private int destinationStationID;
	private Date sendDate;
	 
	@Id
	@GeneratedValue
	@Column(name="packageID")
	public int getPackageID() {
		return packageID;
	}
	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
	this.description = description;
	}
	@Column(name="packageStateID")
	public int getPackageStateID() {
		return packageStateID;
	}
	public void setPackageStateID(int packageStateID) {
		this.packageStateID = packageStateID;
	}
	@Column(name="userID")
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	@Column(name="trainID")
	public int getTrainID() {
		return trainID;
	}
	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}
	@Column(name="originStationID")
	public int getOriginStationID() {
		return originStationID;
	}
	public void setOriginStationID(int originStationID) {
		this.originStationID = originStationID;
	}
	@Column(name="destinationStationID")
	public int getDestinationStationID() {
		return destinationStationID;
	}
	public void setDestinationStationID(int destinationStationID) {
		this.destinationStationID = destinationStationID;
	}
	@Column (name="sendDate")
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
}
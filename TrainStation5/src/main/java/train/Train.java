package train;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Train")
public class Train implements Serializable {
	
	private int trainID;
	private int stationID;
	private int nextStationID;
	private String direction;
	private String origin;
	private String destination;
	private boolean onGoing;
	
	@Id
	@GeneratedValue
	@Column(name="trainID")
	public int getTrainID() {
		return trainID;
	}
	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}
	@Column(name="stationID")
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
	this.stationID = stationID;
	}
	@Column(name="nextStationID")
	public int getNextStationID() {
		return nextStationID;
	}
	public void setNextStationID(int nextStationID) {
	this.nextStationID = nextStationID;
	}
	@Column(name="direction")
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	@Column(name="origin")
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Column(name="destination")
	public String geDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Column(name="onGoing")
	public boolean getOnGoing() {
		return onGoing;
	}
	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}
}

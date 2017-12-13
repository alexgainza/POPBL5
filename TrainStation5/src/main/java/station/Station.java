package station;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Station")
public class Station implements Serializable {
	
	private int stationID;
	private String description;
	private int nextStationID;
	private int previousStationID ;
	private int nextExitSwitch;
	private int previousExitSwitch;
	private int nextEntrySwitch;
	private int previousEntrySwitch;
	private int park1;
	private int park2;
	private int park3;
	private int park4;
	private int nextWaitingZone;
	private int previousWaitingZone;
	private float coordinatesLat;
	private float coordinatesLng;
	 
	@Id
	@GeneratedValue
	@Column(name="stationID")
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
	this.description = description;
	}
	@Column(name="nextStationID")
	public int getNextStationID() {
		return nextStationID;
	}
	public void setNextStationID(int nextStationID) {
		this.nextStationID = nextStationID;
	}
	@Column(name="previousStationID")
	public int getPreviousStationID() {
		return previousStationID;
	}
	public void setPreviousStationID(int previousStationID) {
		this.previousStationID = previousStationID;
	}
	@Column(name="nextExitSwitch")
	public int getNextExitSwitch() {
		return nextExitSwitch;
	}
	public void setNextExitSwitch(int nextExitSwitch) {
		this.nextExitSwitch = nextExitSwitch;
	}
	@Column (name="previousExitSwitch")
	public int getSendDate() {
		return previousExitSwitch;
	}
	public void setPreviousExitSwitch(int previousExitSwitch) {
		this.previousExitSwitch = previousExitSwitch;
	}
	@Column(name="nextEntrySwitch")
	public int getNextEntrySwitch() {
		return nextEntrySwitch;
	}
	public void setNextEntrySwitch(int nextEntrySwitch) {
		this.nextEntrySwitch = nextEntrySwitch;
	}
	@Column(name="previousEntrySwitch")
	public int getPreviousEntrySwitch() {
		return previousEntrySwitch;
	}
	public void setPreviousEntrySwitch(int previousEntrySwitch) {
		this.previousEntrySwitch = previousEntrySwitch;
	}
	@Column(name="park1")
	public int getPark1() {
		return park1;
	}
	public void setPark1(int park1) {
		this.park1 = park1;
	}
	@Column(name="park2")
	public int getPark2() {
		return park2;
	}
	public void setPark2(int park2) {
		this.park2 = park2;
	}
	@Column(name="park3")
	public int getPark3() {
		return park3;
	}
	public void setPark3(int park3) {
		this.park3 = park3;
	}
	@Column(name="park4")
	public int getPark4() {
		return park4;
	}
	public void setPark4(int park4) {
		this.park4 = park4;
	}
	@Column(name="nextWaitingZone")
	public int getNextWaitingZone() {
		return nextWaitingZone;
	}
	public void setNextWaitingZone(int nextWaitingZone) {
		this.nextWaitingZone = nextWaitingZone;
	}
	@Column(name="previousWaitingZone")
	public int getPreviousWaitingZone() {
		return previousWaitingZone;
	}
	public void setPreviousWaitingZone(int previousWaitingZone) {
		this.previousWaitingZone = previousWaitingZone;
	}
	@Column(name="coordinatesLat")
	public float getCoordinatesLat() {
		return coordinatesLat;
	}
	public void setCoordinatesLat(float coordinatesLat) {
		this.coordinatesLat = coordinatesLat;
	}
	@Column(name="coordinatesLng")
	public float getCoordinatesLng() {
		return coordinatesLng;
	}
	public void setCoordinatesLng(float coordinatesLng) {
		this.coordinatesLng = coordinatesLng;
	}
}

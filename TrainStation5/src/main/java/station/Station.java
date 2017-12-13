package station;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
public class Station implements Serializable {

	private int stationID;
	private String description;
	private int nextStationID;
	private int previousStationID;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getStationID() {
		return stationID;
	}

	public void setStationID(int stationID) {
		this.stationID = stationID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNextStationID() {
		return nextStationID;
	}

	public void setNextStationID(int nextStationID) {
		this.nextStationID = nextStationID;
	}

	public int getPreviousStationID() {
		return previousStationID;
	}

	public void setPreviousStationID(int previousStationID) {
		this.previousStationID = previousStationID;
	}

	public int getNextExitSwitch() {
		return nextExitSwitch;
	}

	public void setNextExitSwitch(int nextExitSwitch) {
		this.nextExitSwitch = nextExitSwitch;
	}

	public int getSendDate() {
		return previousExitSwitch;
	}

	public void setPreviousExitSwitch(int previousExitSwitch) {
		this.previousExitSwitch = previousExitSwitch;
	}

	public int getNextEntrySwitch() {
		return nextEntrySwitch;
	}

	public void setNextEntrySwitch(int nextEntrySwitch) {
		this.nextEntrySwitch = nextEntrySwitch;
	}

	public int getPreviousEntrySwitch() {
		return previousEntrySwitch;
	}

	public void setPreviousEntrySwitch(int previousEntrySwitch) {
		this.previousEntrySwitch = previousEntrySwitch;
	}

	public int getPark1() {
		return park1;
	}

	public void setPark1(int park1) {
		this.park1 = park1;
	}

	public int getPark2() {
		return park2;
	}

	public void setPark2(int park2) {
		this.park2 = park2;
	}

	public int getPark3() {
		return park3;
	}

	public void setPark3(int park3) {
		this.park3 = park3;
	}

	public int getPark4() {
		return park4;
	}

	public void setPark4(int park4) {
		this.park4 = park4;
	}

	public int getNextWaitingZone() {
		return nextWaitingZone;
	}

	public void setNextWaitingZone(int nextWaitingZone) {
		this.nextWaitingZone = nextWaitingZone;
	}

	public int getPreviousWaitingZone() {
		return previousWaitingZone;
	}

	public void setPreviousWaitingZone(int previousWaitingZone) {
		this.previousWaitingZone = previousWaitingZone;
	}

	public float getCoordinatesLat() {
		return coordinatesLat;
	}

	public void setCoordinatesLat(float coordinatesLat) {
		this.coordinatesLat = coordinatesLat;
	}

	public float getCoordinatesLng() {
		return coordinatesLng;
	}

	public void setCoordinatesLng(float coordinatesLng) {
		this.coordinatesLng = coordinatesLng;
	}
}

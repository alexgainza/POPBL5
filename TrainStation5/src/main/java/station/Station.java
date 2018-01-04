package station;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import paquete.Package;
import station.Station;
import train.Train;

@SuppressWarnings("serial")
@Entity
@Table(name = "Station")
public class Station implements Serializable {

	@SuppressWarnings("unused")
	private static final int serialVersionUID = 3;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stationID;
	private String description;
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	private Station nextStation;
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	private Station previousStation;
	private int nextExitSwitch;
	private int previousExitSwitch;
	private int nextEntrySwitch;
	private int previousEntrySwitch;
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Train> parks = new ArrayList<>();
	private double coordinatesLat;
	private double coordinatesLng;
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Package> sendPackageList = new ArrayList<>();
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Package> deliveredPackageList = new ArrayList<>();

	public Station() {
	}

	public Station(int stationID, String description, int nextExitSwitch, int previousExitSwitch, int nextEntrySwitch,
			int previousEntrySwitch, double coordinatesLat, double coordinatesLng, Station nextStation,
			Station previousStation) {
		this.stationID = stationID;
		this.description = description;
		this.nextExitSwitch = nextExitSwitch;
		this.previousExitSwitch = previousExitSwitch;
		this.nextEntrySwitch = nextEntrySwitch;
		this.previousEntrySwitch = previousEntrySwitch;
		this.coordinatesLat = coordinatesLat;
		this.coordinatesLng = coordinatesLng;
		this.nextStation = nextStation;
		this.previousStation = previousStation;
	}

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

	public Station getNextStation() {
		return nextStation;
	}

	public void setNextStation(Station nextStation) {
		this.nextStation = nextStation;
	}

	public Station getPreviousStation() {
		return previousStation;
	}

	public void setPreviousStation(Station previousStation) {
		this.previousStation = previousStation;
	}

	public int getNextExitSwitch() {
		return nextExitSwitch;
	}

	public void setNextExitSwitch(int nextExitSwitch) {
		this.nextExitSwitch = nextExitSwitch;
	}

	public int getPreviousExitSwitch() {
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

	public Collection<Train> getParks() {
		return parks;
	}

	public void setParks(Collection<Train> parks) {
		this.parks = parks;
	}

	public double getCoordinatesLat() {
		return coordinatesLat;
	}

	public void setCoordinatesLat(double coordinatesLat) {
		this.coordinatesLat = coordinatesLat;
	}

	public double getCoordinatesLng() {
		return coordinatesLng;
	}

	public void setCoordinatesLng(double coordinatesLng) {
		this.coordinatesLng = coordinatesLng;
	}

	public Collection<Package> getSendPackageList() {
		return sendPackageList;
	}

	public void setSendPackageList(Collection<Package> sendPackageList) {
		this.sendPackageList = sendPackageList;
	}

	public Collection<Package> getDeliveredPackageList() {
		return deliveredPackageList;
	}

	public void setDeliveredPackageList(Collection<Package> deliveredPackageList) {
		this.deliveredPackageList = deliveredPackageList;
	}
}

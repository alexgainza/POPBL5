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
	@ManyToOne(fetch = FetchType.LAZY)
	private Station nextStation;
	@ManyToOne(fetch = FetchType.LAZY)
	private Station previousStation;
	private int exitSwitch;
	private int entrySwitch;
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

	public Station(int stationID, String description, int exitSwitch, int entrySwitch, double coordinatesLat, double coordinatesLng, Station nextStation,
			Station previousStation) {
		this.stationID = stationID;
		this.description = description;
		this.exitSwitch = exitSwitch;
		this.entrySwitch = entrySwitch;
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

	public int getExitSwitch() {
		return exitSwitch;
	}

	public void setExitSwitch(int exitSwitch) {
		this.exitSwitch = exitSwitch;
	}

	public int getEntrySwitch() {
		return entrySwitch;
	}

	public void setEntrySwitch(int entrySwitch) {
		this.entrySwitch = entrySwitch;
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

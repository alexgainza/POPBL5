/**
 * @file Station.java
 * @author Alex
 * @date 18/12/2017
 * @brief Station bean
 */

package station;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
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

	/**	The station id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stationID;
	/** The description. */
	private String description;
	/** The next station. */
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	private Station nextStation;
	/** The previous station. */
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	private Station previousStation;
	/** The exit switch. */
	private int exitSwitch;
	/** The entry switch. */
	private int entrySwitch;
	/** The parks. */
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Train> parks = new ArrayList<>();
	/** Latitude coordinates. */
	private double coordinatesLat;
	/** Longitude coordinates. */
	private double coordinatesLng;
	/** The send package list. */
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Package> sendPackageList = new ArrayList<>();
	/** The delivered package list. */
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Package> deliveredPackageList = new ArrayList<>();

	public Station() {
	}

	/**
	 * The constructor.
	 * @param stationID
	 * The stationID
	 * @param description
	 * The description
	 * @param exitSwitch
	 * The exitSwitch
	 * @param entrySwitch
	 * The entrySwitch
	 * @param coordinatesLat
	 * The coordinatesLat
	 * @param coordinatesLng
	 * The coordinatesLng
	 * @param nextStation
	 * The nextStation
	 * @param previousStation
	 * The previousStation
	 */
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

	/**
	 * Gets the stationID.
	 * @return stationID
	 */
	public int getStationID() {
		return stationID;
	}

	/**
	 * Sets the stationID.
	 * @param stationID
	 * The stationID
	 */
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}

	/**
	 * Gets the description.
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 * @param description
	 * The description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the nextStation.
	 * @return nextStation
	 */
	public Station getNextStation() {
		return nextStation;
	}

	/**
	 * Sets the nextStation.
	 * @param nextStation
	 * The nextStation
	 */
	public void setNextStation(Station nextStation) {
		this.nextStation = nextStation;
	}

	/**
	 * Gets the previousStation.
	 * @return previousStation
	 */
	public Station getPreviousStation() {
		return previousStation;
	}

	/**
	 * Sets the previousStation.
	 * @param previousStation
	 * The previousStation
	 */
	public void setPreviousStation(Station previousStation) {
		this.previousStation = previousStation;
	}

	/**
	 * Gets the exitSwitch.
	 * @return exitSwitch
	 */
	public int getExitSwitch() {
		return exitSwitch;
	}

	/**
	 * Sets the exitSwitch.
	 * @param exitSwitch
	 * The exitSwitch
	 */
	public void setExitSwitch(int exitSwitch) {
		this.exitSwitch = exitSwitch;
	}

	/**
	 * Gets the entrySwitch.
	 * @return entrySwitch
	 */
	public int getEntrySwitch() {
		return entrySwitch;
	}

	/**
	 * Sets the entrySwitch.
	 * @param entrySwitch
	 * The entrySwitch
	 */
	public void setEntrySwitch(int entrySwitch) {
		this.entrySwitch = entrySwitch;
	}

	/**
	 * Gets the parks.
	 * @return parks
	 */
	public Collection<Train> getParks() {
		return parks;
	}

	/**
	 * Sets the parks.
	 * @param parks
	 * The parks
	 */
	public void setParks(Collection<Train> parks) {
		this.parks = parks;
	}

	/**
	 * Gets the coordinatesLat.
	 * @return coordinatesLat
	 */
	public double getCoordinatesLat() {
		return coordinatesLat;
	}

	/**
	 * Sets the coordinatesLat.
	 * @param coordinatesLat
	 * The coordinatesLat
	 */
	public void setCoordinatesLat(double coordinatesLat) {
		this.coordinatesLat = coordinatesLat;
	}

	/**
	 * Gets the coordinatesLng.
	 * @return coordinatesLng
	 */
	public double getCoordinatesLng() {
		return coordinatesLng;
	}

	/**
	 * Sets the coordinatesLng.
	 * @param coordinatesLng
	 * The coordinatesLng
	 */
	public void setCoordinatesLng(double coordinatesLng) {
		this.coordinatesLng = coordinatesLng;
	}

	/**
	 * Gets the sendPackageList.
	 * @return sendPackageList
	 */
	public Collection<Package> getSendPackageList() {
		return sendPackageList;
	}

	/**
	 * Sets the sendPackageList.
	 * @param sendPackageList
	 * The sendPackageList
	 */
	public void setSendPackageList(Collection<Package> sendPackageList) {
		this.sendPackageList = sendPackageList;
	}

	/**
	 * Gets the deliveredPackageList.
	 * @return deliveredPackageList
	 */
	public Collection<Package> getDeliveredPackageList() {
		return deliveredPackageList;
	}

	/**
	 * Sets the deliveredPackageList.
	 * @param deliveredPackageList
	 * The deliveredPackageList
	 */
	public void setDeliveredPackageList(Collection<Package> deliveredPackageList) {
		this.deliveredPackageList = deliveredPackageList;
	}
}

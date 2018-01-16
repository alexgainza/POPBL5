/**
 * @file Train.java
 * @author Alex
 * @date 18/12/2017
 * @brief Train bean
 */

package train;

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
import rail.Rail;
import station.Station;

@Entity
@Table(name = "Train")
public class Train implements Serializable {

	@SuppressWarnings("unused")
	private static final int serialVersionUID = 4;

	/** The train id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainID;
	/** The station where the train is. */
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	private Station station;
	/** The rail where the train is. */
	@ManyToOne
	@LazyCollection(LazyCollectionOption.FALSE)
	private Rail rail;
	/** The direction. */
	private int direction;
	/** The package list. */
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Package> packageList = new ArrayList<>();
	/** The train is stopped or not. */
	private boolean onGoing;

	public Train() {
	}

	/**
	 * The constructor.
	 * @param trainID
	 * The trainID
	 * @param station
	 * The station
	 * @param direction
	 * The direction
	 */
	public Train(int trainID, Station station, int direction) {
		this.trainID = trainID;
		this.station = station;
		this.direction = direction;
	}

	/**
	 * Gets the trainID.
	 * @return trainID
	 */
	public int getTrainID() {
		return trainID;
	}

	/**
	 * Sets the trainID.
	 * @param trainID
	 * The new trainID
	 */
	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}

	/**
	 * Gets the station.
	 * @return station
	 */
	public Station getStation() {
		return station;
	}

	/**
	 * Sets the station.
	 * @param station
	 * The new station
	 */
	public void setStation(Station station) {
		this.station = station;
	}

	/**
	 * Gets the rail.
	 * @return rail
	 */
	public Rail getRail() {
		return rail;
	}

	/**
	 * Sets the rail.
	 * @param rail
	 * The new rail
	 */
	public void setRail(Rail rail) {
		this.rail = rail;
	}

	/**
	 * Gets the direction.
	 * @return direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * Sets the direction.
	 * @param direction
	 * The new direction
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * Gets the packageList.
	 * @return packageList
	 */
	public Collection<Package> getPackageList() {
		return packageList;
	}

	/**
	 * Sets the packageList.
	 * @param packageList
	 * The new packageList
	 */
	public void setPackageList(Collection<Package> packageList) {
		this.packageList = packageList;
	}

	/**
	 * Gets if the train is onGoing.
	 * @return onGoing
	 */
	public boolean isOnGoing() {
		return onGoing;
	}

	/**
	 * Sets if the train is onGoing.
	 * @param onGoing
	 * The new onGoing
	 */
	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}
}

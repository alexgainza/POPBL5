package train;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import paquete.Package;
import rail.Rail;
import station.Station;

@Entity
@Table(name = "Train")
public class Train implements Serializable {

	private static final int serialVersionUID = 4;

	@OneToMany
	private int trainID;
	@OneToOne
	private Station station;
	@OneToOne
	private Rail rail;
	private int direction;
	@ElementCollection
	private ArrayList<Package> packageList;
	private boolean onGoing;

	public Train() {
	}

	public Train(int trainID, Station station, int direction) {
		this.trainID = trainID;
		this.station = station;
		this.direction = direction;
		this.packageList = new ArrayList<Package>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTrainID() {
		return trainID;
	}

	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Rail getRail() {
		return rail;
	}

	public void setRail(Rail rail) {
		this.rail = rail;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public ArrayList<Package> getPackageList() {
		return packageList;
	}

	public void setPackageList(ArrayList<Package> packageList) {
		this.packageList = packageList;
	}

	public boolean isOnGoing() {
		return onGoing;
	}

	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}
}

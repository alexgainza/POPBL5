package train;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Train")
public class Train implements Serializable {

	@OneToMany
	private int trainID;
	@OneToOne
	private int station;
	@OneToOne
	private int rail;
	private String direction;
	private int origin;
	private int destination;
	private boolean onGoing;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTrainID() {
		return trainID;
	}

	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	public int getRail() {
		return rail;
	}

	public void setRail(int rail) {
		this.rail = rail;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public boolean getOnGoing() {
		return onGoing;
	}

	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}
}

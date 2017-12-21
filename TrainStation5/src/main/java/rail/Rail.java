package rail;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import station.Station;

@Entity
@Table(name = "Rail")
public class Rail implements Serializable {

	private static final int serialVersionUID = 2;

	@OneToOne
	private int railID;
	private boolean occupied;
	@OneToOne
	private Station previousStation;
	@OneToOne
	private Station nextStation;

	public Rail() {
	}

	public Rail(int railID, Station previousStation, Station nextStation, boolean occupied) {
		this.railID = railID;
		this.previousStation = previousStation;
		this.nextStation = nextStation;
		this.occupied = occupied;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getRailID() {
		return railID;
	}

	public void setRailID(int railID) {
		this.railID = railID;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Station getPreviousStation() {
		return previousStation;
	}

	public void setPreviousStation(Station previousStation) {
		this.previousStation = previousStation;
	}

	public Station getNextStation() {
		return nextStation;
	}

	public void setNextStation(Station nextStation) {
		this.nextStation = nextStation;
	}
}

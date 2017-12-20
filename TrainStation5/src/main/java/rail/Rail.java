package rail;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Rail")
public class Rail implements Serializable {

	@OneToOne
	private int railID;
	private boolean occupied;
	@OneToOne
	private int previousStationID;
	@OneToOne
	private int nextStationID;
	
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
	public int getPreviousStationID() {
		return previousStationID;
	}
	public void setPreviousStationID(int previousStationID) {
		this.previousStationID = previousStationID;
	}
	public int getNextStationID() {
		return nextStationID;
	}
	public void setNextStationID(int nextStationID) {
		this.nextStationID = nextStationID;
	}
}

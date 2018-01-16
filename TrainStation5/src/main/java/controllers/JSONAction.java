/**
 * @file JSONAction.java
 * @author Xanti and Alex
 * @date 26/12/2017
 * @brief JSON controller
 */

package controllers;

import java.util.ArrayList;
import java.util.List;

import rail.Rail;
import rail.RailDAO;
import station.Station;
import station.StationDAO;
import train.Train;
import train.TrainDAO;

public class JSONAction {
	/** The station list. */
	private List<Station> stationList = new ArrayList<>();
	/** Class to connect with the database the stations. */
	private StationDAO stationDAO = new StationDAO();
	/** The rail list. */
	private List<Rail> railList = new ArrayList<>();
	/** Class to connect with the database the rails. */
	private RailDAO railDAO = new RailDAO();
	/** The train list. */
	private List<Train> trainList = new ArrayList<>();
	/** Class to connect with the database the trains. */
	private TrainDAO trainDAO = new TrainDAO();

	/**
	 * Gets the station list.
	 * @return the station list
	 */
	public List<Station> getStationList() {
		return stationList;
	}

	/**
	 * Sets the new station list.
	 * @param stationList
	 * The stationList
	 */
	public void setStationList(List<Station> stationList) {
		this.stationList = stationList;
	}

	/**
	 * Gets the rail list.
	 * @return the rail list
	 */
	public List<Rail> getRailList() {
		return railList;
	}

	/**
	 * Sets the new rails list.
	 * @param railList
	 * The railList
	 */
	public void setRailList(List<Rail> railList) {
		this.railList = railList;
	}

	/**
	 * Gets the train list.
	 * @return the train list
	 */
	public List<Train> getTrainList() {
		return trainList;
	}

	/**
	 * Sets the new train list.
	 * @param trainList
	 * The trainList
	 */
	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	/**
	 * Reads the stations, rails and trains lists from the database
	 * @return a string that the lists are load correctly
	 * @throws Exception
	 * The exception
	 */
	public String execute() throws Exception {

		stationList = stationDAO.list();
		railList = railDAO.list();
		trainList = trainDAO.list();
		return "success";
	}
}

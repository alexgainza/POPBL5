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
	private List<Station> stationList = new ArrayList<>();
	private StationDAO stationDAO = new StationDAO();
	private List<Rail> railList = new ArrayList<>();
	private RailDAO railDAO = new RailDAO();
	private List<Train> trainList = new ArrayList<>();
	private TrainDAO trainDAO = new TrainDAO();

	public List<Station> getStationList() {
		return stationList;
	}

	public void setStationList(List<Station> stationList) {
		this.stationList = stationList;
	}

	public List<Rail> getRailList() {
		return railList;
	}

	public void setRailList(List<Rail> railList) {
		this.railList = railList;
	}

	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public String execute() throws Exception {

		stationList = stationDAO.list();
		railList = railDAO.list();
		trainList = trainDAO.list();
		return "success";
	}
}

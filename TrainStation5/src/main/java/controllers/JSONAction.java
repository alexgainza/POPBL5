package controllers;

import java.util.ArrayList;
import java.util.List;

import station.Station;
import station.StationDAO;

public class JSONAction {
	private List<Station> stationList = new ArrayList<Station>();
	StationDAO stationDAO = new StationDAO();

	public List<Station> getStationList() {
		return stationList;
	}

	public void setStationList(List<Station> stationList) {
		this.stationList = stationList;
	}

	public String execute() throws Exception {

		stationList = stationDAO.list();
		if (stationList == null) {
			System.out.println("ERROR LOADING STATIONS");
		}
		return "success";
	}
}

package controllers;

import java.util.ArrayList;
import java.util.List;

import rail.Rail;
import rail.RailDAO;
import station.Station;
import station.StationDAO;

public class JSONAction {
	private List<Station> stationList = new ArrayList<Station>();
	StationDAO stationDAO = new StationDAO();
	private List<Rail> railList = new ArrayList<>();
	RailDAO railDAO = new RailDAO();
	private List<Boolean> estados = new ArrayList<>();

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

	public List<Boolean> getEstados() {
		return estados;
	}

	public void setEstados(List<Boolean> estados) {
		this.estados = estados;
	}

	public String execute() throws Exception {

		stationList = stationDAO.list();
		if (stationList == null) {
			System.out.println("ERROR LOADING STATIONS");
		}
		railList = railDAO.list();
		for(int i = 0; i < railList.size();i++) {
			estados.add(railList.get(i).isOccupied());
			System.out.println(estados.get(i));
		}
		return "success";
	}
}

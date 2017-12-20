package controllers;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import station.Station;
import station.StationDAO;

@SuppressWarnings("serial")
public class MapaAction extends ActionSupport  {

	List<Station> stationList = null;
	StationDAO stationDAO = null;

	public MapaAction() {
		stationDAO = new StationDAO();
	}
	
	public String execute() {
		this.stationList = stationDAO.list();
		return SUCCESS;
	}
}

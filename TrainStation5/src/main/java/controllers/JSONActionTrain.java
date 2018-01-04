package controllers;

import java.util.ArrayList;
import java.util.List;

import station.Station;
import train.Train;
import train.TrainDAO;

public class JSONActionTrain {
	private List<Train> trainList = new ArrayList<Train>();
	TrainDAO trainDAO = new TrainDAO();
	
	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public String execute() throws Exception {

		trainList = trainDAO.list();
		if (trainList == null) {
			System.out.println("ERROR LOADING TRAINS");
		}
		return "success";
	}
}

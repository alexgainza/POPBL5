package controllers;

import java.util.ArrayList;
import java.util.List;

import train.Train;
import train.TrainDAO;

public class JSONActionTrain {

	private List<Train> trainList = new ArrayList<>();
	private TrainDAO trainDAO = new TrainDAO();

	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public String execute() throws Exception {

		trainList = trainDAO.list();
		return "success";
	}
}

package controllers;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import train.Train;
import train.TrainDAO;

@SuppressWarnings("serial")
public class TrainAction extends ActionSupport {

	private Train train;
	private List<Train> trainList;
	private int id;
	private TrainDAO trainDAO;

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TrainAction() {
	trainDAO = new TrainDAO();
	}

	public String execute() {
		this.trainList = trainDAO.list();
		return SUCCESS;
	}

	public String add() {
		try {
			Train train = getTrain();
			System.out.println(train.getTrainID());
			trainDAO.add(train);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.trainList = trainDAO.list();
		return SUCCESS;
	}

	public String list() {
		this.trainList = trainDAO.list();
		return SUCCESS;
	}

	public String delete() {
		trainDAO.delete(getId());
		return SUCCESS;
	}

	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

/**
 * @file JSONActionTrain.java
 * @author Xanti
 * @date 26/12/2017
 * @brief JSON train controller
 */

package controllers;

import java.util.ArrayList;
import java.util.List;

import train.Train;
import train.TrainDAO;

public class JSONActionTrain {

	/** The train list. */
	private List<Train> trainList = new ArrayList<>();
	/** Class to connect with the database the trains. */
	private TrainDAO trainDAO = new TrainDAO();

	/**
	 * Gets the train list.
	 *
	 * @return the train list
	 */
	public List<Train> getTrainList() {
		return trainList;
	}

	/**
	 * Sets the train list.
	 *
	 * @param trainList
	 *            the new train list
	 */
	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	/**
	 * Reads the trains list from the database
	 * @return a string that the list is load correctly
	 * @throws Exception
	 */
	public String execute() throws Exception {

		trainList = trainDAO.list();
		return "success";
	}
}

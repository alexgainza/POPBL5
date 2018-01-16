/**
 * @file UserAction.java
 * @author Alex
 * @date 13/01/2018
 * @brief User action
 */

package controllers;

import com.opensymphony.xwork2.ActionSupport;

import user.User;
import user.UserDAO;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {

	/** The entered user. */
	private User user;
	/** Class to connect the user with the database. */
	private UserDAO userDAO;

	/**
	 * Initialize the userDAO.
	 */
	public UserAction() {
		userDAO = new UserDAO();
	}

	/**
	 * Edits the entered user.
	 * @return a string that depends if the entered user is correct.  
	 */
	public String edit() {
		for(int i = 0; i < userDAO.list().size(); i++) {
			if(getUser().getUserID() != userDAO.list().get(i).getUserID()) {
				addActionError(getText("error.update"));
				return "error";
			}
		}
		if(getUser().getUserID() == 0) {
			addActionError(getText("error.emptyBlank"));
			return "error";
		}
		else if(getUser().getNombre().equals("")) {
			addActionError(getText("error.emptyBlank"));
			return "error";
		}
		else if(getUser().getApellido().equals("")) {
			addActionError(getText("error.emptyBlank"));
			return "error";
		}
		else if(getUser().getUsername().equals("")) {
			addActionError(getText("error.emptyBlank"));
			return "error";
		}
		else if(getUser().getPassword().equals("")) {
			addActionError(getText("error.emptyBlank"));
			return "error";
		}
		else if(getUser().getRole() == null) {
			addActionError(getText("error.emptyBlank"));
			return "error";
		}
		userDAO.edit(getUser());
		return SUCCESS;
	}

	/**
	 * Gets the user.
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 * @param user
	 * The user
	 */
	public void setUser(User user) {
		this.user = user;
	}
}

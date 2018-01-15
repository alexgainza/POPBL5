/**
 * @file LoginAction.java
 * @author Alex
 * @date 10/12/2017
 * @brief Login action
 */

package controllers;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import user.User;
import user.UserDAO;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	
	/** The entered username in the textfield. */
	private String username;
	/** The entered password in the textfield. */
	private String password;
	/** The user list. */
	private List<User> users;
	/** Class to connect with the database the users. */
	private UserDAO userDAO;

	/**
	 * Depends on the entered user's role it goes to a different jsp page.
	 * @return a string of the role name or error if the user is invalid.
	 */
	public String execute() {
		userDAO = new UserDAO();
		users = userDAO.list();
		
		for (User user : users) {
			if (this.username.equals(user.getUsername()) && this.password.equals(user.getPassword())) {
				if(user.getRole().getRoleID() == 1) {
					return "PHC";
				}
				else if(user.getRole().getRoleID() == 2) {
					return "Controller";
				}
				else if(user.getRole().getRoleID() == 3) {
					return "Driver";
				}
			}
		}
			
		addActionError(getText("global.error.login"));
		return "error";
	}

	/**
	 * Gets the username.
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the entered username.
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the entered password.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}

package controllers;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import user.User;
import user.UserDAO;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private List<User> users;
	private UserDAO userDAO;
	private User user;

	public String execute() {
		userDAO = new UserDAO();
		users = userDAO.list();
		
		for (int i = 0; i < users.size(); i++) {
			user = users.get(i);
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
			
		addActionError(getText("error.login"));
		return "error";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}

package controllers;

import com.opensymphony.xwork2.ActionSupport;

import user.User;
import user.UserDAO;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {

	private User user;
	private UserDAO userDAO;

	public UserAction() {
		userDAO = new UserDAO();
	}

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

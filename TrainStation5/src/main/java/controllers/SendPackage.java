package controllers;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SendPackage extends ActionSupport {

	private String number;
	
	public String execute() {
		System.out.println(number);
		return "success";
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

package controllers;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SendPackage extends ActionSupport {

	private List<String> numberList;
	private int number;

	public SendPackage() {
		numberList = new ArrayList<>();
		numberList.add("1");
		numberList.add("2");
		numberList.add("3");
		numberList.add("4");
		numberList.add("5");
	}
	
	public String execute() {
		return "success";
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<String> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<String> numberList) {
		this.numberList = numberList;
	}
}

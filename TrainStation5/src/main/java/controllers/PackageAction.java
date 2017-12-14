package controllers;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import paquete.Package;
import paquete.PackageDAO;

@SuppressWarnings("serial")
public class PackageAction extends ActionSupport {

	private Package paquete;
	private List<Package> packageList;
	private int id;
	private PackageDAO packageDAO;
	
	public Package getPaquete() {
		return paquete;
	}

	public void setPaquete(Package paquete) {
		this.paquete = paquete;
	}

	public PackageAction() {
	packageDAO = new PackageDAO();
	}

	public String execute() {
		this.packageList = packageDAO.list();
		return SUCCESS;
	}

	public String add() {
		try {
			Package paquete = getPaquete();
			packageDAO.add(paquete);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.packageList = packageDAO.list();
		return SUCCESS;
	}

	public String list() {
		this.packageList = packageDAO.list();
		return SUCCESS;
	}

	public String delete() {
		packageDAO.delete(getId());
		return SUCCESS;
	}
	
	public String edit() {
		packageDAO.edit(getPaquete(), getPaquete().getPackageID());
		return SUCCESS;
	}

	public List<Package> getPackageList() {
		return packageList;
	}

	public void setPackageList(List<Package> packageList) {
		this.packageList = packageList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

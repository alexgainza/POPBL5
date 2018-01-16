/**
 * @file PackageAction.java
 * @author Alex
 * @date 15/12/2017
 * @brief Package action
 */

package controllers;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import paquete.Package;
import paquete.PackageDAO;

@SuppressWarnings("serial")
public class PackageAction extends ActionSupport {

	/** The new package. */
	private Package paquete;
	/** The package list. */
	private List<Package> packageList;
	/** Class to connect the package with the database. */
	private PackageDAO packageDAO;

	/**
	 * Gets the new package.
	 * @return paquete
	 */
	public Package getPaquete() {
		return paquete;
	}

	/**
	 * Sets the package.
	 * @param paquete
	 * The package
	 */
	public void setPaquete(Package paquete) {
		this.paquete = paquete;
	}	

	/**
	 * Initialize the packageDAO.
	 */
	public PackageAction() {
		packageDAO = new PackageDAO();
	}

	/**
	 * Load the package list from the database.
	 * @return SUCCESS to load the jsp page.
	 */
	public String execute() {
		this.packageList = packageDAO.list();
		return SUCCESS;
	}

	/**
	 * Add the new package to the database.
	 * @return SUCCESS
	 */
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

	/**
	 * Gets the package list.
	 * @return packageList
	 */
	public List<Package> getPackageList() {
		return packageList;
	}

	/**
	 * Sets the list of packages.
	 * @param packageList
	 * The packageList
	 */
	public void setPackageList(List<Package> packageList) {
		this.packageList = packageList;
	}
}

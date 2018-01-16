/**
 * @file LocaleAction.java
 * @author Alex
 * @date 14/01/2018
 * @brief Localization action
 */

package controllers;



import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LocaleAction extends ActionSupport {

	/** Last jsp direction. */
	private String referer;

	/**
	 * Change language and load the jsp where it was called from.
	 * @return a string to load the corresponding jsp page.
	 */
	public String execute() {
		/*HttpServletRequest request = ServletActionContext.getRequest();
		referer = request.getHeader("referer");
		referer = referer.substring(referer.lastIndexOf("/") + 1);
		if (referer.endsWith(".jsp") || referer.isEmpty()) {
			return "LOGIN";
		}*/
		return SUCCESS;
	}

	/**
	 * Gets the referer.
	 * @return referer
	 */
	public String getReferer() {
		return referer;
	}

	/**
	 * Sets the referer
	 * @param referer
	 * The referer
	 */
	public void setReferer(String referer) {
		this.referer = referer;
	}
}

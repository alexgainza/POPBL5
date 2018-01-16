/**
 * @file RailDAO.java
 * @author Alex
 * @date 18/12/2017
 * @brief Rail DAO
 */

package rail;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class RailDAO {

	/**
	 * Add the rail in the database.
	 * @param rail
	 * The rail
	 * @return rail
	 */
	public Rail add(Rail rail) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.save(rail);
		session.getTransaction().commit();
		session.close();
		return rail;
	}

	/**
	 * Gets the rail list from the database.
	 * @return rails
	 */
	@SuppressWarnings("unchecked")
	public List<Rail> list() {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		List<Rail> rails = null;
		try {
			rails = (List<Rail>) session.createQuery("from Rail").list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return rails;
	}
}

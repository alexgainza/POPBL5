/**
 * @file PackageDAO.java
 * @author Alex
 * @date 15/12/2017
 * @brief Package DAO
 */

package paquete;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class PackageDAO {
	
	/**
	 * Add the package in database.
	 * @param paquete
	 * @return paquete
	 */
	public Package add(Package paquete) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.save(paquete);
		session.getTransaction().commit();
		session.close();
		return paquete;
	}
	
	/**
	 * Gets the package list from the database.
	 * @return packages
	 */
	@SuppressWarnings("unchecked")
	public List<Package> list() {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		List<Package> packages = null;
		try {
			packages = (List<Package>) session.createQuery("from Package").list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return packages;
	}
}

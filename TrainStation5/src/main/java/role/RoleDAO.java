/**
 * @file RoleDAO.java
 * @author Alex
 * @date 18/12/2017
 * @brief Role DAO
 */

package role;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class RoleDAO {

	/**
	 * Add the role in database.
	 * 
	 * @param role
	 * @return role
	 */
	public Role add(Role role) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.save(role);
		session.getTransaction().commit();
		session.close();
		return role;
	}

	/**
	 * Gets the role list from the database.
	 * 
	 * @return roles
	 */
	@SuppressWarnings("unchecked")
	public List<Role> list() {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		List<Role> roles = null;
		try {
			roles = (List<Role>) session.createQuery("from Role").list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return roles;
	}
}

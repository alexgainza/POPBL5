/**
 * @file HibernateUtil.java
 * @author Alex
 * @date 20/12/2017
 * @brief Hibernate connection
 */

package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@SuppressWarnings("unused")
public class HibernateUtil {
	
	/** The session factory. */
	private static SessionFactory sessionFactory;
	/** The session. */
	private static Session session;

	/**
	 * Creates the connection.
	 * @return session.
	 */
	public static Session createSessionFactory() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		return session;
	}
}
/**
 * @file TrainDAO.java
 * @author Alex
 * @date 18/12/2017
 * @brief Train DAO
 */

package train;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class TrainDAO {

	/**
	 * Add the train in the database.
	 * @param train
	 * @return train
	 */
	public Train add(Train train) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.save(train);
		session.getTransaction().commit();
		session.close();
		return train;
	}

	/**
	 * Gets the train list from the database.
	 * @return trains
	 */
	@SuppressWarnings("unchecked")
	public List<Train> list() {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		List<Train> trains = null;
		try {
			trains = (List<Train>) session.createQuery("from Train").list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return trains;
	}
}

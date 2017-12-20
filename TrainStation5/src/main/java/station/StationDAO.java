package station;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class StationDAO {

	// For adding items in the Package table.
	public Station add(Station station) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.save(station);
		session.getTransaction().commit();
		session.close();
		return station;
	}

	// For deleting item from Package table.
	public Station delete(int id) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		Station stations = (Station) session.load(Station.class, id);
		if (null != stations) {
			session.delete(stations);
		}
		session.getTransaction().commit();
		session.close();
		return stations;
	}
	
	public Station edit(Station station, int id) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		Station station1 = session.get(Station.class, id);
		station1 = station;
		if(station1 != null) {
			session.update(station1);
		}
		session.getTransaction().commit();
		session.close();
		return station;
	}

	// For generating , executing hibernate select query and returns packages as a
	// list.
	@SuppressWarnings("unchecked")
	public List<Station> list() {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		List<Station> stations = null;
		try {
			stations = (List<Station>) session.createQuery("from Station").list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		session.close();
		return stations;
	}
}

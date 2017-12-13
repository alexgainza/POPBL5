package paquete;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.HibernateUtil;

public class PackageDAO {
	
	// For adding items in the Package table.
	public Package add(Package paquete) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.save(paquete);;
		session.getTransaction().commit();
		session.close();
		return paquete;
	}

	// For deleting item from Package table.
	public Package delete(int id) {
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		Package paquete = (Package) session.load(Package.class, id);
		if (null != paquete) {
			session.delete(paquete);
		}
		session.getTransaction().commit();
		session.close();
		return paquete;
	}
	
	// For generating , executing hibernate select query and returns packages as a
	// list.
	@SuppressWarnings("unchecked")
	public List<Package> list() {
		//Session session = HibernateUtil.createSessionFactory();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
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

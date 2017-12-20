package packageState;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class PackageStateDao {
	// For adding items in the Package table.
		public PackageState add(PackageState packageState) {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			session.save(packageState);
			session.getTransaction().commit();
			session.close();
			return packageState;
		}

		// For deleting item from Package table.
		public PackageState delete(int id) {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			PackageState packageState = session.get(PackageState.class, id);
			if (packageState != null) {
				session.delete(packageState);
			}
			session.getTransaction().commit();
			session.close();
			return packageState;
		}
		
		public PackageState edit(PackageState packageState, int id) {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			PackageState paqueteState1 = session.get(PackageState.class, id);
			paqueteState1 = packageState;
			if(paqueteState1 != null) {
				session.update(paqueteState1);
			}
			session.getTransaction().commit();
			session.close();
			return packageState;
		}
		
		// For generating , executing hibernate select query and returns packages as a
		// list.
		@SuppressWarnings("unchecked")
		public List<PackageState> list() {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			List<PackageState> packageStates = null;
			try {
				packageStates = (List<PackageState>) session.createQuery("from PackageState").list();

			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			session.close();
			return packageStates;
		}
}

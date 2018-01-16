package user;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;

public class UserDAO {

	// For adding items in the Package table.
		public User add(User user) {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			return user;
		}

		// For deleting item from Package table.
		public User delete(int id) {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			User user = session.get(User.class, id);
			if (user != null) {
				session.delete(user);
			}
			session.getTransaction().commit();
			session.close();
			return user;
		}
		
		public void edit(User user) {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();	
			session.update(user);
			session.getTransaction().commit();
			session.close();
		}
		
		// For generating , executing hibernate select query and returns packages as a
		// list.
		@SuppressWarnings("unchecked")
		public List<User> list() {
			Session session = HibernateUtil.createSessionFactory();
			session.beginTransaction();
			List<User> users = null;
			try {
				users = (List<User>) session.createQuery("from User").list();

			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			session.close();
			return users;
		}
}

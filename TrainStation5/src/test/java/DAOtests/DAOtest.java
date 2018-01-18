package DAOtests;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import hibernate.HibernateUtil;
import paquete.Package;
import paquete.PackageDAO;
import rail.Rail;
import rail.RailDAO;
import role.Role;
import role.RoleDAO;
import station.Station;
import station.StationDAO;
import train.Train;
import train.TrainDAO;
import user.User;
import user.UserDAO;

public class DAOtest {
	PackageDAO packageDAO;
	RailDAO railDAO;
	RoleDAO roleDAO;
	StationDAO stationDAO;
	TrainDAO trainDAO;
	UserDAO userDAO;

	@Before
	public void setUp() {
		packageDAO = new PackageDAO();
		railDAO = new RailDAO();
		roleDAO = new RoleDAO();
		stationDAO = new StationDAO();
		trainDAO = new TrainDAO();
		userDAO = new UserDAO();
	}

	@Test
	public void testPackageAdd() {
		int numPaquetes = packageDAO.list().size();
		Package paquete = new Package();
		packageDAO.add(paquete);
		assertEquals(numPaquetes + 1, packageDAO.list().size());

		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.delete(paquete);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testRailAdd() {
		int numRails = railDAO.list().size();
		Rail rail = new Rail();
		railDAO.add(rail);
		assertEquals(numRails + 1, railDAO.list().size());

		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.delete(rail);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testRoleAdd() {
		int numRoles = roleDAO.list().size();
		Role role = new Role();
		roleDAO.add(role);
		assertEquals(numRoles + 1, roleDAO.list().size());

		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.delete(role);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testStationAdd() {
		int numStations = stationDAO.list().size();
		Station station = new Station();
		stationDAO.add(station);
		assertEquals(numStations + 1, stationDAO.list().size());

		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.delete(station);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testTrainAdd() {
		int numTrains = trainDAO.list().size();
		Train train = new Train();
		trainDAO.add(train);
		assertEquals(numTrains + 1, trainDAO.list().size());

		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.delete(train);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testUserAdd() {
		int numUsers = userDAO.list().size();
		User user = new User();
		userDAO.add(user);
		assertEquals(numUsers + 1, userDAO.list().size());

		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	}
	@Test
	public void testUserDelete() {
		int id = 0;
		User user = new User();
		UserDAO userDAO = new UserDAO();
		userDAO.add(user);
		for(User userRecorred: userDAO.list()) {
			if(user.getNombre()==null) {
				id = userRecorred.getUserID();
			}
		}
		int numUsers = userDAO.list().size();
		userDAO.delete(id);
		assertEquals(numUsers - 1, userDAO.list().size());
	}
}

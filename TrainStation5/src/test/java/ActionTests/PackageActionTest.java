package ActionTests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Locale;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.PackageAction;
import hibernate.HibernateUtil;
import paquete.Package;

public class PackageActionTest {
	ActionContext actionContext;
	PackageAction packageAction;
	Package paquete;
	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		packageAction = Mockito.spy(new PackageAction());
		Mockito.doReturn(new Locale("en")).when(packageAction).getLocale();
		ActionContext.setContext(actionContext);
		paquete = new Package();
	}

	@Test
	public void executeTest() {
		assertEquals("success", packageAction.execute());
	}
	@Test
	public void addPackageTest() {
		packageAction.setPaquete(paquete);
		assertEquals("success", packageAction.add());
		
		Session session = HibernateUtil.createSessionFactory();
		session.beginTransaction();	
		session.delete(paquete);
		session.getTransaction().commit();
		session.close();
	}
}

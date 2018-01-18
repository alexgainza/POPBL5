package ActionTests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.PackageAction;
import controllers.PageAction;


public class PageActionTest {
	ActionContext actionContext;
	PageAction pageAction;
	Package paquete;
	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		pageAction = Mockito.spy(new PageAction());
		ActionContext.setContext(actionContext);
	}

	@Test
	public void exitPackageTest() {
		assertEquals("success", pageAction.exitPackage());
	}
	@Test
	public void logoutTest() {
		assertEquals("success", pageAction.logout());
	}
	@Test
	public void seeStatsTest() {
		assertEquals("success", pageAction.seeStats());
	}
	@Test
	public void sendPackageTest() {
		assertEquals("success", pageAction.sendPackage());
	}
	@Test
	public void settingsTest() {
		assertEquals("success", pageAction.settings());
	}
}

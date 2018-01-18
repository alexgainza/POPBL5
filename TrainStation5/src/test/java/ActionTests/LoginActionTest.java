package ActionTests;

import java.util.HashMap;
import java.util.Locale;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.LoginAction;
import junit.framework.TestCase;

public class LoginActionTest{

	ActionContext actionContext;
	LoginAction loginAction;

	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		loginAction = Mockito.spy(new LoginAction());
		Mockito.doReturn(new Locale("en")).when(loginAction).getLocale();
		Mockito.doReturn("Invalid usernmae/password. Try again.").when(loginAction).getText("global.error.login");
		ActionContext.setContext(actionContext);
	}

	@Test
	public void testIncorrectUserLogin() {
		loginAction.setUsername("incorrect");
		loginAction.setPassword("1111");
		loginAction.execute();
		assertEquals(1, loginAction.getActionErrors().size());
	}

	@Test
	public void testIncorrectPasswordLogin() {
		loginAction.setUsername("xantileonet");
		loginAction.setPassword("incorrect");
		loginAction.execute();
		assertEquals(1, loginAction.getActionErrors().size());
	}
	
	@Test
	public void testIncorrectRole() {
		loginAction.setUsername("xantileonet");
		loginAction.setPassword("incorrect");
		loginAction.execute();
		assertEquals(1, loginAction.getActionErrors().size());
	}
	
	@Test
	public void testCorrectLoginPHC() {
		loginAction.setUsername("xantileonet");
		loginAction.setPassword("2222");
		assertEquals("PHC", loginAction.execute());
	}

	@Test
	public void testCorrectLoginController() {
		loginAction.setUsername("alexgainza");
		loginAction.setPassword("1111");
		assertEquals("Driver", loginAction.execute());
	}

	@Test
	public void testCorrectLoginDriver() {
		loginAction.setUsername("aitorvidarte");
		loginAction.setPassword("3333");
		assertEquals("Controller", loginAction.execute());
	}
}

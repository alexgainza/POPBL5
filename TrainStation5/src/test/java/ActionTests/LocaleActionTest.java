package ActionTests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.JSONAction;
import controllers.LocaleAction;

public class LocaleActionTest {
	ActionContext actionContext;
	LocaleAction localeAction;
	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		localeAction = Mockito.spy(new LocaleAction());
		ActionContext.setContext(actionContext);
	}

	@Test
	public void executeTest() {
		try {
			assertEquals("success", localeAction.execute());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package ActionTests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.JSONAction;

public class JSONActionTest {
	ActionContext actionContext;
	JSONAction JSONAction;
	
	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		JSONAction = Mockito.spy(new JSONAction());
		ActionContext.setContext(actionContext);
	}

	@Test
	public void executeTest() {
		try {
			assertEquals("success", JSONAction.execute());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

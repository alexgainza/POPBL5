package ActionTests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.JSONAction;
import controllers.JSONActionTrain;

public class JSONActionTrainTest {
	ActionContext actionContext;
	JSONActionTrain JSONActionTrain;
	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		JSONActionTrain = Mockito.spy(new JSONActionTrain());
		ActionContext.setContext(actionContext);
	}

	@Test
	public void executeTest() {
		try {
			assertEquals("success", JSONActionTrain.execute());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

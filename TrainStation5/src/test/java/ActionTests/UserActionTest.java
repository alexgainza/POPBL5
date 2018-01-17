package ActionTests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.opensymphony.xwork2.ActionContext;

import controllers.LoginAction;
import controllers.UserAction;
import junit.framework.TestCase;
import role.Role;
import user.User;

public class UserActionTest extends TestCase {

	ActionContext actionContext;
	UserAction userAction;
	User incorrectUser, correctUser;
	Role role;
	@Before
	public void setUp() {
		actionContext = Mockito.mock(ActionContext.class);
		Mockito.when(actionContext.getSession()).thenReturn(new HashMap<>());
		userAction = Mockito.spy(new UserAction());
		Mockito.doReturn(new Locale("en")).when(userAction).getLocale();
		Mockito.doReturn("error.update").when(userAction).getText("error.update");
		Mockito.doReturn("error.emptyBlank").when(userAction).getText("error.emptyBlank");
		role = new Role();
		role.setDescription("PHC");
		role.setRoleID(1);
		incorrectUser = createUser(4,"Usuario", "Incorrecto", "password", "User", role);
		correctUser = createUser(2,"Xanti","Leonet","2222","xantileonet",role);
		
		ActionContext.setContext(actionContext);
	}
	@Test
	public void testCorrectUserUpdate() {		
		userAction.setUser(correctUser);
		assertEquals("success", userAction.edit());
	}
	@Test
	public void testIncorrectUser() {		
		userAction.setUser(incorrectUser);
		assertEquals("error", userAction.edit());
	}
	@Test
	public void testEmptyID() {
		correctUser.setUserID(0);
		userAction.setUser(correctUser);
		assertEquals("error", userAction.edit());
	}
	@Test
	public void testEmptyNombre() {	
		correctUser.setNombre("");;
		userAction.setUser(correctUser);
		assertEquals("error", userAction.edit());
	}
	@Test
	public void testEmptyApellido() {	
		correctUser.setApellido("");
		userAction.setUser(correctUser);
		assertEquals("error", userAction.edit());
	}
	
	@Test
	public void testEmptyUsername() {	
		correctUser.setUsername("");
		userAction.setUser(correctUser);
		assertEquals("error", userAction.edit());
	}
	
	@Test
	public void testEmptyPassword() {	
		correctUser.setPassword("");
		userAction.setUser(correctUser);
		assertEquals("error", userAction.edit());
	}
	@Test
	public void testEmptyRole() {	
		correctUser.setRole(null);
		userAction.setUser(correctUser);
		assertEquals("error", userAction.edit());
	}
	
	public User createUser(int id, String nombre, String apellido, String password, String username, Role role) {
		User newUser = new User();
		newUser.setUserID(id);
		newUser.setNombre(nombre);
		newUser.setApellido(apellido);
		newUser.setPassword(password);
		newUser.setUsername("username");	
		newUser.setRole(role);
		return newUser;
	}
	
}

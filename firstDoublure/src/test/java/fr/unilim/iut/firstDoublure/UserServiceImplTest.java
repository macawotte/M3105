package fr.unilim.iut.firstDoublure;

import static org.mockito.Mockito.mock;  

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class UserServiceImplTest {

	@Test
	public void should_create_user_with_hashed_password() {
		    UserService userService = mock(UserService.class);
    		UserService userService = new UserServiceImpl(???);
     	
    		User user = userService.createUser("Bob", "secret");

     		assertEquals(user.firstName(), "Bob"); 
     		assertEquals(user.hashedPassword(), "???"); 
	}
}

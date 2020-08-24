package yaksha;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static yaksha.TestUtils.*;

import java.io.IOException;
class MainClassTest {
	@Test
	void testCheckUserLogin() throws IOException {
		//Test will pass
		User user1 = new User("admin","1234");
		User user2 = new User("admin","admin");
	  //  Assertions.assertEquals(true, MainClass.checkUser(user1));
	 //   Assertions.assertEquals(false, MainClass.checkUser(user2));
		
		yakshaAssert(currentTest(),(MainClass.checkUser(user1)==true ? "true" : "false") , businessTestFile);
	}
}

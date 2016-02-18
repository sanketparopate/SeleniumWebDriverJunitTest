package Assignments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


@SuppressWarnings("deprecation")
public class Module2Assignment1 {
	private Selenium selenium;


	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox", "https://www.facebook.com/");
		selenium.start();
	}

	@Test
	public void testModule2_Assignment1() throws Exception {
		selenium.open("/");
		assertTrue(selenium.isElementPresent("id=email"));
		assertTrue(selenium.isElementPresent("id=pass"));
		selenium.type("id=email", "emailid@domain.com");
		selenium.type("id=pass", "facebookpassword");
		assertEquals("emailid@domain.com", selenium.getValue("id=email"));
		//selenium.click("id=u_0_n");
		//selenium.waitForPageToLoad("30000");
	}

/*	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}*/
}

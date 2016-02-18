package Assignments; 

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Module3Assignment1_IE {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.ie.driver", "D:/Edureka/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.gmail.com/intl/en/mail/help/about.html");
	

}
}


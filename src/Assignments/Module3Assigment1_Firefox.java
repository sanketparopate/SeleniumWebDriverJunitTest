package Assignments;  


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module3Assigment1_Firefox {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://university.mongodb.com");
	}
	
/*	@Test
	public void homePage() throws Exception {
	    final WebClient webClient = new WebClient();
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
	        Assert.assertEquals("HtmlUnit - Welcome to HtmlUnit", page.getTitleText());

	        final String pageAsXml = page.asXml();
	        Assert.assertTrue(pageAsXml.contains("<body class=\"composite\">"));

	        final String pageAsText = page.asText();
	        Assert.assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
	    }*/
	}




package com.junit.module6;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MicrosoftSiteTest {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {
		driver.get("http://www.edureka.co/");
		String pageTitle = driver.getTitle();
		Assert.assertTrue("The Page title " , pageTitle.equals("InInstructor Led Online Courses with 24x7 On-Demand Support | Edureka"));
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}

}

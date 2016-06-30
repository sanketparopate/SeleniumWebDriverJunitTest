package com.junit.module6;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJunitTest {
	WebDriver driver;

	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get("http://www.seleniumframework.com/Practiceform");
		WebElement vHeading = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/h2"));
		String vText = vHeading.getText();
		Assert.assertEquals("Practice Form Controls", vText);
	}
	
	@After
	public void teardown(){
		driver.quit();
	}

}

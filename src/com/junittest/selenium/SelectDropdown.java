package com.junittest.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropdown {
	
	WebDriver driver;
	@BeforeMethod

	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test(groups ={"browser"})
	public void testDropdown(){
		
		driver.get("http://www.seleniumframework.com/Practiceform");
		WebElement select = driver.findElement(By.id("vfb-12"));
		List<WebElement> options = select.findElements(By.tagName("option"));

		for (WebElement option : options) {

		if("Option 2".equals(option.getText().trim()))

		 option.click();   
		}
	}

}

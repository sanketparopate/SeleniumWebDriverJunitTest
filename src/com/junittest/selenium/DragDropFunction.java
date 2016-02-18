package com.junittest.selenium; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropFunction {

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
		//driver.quit();
	}

	@Test(groups ={"browser"})
	public void test() throws Exception {
		driver.get("http://www.seleniumframework.com/Practiceform");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement dragFrom = driver.findElement(By.id("draga"));		//Source object
		WebElement dragTo = driver.findElement(By.id("dragb"));
		
		Actions objectBuilder = new Actions(driver);
		
		Actions dragnDrop = objectBuilder.clickAndHold(dragFrom);
			objectBuilder.moveToElement(dragTo);
			objectBuilder.release(dragTo);
			objectBuilder.build();
			dragnDrop.perform();
			Thread.sleep(5000);
				
	}
}


package com.junit.module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverEvent {
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
	public void hoverTest(){
		String level1 ="//*[@id='main-nav']/li[2]/a/span";
		String level2 = "//*[@id='main-nav']/li[2]/ul/li[2]/a";
		driver.get("http://www.toolsqa.com/");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath(level1));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(level2))).click().build().perform();
			
	}

}

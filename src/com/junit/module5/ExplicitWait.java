package com.junit.module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test(groups ={"browser"})
	public void testDropdown(){
		driver.get("http://www.store.demoqa.com");
		WebDriverWait eWait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.xpath("//*[@id='account']/a")).click();
		WebElement element = eWait.until(ExpectedConditions.elementToBeClickable(By.id("log")));	//wait for element to be clickable
		element.sendKeys("sanket");
		driver.findElement(By.id("pwd")).sendKeys("sanket12345");
		driver.findElement(By.id("login")).click();
		WebElement siteAdmin = eWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Site Admin")));	//waiting for presence of element
		siteAdmin.click();
		
		
				 
		}
	}



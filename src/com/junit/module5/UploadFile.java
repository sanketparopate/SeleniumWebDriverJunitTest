package com.junit.module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFile {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//	}
	
	@Test
	public void testUpload() throws InterruptedException 
	{
		Boolean alert = new Boolean(true);
		String xChooseFile ="//*[@id='uploadname1']";
		String xBeginUpload ="//*[@id='uploadbutton']";
		String URL = "https://encodable.com/uploaddemo/";
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath(xChooseFile));
		element.sendKeys("D:/FileForUpload/test.txt");
		
		Boolean alertCheck = isAlertPresent();
		if (alertCheck ==  alert){
			driver.switchTo().alert().accept();
			System.out.println("Alert present");
			driver.findElement(By.xpath(xBeginUpload)).click();
			System.out.println("Click performed after accept");
		}
		
		driver.findElement(By.xpath(xBeginUpload)).click();
		Thread.sleep(200);
		
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("uploaderpage")));
		
		AssertJUnit.assertTrue(myDynamicElement.isDisplayed());
			
	}	
	
	public Boolean isAlertPresent(){
	    Boolean foundAlert = false;
	    WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	    } catch (TimeoutException eTO) {
	        foundAlert = false;
	    }
	    return foundAlert;
	}

}

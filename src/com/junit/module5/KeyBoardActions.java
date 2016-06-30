package com.junit.module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyBoardActions {
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
	
	@Test(groups ={"funational"})
	public void testKeyBoard(){
		driver.get("https://www.google.com/ncr");
		driver.findElement(By.id("lst-ib")).sendKeys("Edureka Demo");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).sendKeys("a").build().perform();;
		
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		action.sendKeys(Keys.ENTER).perform();
		try{
			Thread.sleep(6000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

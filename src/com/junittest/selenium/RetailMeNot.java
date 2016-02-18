package com.junittest.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RetailMeNot {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}


	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test(dependsOnMethods = {"Login"})
	public void Logout() {
		String xMyAccount = "//*[@id='member']/div[1]/div[1]/div/div[2]/span";
		String xLogOut = "//*[@id='member']/div[1]/div[1]/div/div[2]/ul/li[6]/a";
		
		WebDriverWait eWait = new WebDriverWait(driver, 10);
		WebElement MyAccount = eWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xMyAccount)));
		Actions action = new Actions(driver);
		action.moveToElement(MyAccount).moveToElement(driver.findElement(By.xpath(xLogOut))).click().build().perform();
			
	}
	
	@Test(dependsOnMethods = {"NavigateToSite"})
	public void Login(){
		String xUserName = "//*[@id='content']/div/div[8]/div[1]/div[1]/div/form/div[2]/input[1]";
		String xPassword = "//*[@id='content']/div/div[8]/div[1]/div[1]/div/form/div[2]/input[2]";
		String xLogin = "//*[@id='content']/div/div[8]/div[1]/div[1]/div/form/div[2]/div[20]/button[1]";
		
		driver.findElement(By.xpath(xUserName)).sendKeys("sanket.paropate@gmail.com");
		driver.findElement(By.xpath(xPassword)).sendKeys("sanket@123");
		driver.findElement(By.xpath(xLogin)).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void NavigateToSite(){
		driver.get("http://www.retailmenot.com/community/login");
	}

}

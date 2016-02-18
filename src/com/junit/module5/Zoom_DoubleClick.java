package com.junit.module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zoom_DoubleClick {
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
	
	@Test(groups ={"functional"})
	public void zoomTest(){
		driver.get("http://openlayers.org/en/v3.8.2/examples/accessible.html");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id='map']/div/div[2]/div[1]/button[1]"));
		element.click();
		System.out.println("Single Click opertion performed");
		
		try
		{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		Action doubleClick = action.doubleClick(element).build();
		doubleClick.perform();
		try
		{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Map Zoomed one level");
		
		doubleClick.perform();
		try
		{
			Thread.sleep(300);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Map Zoomed two levels");
	}

}

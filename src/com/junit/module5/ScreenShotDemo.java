package com.junit.module5;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotDemo {
	
	WebDriver driver;
	int screenshotCounter = 1;
	@BeforeMethod
	
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.close();
		//driver.quit();
	}
	@Test(groups ={"browser"})
	public void takeScreenShot(){
		String level1 ="//*[@id='main-nav']/li[2]/a/span";
		String level2 = "//*[@id='post-24076']/div[1]/div[2]/div/div/ul[1]/li/a/strong/em";
		String URL = "http://www.toolsqa.com/";
		driver.get(URL);
		copyScreenShot(driver);
		
		driver.findElement(By.xpath(level1)).click();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		copyScreenShot(driver);
		
		/*driver.findElement(By.xpath(level2)).click();
		driver.switchTo().window(arg0)
		copyScreenShot(driver);	*/			
	}
	
	public void copyScreenShot(WebDriver driver){
		try{
			this.driver = driver;
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File ("D:/FileForUpload/ScreenShot"+screenshotCounter+".png"));
			screenshotCounter++;
			}catch (IOException e){
				e.printStackTrace();
			}
		
	
	}
}

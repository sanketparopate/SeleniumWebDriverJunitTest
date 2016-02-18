package com.CParsa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadPhotos {
	WebDriver driver;

	@Test
	public void getData() throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.icloud.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='sc1930']/div/input")).sendKeys("sanket.paropate@icloud.com");
		driver.findElement(By.name("sc1932")).sendKeys("Borntowin@4541");
		driver.findElement(By.id("sc1939")).click();
		Thread.sleep(1000); 
		driver.findElement(By.id("sc2289-label")).click();
		Thread.sleep(1000); 
		
		driver.findElement(By.className("cw-button cw-ui-view cw-ui-views-controls-toggle-button cw-last cw-on")).click();
		driver.findElement(By.className("absolutely-positionable")).click();
		driver.findElement(By.className("cw-button photos-toolbar-button photos-select-button cw-ui-view")).click();
		
		
		
		//download class "cw-button photos-toolbar-button photos-download-selection-button cw-ui-view photos-action-button photos-download-button-view"
		
		
		//WebElement momentButton = driver.findElement(By.className("cw-button select-moment-button cw-ui-view photos-select-moment-button"));
		List <WebElement> AllButtons =  driver.findElements(By.className("cw-button select-moment-button cw-ui-view photos-select-moment-button"));
		System.out.println(AllButtons.size());
	}

}

package com.junit.module3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	
	private static final TimeUnit SECONDS = null;

	public static void main(String[] args) throws Exception {
		
		String baseURL = "http://www.edureka.co/";
		String xYouTube = "//*[@id='collapse1']/div[3]/ul/li[4]/a/i";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
		driver.get(baseURL);
		
		//String parentWindowHandle = driver.getWindowHandle();		
		driver.findElement(By.xpath(xYouTube)).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String currentWindow : allWindows){
		   driver.switchTo().window(currentWindow);
		   System.out.println(currentWindow);
		}
		
		Thread.sleep(5000);
		
		String youTubeURL = driver.getCurrentUrl();
		System.out.println(youTubeURL);
		
	}

}

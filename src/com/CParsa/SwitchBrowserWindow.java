package com.CParsa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchBrowserWindow {
	WebDriver driver;
	
	@Test
	public void switchWindow() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		
		Thread.sleep(1000);
		
	
		
		
		//public void runscripter(){
		
	/*	if (window.opener) {
		    alert('inside a pop-up window or target=_blank window');
		} else if (window.top !== window.self) {
		    alert('inside an iframe');
		} else {
		    alert('this is a top level window');
		}
		//}*/
		
		
		/*String parentWindow = driver.getWindowHandle();
		System.out.println("parent" +parentWindow);
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		driver.switchTo();		
		System.out.println("After click"+driver.getWindowHandle());
		
		for (String handle1 : driver.getWindowHandles()) {
		   	System.out.println(handle1);
		   	JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript("document.getElementById('adminTab').focus()");
        	//driver.switchTo().window(handle1);
       	}*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('page').focus()");
		//js.executeScript("window.location.hash = '#page'");
		//js.executeScript();
		//*[@id="content"]/div[1]/div/div/div/div/h2/span/strong
		
		//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='main-nav']/li[8]/a")).isDisplayed());
		String test = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div/h2/span/strong")).getText();
		System.out.println(test);
	}

}



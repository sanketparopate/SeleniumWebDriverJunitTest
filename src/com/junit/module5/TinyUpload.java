package com.junit.module5;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TinyUpload {
	
	public static void main(String[] args) throws TimeoutException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.tinyupload.com/");
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.xpath("/html/body/table/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
		element.sendKeys("D:/FileForUpload/test.txt");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		//catch (TimeoutException e1)
		//driver.quit();
		   
		
	}

}

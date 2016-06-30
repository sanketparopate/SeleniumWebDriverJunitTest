package com.junit.module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAccept {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}

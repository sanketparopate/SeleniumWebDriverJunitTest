package com.junit.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorTechniques {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath(""));
		String pagecontent = driver.getPageSource();
		
	}

}

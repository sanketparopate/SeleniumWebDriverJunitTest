package com.CParsa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testconnection {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}

}

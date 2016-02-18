package com.junit.module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SafariTest {
	public static void main(String[] args) {
		String baseURL1= "http://www.w3schools.com/";
		String baseURL2= "http://selenium-release.storage.googleapis.com/index.html?path=2.48/";
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1= new FirefoxDriver();
		driver.get(baseURL2);
		driver1.get(baseURL1);
		
	}

}

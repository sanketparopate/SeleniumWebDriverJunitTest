package com.login.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testClassforLogin {
	@Test
	public void testCase1(){
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		PageObjectLogin loginPage = new PageObjectLogin();
		
		loginPage.LoginObjectCreation(driver);
		loginPage.login();
		loginPage.tearDown();
		
	}
}

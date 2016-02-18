package com.login.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testClassforLogin {
	@Test
	public void testCase1(){
		WebDriver driver = new FirefoxDriver();
		PageObjectLogin loginPage = new PageObjectLogin();
		
		loginPage.LoginObjectCreation(driver);
		loginPage.login();
		loginPage.tearDown();
		
	}
}

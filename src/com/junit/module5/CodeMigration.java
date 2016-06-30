package com.junit.module5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

@SuppressWarnings("deprecation")

public class CodeMigration {
	
	@Test
	public void ececutorMethod(){
		rcCode();
		
	}
	
	@Test
	public void ececute1(){
		webDriverCode();
	}
	
	public void webDriverCode(){
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Selenium selenium = new WebDriverBackedSelenium(driver, "http://www.seleniumframework.com/Practiceform/");
		selenium.open("/");		
	}
	
	public void rcCode() {
		Selenium selenium  = new DefaultSelenium("localhost",4444, "*firefox", "http://www.edureka.co");
		selenium.start();
		selenium.open("/");
		
		
		
	}

}

package com.junit.module5;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

@SuppressWarnings("deprecation")

public class CodeMigration {
	
	@Test
	public void ececutorMethod(){
		rcCode();
		//webDriverCode();
	}
	
	
	public void webDriverCode(){
		WebDriver driver = new FirefoxDriver();
		Selenium selenium = new WebDriverBackedSelenium(driver, "http://www.seleniumframework.com/Practiceform/");
		selenium.open("/");		
	}
	
	public void rcCode() {
		Selenium selenium  = new DefaultSelenium("192.168.10.1",4444, "*firefox", "http://www.edureka.co");
		selenium.start();
		selenium.open("/");
		
		
		
	}

}

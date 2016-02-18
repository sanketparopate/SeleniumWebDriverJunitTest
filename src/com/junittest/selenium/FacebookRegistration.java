package com.junittest.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookRegistration {
	@Test
	public void setup1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("testest");
		
	}
	
	
	

}

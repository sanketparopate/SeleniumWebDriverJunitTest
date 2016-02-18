package com.junit.module2;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeleniumRCServer {

	@SuppressWarnings("deprecation")
	@Test
	public void rcServerclass(){
		
		Selenium selenium = new DefaultSelenium("localhost",4444,"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","https://www.facebook.com");
		selenium.start();
		selenium.open("/");
		selenium.type("id=u_0_1", "John");
		selenium.type("id=u_0_3", "Smith");
		selenium.type("id=u_0_5", "9876543210");
		selenium.type("id=u_0_8", "9876543210");
		selenium.click("id=u_0_i");
	}
}

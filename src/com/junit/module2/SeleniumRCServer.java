package com.junit.module2;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeleniumRCServer {

public static void main(String[] args) {
	


		
		Selenium selenium = new DefaultSelenium("localhost",4444,"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","https://www.facebook.com");
		selenium.start();
		selenium.open("/");
		selenium.type("id=u_0_1", "John");
		selenium.type("id=u_0_3", "Smith");
		selenium.type("id=u_0_6", "9876543210");
		selenium.type("id=u_0_9", "9876543210");
		selenium.click("id=u_0_j");
	}
}
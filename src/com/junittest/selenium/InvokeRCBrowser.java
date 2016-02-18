package com.junittest.selenium;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
@SuppressWarnings("deprecation")

public class InvokeRCBrowser {
	@Test
	public void setup(){
		Selenium selenium = new DefaultSelenium("http://192.168.1.9",4444,"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","https://www.facebook.com");
		selenium.start();
		selenium.open("https://www.facebook.com");
		
		selenium.type("id=u_0_1", "TESTTEST");//
		selenium.type("id=u_0_3", "PapperPapper");
	}

}

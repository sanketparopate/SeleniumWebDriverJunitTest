package com.junittest.selenium;

import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
@SuppressWarnings("deprecation")

public class InvokeRCBrowserExplicit {
	@Test
	public void setup(){
		Selenium selenium = new DefaultSelenium("localhost",4444,"*firefox","https://www.facebook.com");
		selenium.start();
		selenium.open("/");
	}

}

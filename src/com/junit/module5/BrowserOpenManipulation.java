package com.junit.module5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserOpenManipulation {
	WebDriver driver;
	int screenshotCounter = 1;
	@Before

	public void setUp() throws Exception {
		String PROXY = "10.9.176.171:3128";
		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXY);
		proxy.setFtpProxy(PROXY);
		proxy.setSslProxy(PROXY);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.bwin.com");	
	}

	//@After
	//public void tearDown() throws Exception {
//		driver.quit();
	//}
	@Test
	public void testBrowserStartManipulation(){
			
	}

}

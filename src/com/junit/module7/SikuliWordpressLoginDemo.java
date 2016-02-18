package com.junit.module7;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
@SuppressWarnings("deprecation")
@Test
public class SikuliWordpressLoginDemo {
	WebDriver driver,driver1;
	
	public void SikuliTest() throws MalformedURLException{
		
		DesiredCapabilities capability1 = new DesiredCapabilities();
		capability1.setBrowserName("firefox");
		//capability1.setVersion("9.0.1");
		capability1.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new
				 URL("http://192.168.1.9:4444/wd/hub"),capability1);
		
		driver1 = new RemoteWebDriver(new
				 URL("http://192.168.56.1:4444/wd/hub"),capability1);
		
		driver.get( "https://wordpress.com/wp-login.php");
		
		driver1.get( "http://www.seleniumframework.com/Practiceform/");




	
	}
}

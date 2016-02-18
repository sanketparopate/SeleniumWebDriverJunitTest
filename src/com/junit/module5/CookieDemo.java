package com.junit.module5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CookieDemo {
	WebDriver driver;
	int screenshotCounter = 1;
	@BeforeMethod
	
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test(groups ={"browser","functional"})
	public void testCookie(){
		driver.get("https://www.cookiebot.com/en/demo");
		Set<Cookie> allCookies=driver.manage().getCookies();
		for (Cookie getcookies : allCookies )
			System.out.println(getcookies);
		
		//driver.manage().deleteAllCookies();
		Cookie langPreference = new Cookie("lang","es");
		driver.manage().addCookie(langPreference);
		driver.navigate().refresh();
		
		Cookie setLang = driver.manage().getCookieNamed("lang");
		System.out.println(setLang);
	}

}

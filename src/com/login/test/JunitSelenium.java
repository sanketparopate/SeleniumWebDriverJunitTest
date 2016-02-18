package com.login.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSelenium {
	WebDriver driver;
	WebElement userName;
	WebElement password;
	WebElement submit;
	
	@Before
	public void setup(){
		//driver = new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCase01(){
		driver.get("http://www.edureka.co");
		driver.findElement(By.xpath("//*[@id='navbar']/li[4]/a")).click();
		userName= driver.findElement(By.xpath("//*[@id='email_signin']"));
		password= driver.findElement(By.xpath("//*[@id='password_signin']"));
		submit= driver.findElement(By.xpath("//*[@id='signinForm']/div[4]/button"));
		login();
	}
	public void login(){
		userName.sendKeys("sanket.paropate@gmail.com");
		password.sendKeys("sanket@123");
		submit.click();	
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}

package com.login.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectLogin {
	WebDriver driver;
	WebElement userName;
	WebElement password;
	WebElement submit;
	
	public void LoginObjectCreation(WebDriver driver){
		this.driver= driver;
		driver.get("http://www.edureka.co");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div[1]/a")).click();
		userName= driver.findElement(By.xpath("//*[@id='inputName']")); //*[@id='email_signin']
		password= driver.findElement(By.xpath("//*[@id='pwd']")); //*[@id='password_signin']
		submit= driver.findElement(By.xpath("//*[@id='signinForm']/div[4]/button"));//*[@id="signinForm"]/div[4]/button //*[@id='signinForm']/div[4]/button
		
	}
	
	public void login(){
		userName.sendKeys("sanket.paropate@gmail.com");
		password.sendKeys("sanket@123");
		submit.click();		
	}
	
	public void tearDown(){
		driver.quit();
	}

}

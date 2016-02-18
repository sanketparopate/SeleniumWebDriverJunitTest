package com.junit.module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdurekaCo {
	public static void main(String[] args) throws InterruptedException {
		
		String xLoginButton = "//*[@id='navbar']/li[4]/a";
		String xEmail ="//*[@id='email_signin']";
		String xPassword = "//*[@id='password_signin']";
		String xSignIn = "//*[@id='signinForm']/div[4]/button";
		String xGoToCourse = "//*[@id='delay']/li/div/div/div[2]/p[3]/span/span/a";
		//String baseURL2= "http://selenium-release.storage.googleapis.com/index.html?path=2.48/";
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.edureka.co/");
		
		driver.findElement(By.xpath(xLoginButton)).click();
		driver.findElement(By.xpath(xEmail)).sendKeys("sanket.paropate@gmail.com");
		driver.findElement(By.xpath(xPassword)).sendKeys("sanket@123");
		driver.findElement(By.xpath(xSignIn)).click();
		String vPageTitle = driver.getTitle();	
		if(vPageTitle.contains("Instructor Led Online Courses with 24x7 On-Demand Support | Edureka")){
			System.out.println("Page title is correct");
		}
		else
			System.out.println("Page Title is incorrect");
		
		//System.out.println(vPageTitle);
		
		
		driver.findElement(By.xpath(xGoToCourse)).click();
		
		String vCurrentURL=driver.getCurrentUrl();
		
		if(vCurrentURL.contains("http://www.edureka.co/my-course/testing-with-selenium-webdriver")){
			System.out.println("Page URL is correct");
		}
		else
			System.out.println("Page URL is incorrect");
		
		
		//System.out.println(vCurrentURL);
		
		//String vPageSource = driver.getPageSource();
		//System.out.println(vPageSource);
		//driver.quit();
		
		
		
		
		
		
	}

}

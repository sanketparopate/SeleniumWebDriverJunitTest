package com.facebook.project;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookPage {
	WebDriver driver;
		
		@Test
		public void testPageTitle(){
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/?_rdr=p");
			String PageTitle = driver.getTitle();
			
			Assert.assertEquals("Facebook - Log In or Sign Up", PageTitle);
			System.out.println("Pass");
			
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("9970104447");
			String ElementText = driver.findElement(By.className("_5iyx")).getText();
			//System.out.println(ElementText);
			Assert.assertEquals("Facebook helps you connect and share with the people in your life.",ElementText);
}

}

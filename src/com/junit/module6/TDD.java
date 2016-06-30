package com.junit.module6;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TDD {

	@Test
	public void TDDClass(){
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sparopate/Desktop/Instructor%20Led%20Online%20Courses%20with%2024x7%20On-Demand%20Support%20_%20Edureka.html");
		String title = driver.findElement(By.xpath("/html/body/section[4]/div/div/div[2]/h4")).getText();
		Assert.assertEquals(title, "Expert instructions");
	}
}

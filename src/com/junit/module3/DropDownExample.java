package com.junit.module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) {
		
		String baseURL = "https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("10");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(6);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2001");
	}

}

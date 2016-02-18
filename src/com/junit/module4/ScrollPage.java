package com.junit.module4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {
	@Test
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String ExpectedTitle = "Selenium Framework | Practiceform";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle))
			System.out.println("Title Pass");
		else
			System.out.println("Title Fail");
		
		String ExpectedURL = "http://www.seleniumframework.com/Practiceform/";
		String ActualURL = driver.getCurrentUrl();
		
		if (ActualURL.equals(ExpectedURL))
			System.out.println("URL Pass");
		else
			System.out.println("URL Fail");
		
		WebElement textBox = driver.findElement(By.id("colorVar"));
		
		String valuetext = textBox.getCssValue("color");
		System.out.println(valuetext);
		
		
	}

}

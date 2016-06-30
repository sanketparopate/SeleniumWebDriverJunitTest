package com.junit.module4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String ExpectedTitle = "Selenium Framework | Practiceform";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle))
			System.out.println("Title Pass");
		else
			System.out.println("Title Fail");
		
		driver.findElement(By.xpath("//*[@id='main-nav']/li[8]/a")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ExpectedURL = "http://www.seleniumframework.com/contact-2/";  //http://www.seleniumframework.com/contact-2/
		String ActualURL = driver.getCurrentUrl();
		
		if (ActualURL.equals(ExpectedURL))
			System.out.println("URL Pass");
		else
			System.out.println("URL Fail");
		
/*		WebElement textBox = driver.findElement(By.id("colorVar"));
		
		String valuetext = textBox.getCssValue("color");
		System.out.println(valuetext);*/
		
		
	}

}

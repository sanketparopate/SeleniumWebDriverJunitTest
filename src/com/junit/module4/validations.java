package com.junit.module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validations {
	public static void main(String[] args) {
		String expectedTitle= "Practice Form";
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.seleniumframework.com/Practiceform/");
	String title= driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[1]/div/h2")).getText();
	System.out.println(title);
	if (title.equals(expectedTitle))
			System.out.println("Pass");
	else 
		System.out.println("Fail");
	}

}

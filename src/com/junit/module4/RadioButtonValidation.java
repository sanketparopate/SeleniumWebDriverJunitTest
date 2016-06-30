package com.junit.module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement CheckBox = driver.findElement(By.id("vfb-6-1"));
		Boolean Radio1 =CheckBox.isSelected();
		if (Radio1.toString().equals("false"))
			System.out.println("The Check box 1 is not checked ");
		else if (Radio1.toString().equals("true"))
			System.out.println("The Check box 1 is checked");
		
		CheckBox.click();
		System.out.println("Radio button is clicked");
		Boolean RadioState = CheckBox.isSelected();
		if (RadioState.toString().equals("false"))
			System.out.println("The Check box 1 is not checked ");
		else if (RadioState.toString().equals("true"))
			System.out.println("The Check box 1 is checked");
		
		
		//driver.close();
	}

}

package com.junit.module3;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDemo {
	
	WebDriver driver;
	@Test
	public void webElementCommands(){
		
		String baseURL = "http://www.seleniumframework.com/Practiceform/";
		
		System.setProperty("webdriver.ie.driver", "D:/Edureka/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(baseURL);
		
		driver.findElement(By.id("vfb-9")).sendKeys("TextBox found");		//find text box with id attribute and enter the text 'TextBox found' in it
		System.out.println("Found the TextBox with 'id' attribute having value as 'vfb'");
		
		/*driver.findElement(By.name("name")).sendKeys("TextBox name");		//find text box with name attribute
		System.out.println("Found the TextBox with 'name' attribute having value as 'name'");*/
	}

}

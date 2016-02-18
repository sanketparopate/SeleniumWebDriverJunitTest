package com.junit.module3;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoModule3 {
	
	WebDriver driver;
	
	@Test
	public void browserCommands(){
		
		String baseURL = "http://www.seleniumframework.com/demo-sites/";
		String xPracticeFormLink = "//*[@id='content']/div/div[3]/div/div/div/p[2]/strong/a";
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath(xPracticeFormLink)).click();
		
		for (String handle1 : driver.getWindowHandles()) {
		   	System.out.println(handle1);
        	driver.switchTo().window(handle1);
       	}
		
		String vCurrentTitle = driver.getTitle();	//get current window title
		System.out.println(vCurrentTitle);
		
		String vCurrentURL = driver.getCurrentUrl();	//get current window URL
		System.out.println(vCurrentURL);
		
		String vPageSource = driver.getPageSource();	//get the source code of the page referred by driver
		System.out.println(vPageSource);
		
		driver.navigate().refresh();	//refresh current page
		
		
		
		driver.switchTo().window(parentWindow);
		
		driver.close();		//close current window
		driver.quit();		//close all windows
			
	}
	
	
	@Test
	public void webElementFindElements(){
		
		String baseURL = "http://www.seleniumframework.com/Practiceform/";
		String xRadioDiv = "//*[@id='item-vfb-7']/div/span";		//xpath of the radio buttons section
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		
		List<WebElement> options= driver.findElements(By.xpath(xRadioDiv));		//Getting all the elements in list
		System.out.println("Number of elements in list : "+options.size());		//Prints size of the list
		
		for(int i=0;i<options.size();i++)				//iterating through the list
		{
		String vOptionText = options.get(i).getText();	//getting the label of the option
		System.out.println(vOptionText);				//printing the label on console 
		}
		
		driver.close();		
	}
	
	@Test
	
	public void webElementCommands(){
		
		String baseURL = "http://www.seleniumframework.com/Practiceform/";
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		
		driver.findElement(By.id("vfb-9")).clear();
		/*driver.findElement(By.id("vfb-9")).sendKeys("TextBox found");		//find text box with id attribute and enter the text 'TextBox found' in it
		System.out.println("Found the TextBox with 'id' attribute having value as 'vfb-9'");*/
		
		driver.findElement(By.name("vfb-9")).sendKeys("TextBox name found");		//find text box with name attribute
		System.out.println("Found the TextBox with 'name' attribute having value as 'vfb-9'");
		
		//driver.navigate().to("https://www.google.com/ncr");
	
		//driver.findElement(By.className("validate[required,custom[email]]")).sendKeys("testemail@xyz.com"); 	//find email field with Classname attribute
		//System.out.println("Found the Email field with 'className' attribute");
		
	}

}

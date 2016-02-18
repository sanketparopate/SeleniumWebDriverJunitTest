package com.CParsa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;

public class no_sendkeys { 
	public static void setValue(WebElement element, String
			attributeName, String value)
	{
		WrapsDriver wd = (WrapsDriver) element;
		JavascriptExecutor driver = (JavascriptExecutor)wd.getWrappedDriver();
		driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",
				element, attributeName, value);
	}

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement
		textarea=driver.findElement(By.xpath("//*[@id='vfb-10']"));
		textarea.click();
		Actions actionObj = new Actions(driver);
		actionObj.keyDown(Keys.CONTROL)
		.sendKeys(Keys.chord("a"))
		.sendKeys(Keys.DELETE)
		.perform();

		actionObj.sendKeys("Select * form \n employee \n where \n employee name = 'Sanket'")
		.perform();
	}
	
	public void test2(){
		WebDriver driver = new FirefoxDriver();
	String text = "My super long text string to be typed into text area element";
    WebElement element = driver.findElement(By.id("vfb-10"));
    element.click();
    
    Actions actionObj = new Actions(driver);
    actionObj.keyDown(Keys.CONTROL)
    .sendKeys(Keys.chord("a"))
    .sendKeys(Keys.DELETE)
    .perform();
    
    ((JavascriptExecutor)driver).executeScript("arguments[0].value = arguments[1];", element, text);
	}
                    }

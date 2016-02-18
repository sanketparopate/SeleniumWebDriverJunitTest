package com.junittest.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {


	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(groups ={"browser"})
	public void test() {
		//Boolean yes = new Boolean(true);
		//Boolean no = new Boolean (false);
		driver.get("http://www.seleniumframework.com/Practiceform");
		
		WebElement notSelectedRadio = driver.findElement(By.id("vfb-7-1"));		//not selected check box
		Boolean notChecked = notSelectedRadio.isSelected();
		System.out.println(notChecked);
		
		
		WebElement selectedRadio = driver.findElement(By.id("vfb-7-2"));		//selected check box
		selectedRadio.click();
		Boolean checked = selectedRadio.isSelected();
		System.out.println(checked);
		
		driver.findElement(By.linkText("This is a link"));
		
		
		
	}

}

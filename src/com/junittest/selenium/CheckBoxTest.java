package com.junittest.selenium; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest {

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
		//driver.quit();
	}

	@Test
	public void test() {
		//Boolean yes = new Boolean(true);
		//Boolean no = new Boolean (false);
		driver.get("http://www.seleniumframework.com/Practiceform");
		
		WebElement notSelectedCheckBox = driver.findElement(By.id("vfb-6-0"));		//not selected check box
		Boolean notChecked = notSelectedCheckBox.isSelected();
		System.out.println(notChecked);
		/*if (notChecked==no)
			System.out.println("The first checkbox is not checked");
		else 
			System.out.println(" The first chechBox is checked");*/
		
		WebElement selectedCheckBox = driver.findElement(By.id("vfb-6-1"));		//selected check box
		selectedCheckBox.click();
		Boolean checked = selectedCheckBox.isSelected();
		System.out.println(checked);
		/*if (checked==yes)
			System.out.println("The second checkbox is checked");
		else 
			System.out.println(" The second chechBox is not checked");*/
		
	}
}


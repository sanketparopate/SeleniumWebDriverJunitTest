package com.junit.module4; 

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxTest {

	WebDriver driver;
	@Before
	
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		//Boolean yes = new Boolean(true);
		//Boolean no = new Boolean (false);
		driver.get("http://www.seleniumframework.com/Practiceform");
		
		WebElement vHeading = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/h2"));
		String vText = vHeading.getText();
		if (vText.contains("Practice Details Controls")){
			System.out.println("Pass");
			
		}
		else
			System.out.println("Fail");
		/*WebElement notSelectedCheckBox = driver.findElement(By.id("vfb-6-0"));		//not selected check box
		Boolean notChecked = notSelectedCheckBox.isSelected();
		System.out.println(notChecked);
		if (notChecked==no)
			System.out.println("The first checkbox is not checked");
		else 
			System.out.println(" The first chechBox is checked");
		
		WebElement selectedCheckBox = driver.findElement(By.id("vfb-6-1"));		//selected check box
		selectedCheckBox.click();
		Boolean checked = selectedCheckBox.isSelected();
		System.out.println(checked);
		if (checked==yes)
			System.out.println("The second checkbox is checked");
		else 
			System.out.println(" The second chechBox is not checked");*/
		
	}
}


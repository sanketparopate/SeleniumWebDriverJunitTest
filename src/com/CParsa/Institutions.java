package com.CParsa;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Institutions
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception
	{
		File file = new File("D:/Edureka/chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://advisory--test.cs51.my.salesforce.com/?ec=302&startURL=%2Fhome%2Fhome.jsp");
	}

	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("parsac@advisory.com.abc.test");		
		driver.findElement(By.id("password")).sendKeys("Rajulapati17");		
		driver.findElement(By.id("Login")).click();		
		driver.findElement(By.linkText("Chandana Parsa")).click();		
		driver.findElement(By.linkText("Setup")).click();		
		driver.findElement(By.linkText("Manage Users")).click();		
		driver.findElement(By.linkText("Profiles")).click();		
		}
	
	public void profile() throws InterruptedException
	{
		driver.findElement(By.linkText("Finance Ops")).click();		
		driver.findElement(By.id("page:console:j_id77:j_id78:overview_header:j_id81:button_assigned_users")).click();	
		driver.findElement(By.linkText("Login")).click();
	}
	
	public void tabs() throws InterruptedException
	{
		   		driver.findElement(By.className("allTabsArrow")).click();		   		
				driver.findElement(By.linkText("Institutions")).click();
				driver.findElement(By.name("new")).click();			
				WebElement element = driver.findElement(By.id("p3"));
				Select select = new Select(element);
				select.selectByVisibleText("US Provider - System");									
	}
	

	   @Test	   
	   public void switchingbetweenwindows() throws Exception
	   {
		   	String xNewInstitutions = "//*[@id='0014B000002vvPQQAY_00NC00000055pPS']/div/div/div[1]/table/tbody/tr/td[2]/input";
		   	String vSearchName = "Romy Bassi";			//variable declaration
		   	login();
		 	
		   	driver.findElement(By.xpath("//*[@id='00BC00000086nfS_rolodex']/a[13]/span")).click();
			driver.findElement(By.linkText("MA With Institution Permission")).click();
			
			driver.findElement(By.id("page:console:j_id77:j_id78:overview_header:j_id81:button_assigned_users")).click();
			driver.findElement(By.linkText("Login")).click();
							
			driver.findElement(By.className("allTabsArrow")).click();
			driver.findElement(By.linkText("Institutions")).click();
			
			driver.findElement(By.linkText("Regression Test US Provider10-15 - Washington - DC")).click();
			driver.findElement(By.xpath(xNewInstitutions)).click();//new button click
							
			driver.findElement(By.xpath("//*[@id='j_id0:j_id10:pb:j_id42:0:j_id44']")).sendKeys(vSearchName);
						
			String parentWindow = driver.getWindowHandle();//get the current window handle
			driver.findElement(By.xpath("//*[@id='j_id0:j_id10:pb:j_id42:0:j_id44_lkwgt']/img")).click();//click on search button
					
			for (String handle1 : driver.getWindowHandles())
			{
			System.out.println(handle1);
			driver.switchTo().window(handle1);//switch focuses to Webdriver to the next found window
			}
			
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(vSearchName)));
			element.click();
			
			driver.close();//closing the child window
			driver.switchTo().window(parentWindow); //control to parent window 
			driver.findElement(By.xpath("//*[@id='j_id0:j_id10:pb:j_id39']/input[1]")).click();
		}
}

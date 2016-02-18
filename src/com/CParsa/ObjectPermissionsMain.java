package com.CParsa;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObjectPermissionsMain {
	WebDriver driver;
	String xCheckBoxValidation;
	
	@BeforeTest
	public void setUp() throws Exception {
		File file = new File("C:/Selenium/chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://advisory--test.cs51.my.salesforce.com/?ec=302&startURL=%2Fhome%2Fhome.jsp");
	}
	
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("parsac@advisory.com.abc.test"); //enter username
		driver.findElement(By.id("password")).sendKeys("Rajulapati17"); //enter password
		driver.findElement(By.id("Login")).click(); //

		driver.findElement(By.linkText("Chandana Parsa")).click();
		driver.findElement(By.linkText("Setup")).click();
		driver.findElement(By.linkText("Manage Users")).click();
		driver.findElement(By.linkText("Profiles")).click();
		
		Select ProgAccess = new Select(driver.findElement(By.name("fcf")));
		ProgAccess.selectByVisibleText("SOX - Programs Access");
	}
	
		
	public void menuoptionf() throws InterruptedException
	{
		driver.findElement(By.linkText("F")).click();
	}
	
	public void menuoptions() throws InterruptedException
	{
		driver.findElement(By.linkText("S")).click();
	}
	
	public boolean useActionsforDoubleClick(WebElement eTargetElement, String xCheckBoxStatus){
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class)
		.until(new com.google.common.base.Predicate<WebDriver>() {			
			@Override
			public boolean apply(WebDriver driver) {
				Actions action = new Actions(driver);
				action.doubleClick(eTargetElement).perform(); //double click action perform on the button
		            return true;
			}			
		});
		boolean isCheck=driver.findElement(By.xpath(xCheckBoxStatus)).isSelected(); //Check if the CheckBox is Checked
		return isCheck;
	}
	
	
	@Test (priority = 1)
	public void loader() throws InterruptedException
	{
		login();

		/*********************FOR CREATE*********************************/
		WebElement eCreateCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___0']/img")); //'Create' Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___0']";
		boolean bCreateCheckBox  = useActionsforDoubleClick(eCreateCheckBox,xCheckBoxValidation);
		System.out.println("Value of Create Checkbox is " +bCreateCheckBox);
		Assert.assertTrue(bCreateCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button

		/*********************FOR DELETE*********************************/
		WebElement eDeleteCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___3']/img")); //'Delete' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___3']";
		boolean bDeleteCheckBox =useActionsforDoubleClick(eDeleteCheckBox,xCheckBoxValidation);
		System.out.println("Value of Delete Checkbox is " +bDeleteCheckBox);
		Assert.assertTrue(bDeleteCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button

		/*****************************FOR EDIT****************************************************/
		WebElement eEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bEditCheckBox = useActionsforDoubleClick(eEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bEditCheckBox);
		Assert.assertTrue(bEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}
}






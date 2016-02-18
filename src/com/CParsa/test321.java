package com.CParsa;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test321 {
	WebDriver driver;
	String xCheckBoxValidation13 = "//*[@id='01IC0000000lewVMAQ___0']";
	
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
	
	@Test(priority = 14)
	 public void ProgSets() throws InterruptedException
	 
	 {
	  
	  driver.findElement(By.linkText("Chandana Parsa")).click();
	  driver.findElement(By.linkText("Setup")).click(); 
	  driver.findElement(By.linkText("Manage Users")).click();
	  driver.findElement(By.linkText("Permission Sets")).click();
	  
	  Select ProgAccess = new Select(driver.findElement(By.name("fcf")));
	  ProgAccess.selectByVisibleText("SOX: Program Access");   
	  
	  Thread.sleep(2000);

	  int ecounter;
	  for (ecounter = 1; ecounter <=111; ecounter++){
	   
	   WebElement eeCreateCheckBox = driver.findElement(By.xpath("//*[@id='ext-gen11']/div["+ecounter+"]/table/tbody/tr/td[5]/div")); //'Create' Checkbox xpath for ABC Dataloader
	   //*[@id="ext-gen11"]/div[1]/table/tbody/tr/td[5]
	   boolean beCreateCheckBox  = useActionsforDoubleClick(eeCreateCheckBox,xCheckBoxValidation13);
	   if(beCreateCheckBox == false)
	   	{	    
		   System.out.println("Value of "+ecounter+" Checkbox is " +beCreateCheckBox);
		   //Assert.assertFalse(beCreateCheckBox, "The CheckBox is not checked");
	   	}
	   else if (beCreateCheckBox==true)
	   	{ 
		   System.out.println(ecounter +" Checkbox id found checked. Please inform Steve Baxter and take appropriate action");
	  
	   	}
	   	driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	  }//for
	
	 }//method Close

}

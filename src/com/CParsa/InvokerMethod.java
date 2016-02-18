package com.CParsa;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class InvokerMethod {
	
	WebDriver driver;
	
	@Test
	public void invokerFunction(){
		String xPath1= "//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___0']";	//xpath declarations
		String xPath2="//*[@id='01IC0000000lewVMAQ___0']";
		String xPath3="//*[@id='cancelButton']";
		String xPath4="//*[@id='00BC00000086nfS_rolodex']/a[19]";
		boolean textBoxStatus = false;										//boolean to hold return result from the method
		
		textBoxStatus = InstitutionsActionPerformer(xPath1, xPath2, xPath3, xPath4);	//call to method
		Assert.assertTrue("The CheckBox is already checked", textBoxStatus);			//Assert if the method returns true (True means checkbox is already checked)
		
	}
	
	public boolean InstitutionsActionPerformer(String xPath1, String xPath2, String xPath3, String xPath4){
		
		Actions action = new Actions(driver);		//double click operation
		WebElement element = driver.findElement(By.xpath(xPath1));
		action.doubleClick(element).perform();
		
		boolean isChecked=driver.findElement(By.xpath(xPath2)).isSelected();	//find out if the checkbox is checked
		driver.findElement(By.xpath(xPath3)).click();
		driver.findElement(By.xpath(xPath4)).click();
		return isChecked;					//return result to calling method
	}

}

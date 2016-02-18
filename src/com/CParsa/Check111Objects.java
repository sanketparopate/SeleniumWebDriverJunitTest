package com.CParsa;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Check111Objects {
	
	WebDriver driver;
	String xCheckBoxValidation = "//*[@id='01IC0000000lewRMAQ___0']";
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

@Test
public void test111Obujects(){
	int counter;	
	//login();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	for (counter = 1; counter <=111; counter++){
		WebElement eCreateCheckBox = driver.findElement(By.xpath("//*[@id='ext-gen11']/div["+counter+"]/table/tbody/tr/td[5]")); //'Create' Checkbox xpath for ABC Dataloader
		boolean bCreateCheckBox  = useActionsforDoubleClick(eCreateCheckBox,xCheckBoxValidation);
		System.out.println("Value of "+counter+" Checkbox is " +bCreateCheckBox);
		Assert.assertTrue(bCreateCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}
}
}

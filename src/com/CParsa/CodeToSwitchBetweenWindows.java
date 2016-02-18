package com.CParsa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodeToSwitchBetweenWindows {
	
	WebDriver driver;
	
	@Test
	public void switchingBetweenWindows() throws Exception{
		String vSearchName = "Romy Bassi";			//variable declaration
		
		String xNewInstitutions = "//*[@id='0014B000002vvPQQAY_00NC00000055pPS']/div/div/div[1]/table/tbody/tr/td[2]/input";
		driver.findElement(By.xpath(xNewInstitutions)).click();
		driver.findElement(By.xpath("//*[@id='j_id0:j_id10:pb:j_id42:0:j_id44_lkwgt']/img")).click();
		Thread.sleep(2000);
		for (String handle1 : driver.getWindowHandles()) {
		   	System.out.println(handle1);
        	driver.switchTo().window(handle1);
       	}
		driver.findElement(By.xpath("//*[@id='lksrch']")).sendKeys(vSearchName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='theForm']/div/div[2]/input[2]")).click();  //click Go in the new Window  
		Thread.sleep(2000);
		driver.findElement(By.linkText(vSearchName)).click();
		Thread.sleep(2000);
		//String parentWindow;
		//driver.switchTo().window(parentWindow); //control to parent window 
				
	}

}

/*You can also use the below approach if you know the title of the new window

String parentWindowHandle = browser.getWindowHandle(); // save the current window handle.
WebDriver popup = null;
Iterator<String> windowIterator = browser.getWindowHandles();
while(windowIterator.hasNext()) { 
  String windowHandle = windowIterator.next(); 
  popup = browser.switchTo().window(windowHandle);
  if (popup.getTitle().equals("Google") {    //replace "google" with your new window title
    break;
  }
}
//perform the operations on the new window

driver.switchTo().window(parentWindow); //control to parent window
*/ 
package com.CParsa;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassForCode {
	
	WebDriver driver;
	
	public int counter=0;
	
	@Test
	public void testclass() throws Exception{
		System.out.println(counter);
		counter++;
		System.out.println(counter);
		
		String URL = "http://www.tutorialspoint.com/java/java_string_split.htm";
		List<String> Courses = new ArrayList<String>();
		for (String retval: URL.split("/", 0)){
	         System.out.println(retval);
	         
	         if(!retval.isEmpty())
					Courses.add(retval);
	      }
		System.out.println(Courses);
		String lastElement = Courses.get(Courses.size() - 1);
		System.out.println(lastElement);//you can use this lastElement string as the token you want
		
		
		WebElement MultiSelect = driver.findElement(By.id("00NC0000005uwxy_unselected"));  //Select the Status for the Case
		 Select MultiSelectVal = new Select(MultiSelect);
		 MultiSelectVal.selectByVisibleText("Other Member of Institution");
		//WebElement MultiSelect = driver.findElement(By.id("none"));
		Actions action = new Actions(driver); 
		// action.doubleClick(MultiSelectVal).perform();
		 Thread.sleep(20000);
	}

}

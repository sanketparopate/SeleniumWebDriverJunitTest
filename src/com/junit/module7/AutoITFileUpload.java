package com.junit.module7;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class AutoITFileUpload {
	WebDriver driver;
	
	@Test(timeout = 1000)
	public void AutoITTest(){
		try {
			Runtime.getRuntime().exec("D:/AutoIT/calculator.exe");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
	
	
	
	
	
	
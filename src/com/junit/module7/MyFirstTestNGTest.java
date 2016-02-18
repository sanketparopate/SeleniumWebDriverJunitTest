package com.junit.module7;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MyFirstTestNGTest {
	
	@Test(priority=1)
	public void firstTest(){
		System.out.println("First TestNG Test");
		
	}
	
	@BeforeMethod
	public void setup(){
		System.out.println("Setup Method executed");
		
	}
	
	@AfterMethod
	public void teardown(){
		System.out.println("Teardown Method executed");
		
	}
	
	@Test(priority=2)
	public void SecondTest(){
		System.out.println("Second TestNG Test");
		
	}
	
	@Test(priority=0)
	public void ThirdTest(){
		System.out.println("Third TestNG Test");
		
	}

}

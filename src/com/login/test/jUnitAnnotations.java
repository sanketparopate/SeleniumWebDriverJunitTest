package com.login.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class jUnitAnnotations {
	
	WebDriver driver;
	
@Before
	public void beforeMethod(){
	System.out.println("Before method executed");
	System.out.println();
}

@Test
	public void testMethod01(){
	System.out.println("Test Method 01 executed");
	System.out.println();
	}

@Test(expected = NullPointerException.class)
public void testMethod02(){
	System.out.println("Test Method 02 executed");
	System.out.println();
	driver.close();

	}

@Test(timeout = 1000)
public void testMethod03 () throws Exception{
System.out.println("Test Method 03 executed");
System.out.println();
Thread.sleep(900);
}

@BeforeClass
public static void beforeClassMethod() throws Exception{
System.out.println("Before Class Method executed");
System.out.println();
Thread.sleep(1010);
}

@AfterClass
public static void afterClassMethod() throws Exception{
System.out.println("After Class Method executed");
System.out.println();
Thread.sleep(1010);
}


@After
public void afterMethod()
{
	System.out.println("After method executed");
}


@Ignore
@Test
public void testMethod04 () throws Exception{
System.out.println("Test Method 03 executed");
System.out.println();
}

}

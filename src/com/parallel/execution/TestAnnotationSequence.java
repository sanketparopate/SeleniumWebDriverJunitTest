package com.parallel.execution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationSequence {
	
	
@Test(groups={"Bike","Car"})
  public void drive() {
	  System.out.println("Drive Ececuted");
  }
  
  @Test(dependsOnMethods = {"drive"},groups={"Bike","Car"})
  public void changeGear() {
	  System.out.println("Change Gear Ececuted");
  }
  
  @Test(groups={"Bike","Car"}, dependsOnMethods ={"changeGear"})
  public void accelerate() {
	  System.out.println("Accelerate Ececuted");
  }
  
  @Test ()
  public void onMaxSpeed() {
	  System.out.println("Max Speed Ececuted");
  }
  
  @Test(groups={"Bike"})
  public void drifting() {
	  System.out.println("Drifting Ececuted");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod Executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod Executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass Executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass Executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest Executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest Executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite Executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite Executed");
  }

}

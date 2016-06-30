package com.junit.module7;

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
  @Test (priority = 2, enabled = false)
  public void f2() {
	  System.out.println("Test2 Ececuted");
  }
  @Test (priority = 1)
  public void f4() {
	  System.out.println("Test4 Ececuted");
  }
  @Test (priority = 4)
  public void f3() {
	  System.out.println("Test3 Ececuted");
  }
  
  @Test(priority = 3)
  public void f1() {
	  System.out.println("Test1 Ececuted");
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

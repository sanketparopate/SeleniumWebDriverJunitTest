package com.junit.module7;

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
  @Test ()
  public void f2() {
	  System.out.println("Test1 Ececuted");
  }
  
  @Test()
  public void f1() {
	  System.out.println("Test2 Ececuted");
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

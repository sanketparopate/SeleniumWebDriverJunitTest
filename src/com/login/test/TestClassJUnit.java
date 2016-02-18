package com.login.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestClassJUnit {
	@BeforeClass
	public static void beforeClassMethod(){
		System.out.println("BeforeClass method has been executed");
	}
	
	@AfterClass
	public static void afterClassMethod(){
		System.out.println("AfterClass method has been executed");
	}
	@Before
	public void beforeMethod(){
		System.out.println("Before method has been executed");
	}

	@Test
	public void test1() {
		System.out.println("Test1 executed");
		
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test2 executed");
		
	}
	@Test
	public void test3() {
		System.out.println("Test3 executed");
		
	}
	@After
	public void tearDown(){
		System.out.println("After metthod executed");
	}

}

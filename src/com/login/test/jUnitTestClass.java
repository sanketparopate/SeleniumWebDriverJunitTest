package com.login.test;

import org.junit.Assert;
import org.junit.Test;

public class jUnitTestClass {

	jUnitMethodsClass classObject = new jUnitMethodsClass();
	
	@Test
	public void testMethod1() {
		Assert.assertFalse(classObject.returnFalse());
	}
	
	@Test
	public void testMethod2() {
		Assert.assertFalse(classObject.returnTrue());
	}
	
	@Test
	public void testMethod3() {
		Assert.assertEquals(classObject.returnString(), "edureka01");
	}
	
	
}

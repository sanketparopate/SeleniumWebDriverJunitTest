package com.junit.module5;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class CallTestClass {

	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
        Class[] classes = new Class[]{
        		com.junit.module5.test.class};
        testng.setTestClasses(classes);
        testng.addListener(tla);
        testng.run();
	}

}

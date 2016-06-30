package com.login.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ jUnitAnnotations.class, JunitSelenium.class,
		jUnitTestClass.class, TestClass01.class, testClassforLogin.class,
		TestClassJUnit.class })
public class AllTests {

}

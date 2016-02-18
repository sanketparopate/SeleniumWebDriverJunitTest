package com.login.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestClassJUnit.class, testClassforLogin.class, JunitSelenium.class })
public class AllTests {

}

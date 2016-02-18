package com.junit.module2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.junit.module3.*;

@RunWith(Suite.class)
@SuiteClasses({ SeleniumRCServer.class, ChromeDriverTest.class })
public class AllTests {

}

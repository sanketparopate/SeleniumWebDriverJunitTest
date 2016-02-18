package com.junit.module6;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SeleneseCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.JsonException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class RCBackedWebDriver {
	
	@Test
	public void requiresRCServer() throws Exception {
		try{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		CommandExecutor executor = new SeleneseCommandExecutor(new URL ("https://localhost:4444"), new URL("http://www.edureka.co"), capabilities);
		WebDriver driver = new RemoteWebDriver(executor, capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://www.edureka.co");
		}catch (JsonException e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void RCServerNotRequired() {
		String EFOrganization = "/html/body/section[6]/div/div/div/a";
		
		WebDriver driver = new FirefoxDriver();
		Selenium selenium = new WebDriverBackedSelenium(driver, "http://www.edureka.co");
		driver.get("http://www.edureka.co");
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EFOrganization)));
		element.click();
		}
	}
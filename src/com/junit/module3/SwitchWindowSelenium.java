package com.junit.module3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowSelenium {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {

		String windowTitle = "Selenium Framework | Selenium, Cucumber, Ruby, Java et al.";
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.xpath("//*[@id='button1']")).click();
		Thread.sleep(5000);
		//driver.switchTo().window("viewport");
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div[1]/div/div/div/p[2]/span/a[2]")).click();
		//String newWindowTitle = driver.getTitle();
		//System.out.println(newWindowTitle);
		handleMultipleWindows(windowTitle);
		System.out.println("Window Found");
		driver.quit();
	}

	public static void handleMultipleWindows(String windowTitle) {
		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains(windowTitle)) {
				return;
			}
		}
	}

}

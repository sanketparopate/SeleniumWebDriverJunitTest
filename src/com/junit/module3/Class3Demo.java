package com.junit.module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Demo {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String PageTtitle = driver.getTitle();
		System.out.println(PageTtitle);
		
		driver.findElement(By.xpath("//*[@id='main-nav']/li[8]/a")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String PageURL = driver.getCurrentUrl();
		System.out.println(PageURL);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		//driver.close();
	}

}

package com.junit.module7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class SikuliLoginGmail {
	@Test
	public void gmailLogin() throws SikuliException{
		Screen screen = new Screen();
		Pattern gmail = new Pattern("D://SikuliImages//gmailButton.PNG");
		Pattern signin = new Pattern("D://SikuliImages//SignIn.PNG");
		Pattern username = new Pattern("D://SikuliImages//UserName.PNG");
		Pattern next = new Pattern("D://SikuliImages//Next.PNG");
		Pattern password = new Pattern("D://SikuliImages//Password.PNG");
		Pattern login = new Pattern("D://SikuliImages//Login.PNG");
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		screen.wait(gmail,20);
		screen.click(gmail);
		screen.wait(signin,20);
		screen.click(signin);
		screen.type(username,"sanket.paropate");
		screen.click(next);
		screen.type(password,"password");
		screen.click(login);
			
		
	}

}

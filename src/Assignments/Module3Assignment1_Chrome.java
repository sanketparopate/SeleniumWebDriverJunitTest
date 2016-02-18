package Assignments;   


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Module3Assignment1_Chrome {
	
	String baseURL = "https://university.mongodb.com"; 

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Edureka/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
		@Test
		public void test() {
		driver.get(baseURL);
		String title = driver.getTitle();
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		System.out.println(title);
/*		WebElement element = driver.findElement(By.id("login-button"));
		element.click();
		driver.findElement(By.linkText("Sign up.")).click();
		driver.findElement(By.name("username")).sendKeys("Smith1234");
		driver.findElement(By.name("email")).sendKeys("testemail@abc.com");
		driver.findElement(By.name("password")).sendKeys("sanket@123");
		driver.findElement(By.name("confirm_password")).sendKeys("sanket@123");
		
		
		driver.findElement(By.partialLinkText("Logi")).click();
		//driver.findElement(By.xpath("//*[@id='register-form']/div[15]/div/button")).click();
*/		
		
	}
		
/*		public void select_value_from_dropdown(String vxpathofObject, String vSelectValue){
            driver.findElement(By.xpath(vxpathofObject)).click();
            List<WebElement> service_id = driver.findElements(By.cssSelector(".ng-binding.ng-scope"));
	               for (int i = 0; i < service_id.size(); i++) {
	                       String temp = service_id.get(i).getText();
	                       if (temp.equals(vSelectValue)) {
	                    	   service_id.get(i).click();             
	                               break;
	                       }
	               }   
	               
		}*/
	
	/*@After
	public void tearDown() throws Exception {
		driver.quit();
	}
*/

}


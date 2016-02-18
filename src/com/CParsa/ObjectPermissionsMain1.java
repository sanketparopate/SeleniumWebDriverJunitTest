package com.CParsa;


import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.*;


public class ObjectPermissionsMain1 {
	WebDriver driver;
	String xCheckBoxValidation;
	WebElement aread,bcreate,cedit,ddel,eviewall,fmodifyall;

	@BeforeClass
	public void setUp() throws Exception {
		//int Constant; //needs rivision
		File file = new File("C:/Selenium/chromedriver.exe");    
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		driver = new ChromeDriver();    
		//driver = new FirefoxDriver();    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://advisory--test.cs51.my.salesforce.com/?ec=302&startURL=%2Fhome%2Fhome.jsp");
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"ObjPer1");
	}


	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("parsac@advisory.com.abc.test"); //enter username
		driver.findElement(By.id("password")).sendKeys("CleanClean4"); //enter password
		driver.findElement(By.id("Login")).click(); //
		driver.findElement(By.linkText("Chandana Rajulapati")).click();
		driver.findElement(By.linkText("Setup")).click();
		driver.findElement(By.linkText("Manage Users")).click();
		driver.findElement(By.linkText("Profiles")).click();

		Select ProgAccess = new Select(driver.findElement(By.name("fcf")));
		ProgAccess.selectByVisibleText("SOX - Programs Access");
	}


	public void menuoptionf() throws InterruptedException
	{
		driver.findElement(By.linkText("F")).click();
	}

	public void menuoptions() throws InterruptedException
	{
		driver.findElement(By.linkText("S")).click();
	}
	
	public boolean useActionsforDoubleClick(WebElement eTargetElement, String xCheckBoxStatus){
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class)
		.until(new com.google.common.base.Predicate<WebDriver>() {            
			@Override
			public boolean apply(WebDriver driver) {
				Actions action = new Actions(driver);
				action.doubleClick(eTargetElement).perform(); //double click action perform on the button
				//driver.findElement(By.id("checkoutLink")).click();
				return true;
			}            
		});
		boolean isCheck=driver.findElement(By.xpath(xCheckBoxStatus)).isSelected(); //Check if the CheckBox is Checked
		return isCheck;
	}
	
	@Test (priority = 1)
	public void loader() throws InterruptedException
	{
		login(); 

		List<WebElement> optionCount = driver.findElements(By.xpath("//*[@id='ext-gen11']/div"));
		int sizeoflist = optionCount.size();
		System.out.println("Total number of courses with keyword" +sizeoflist);
		//for(int i=0;i<=sizeoflist;i++)
		/*********************FOR ABC DATA LOADER CREATE*********************************/
		WebElement eCreateCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___0']")); //'Create' Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___0']";
		boolean bCreateCheckBox  = useActionsforDoubleClick(eCreateCheckBox,xCheckBoxValidation);
		System.out.println("Value of Create Checkbox is " +bCreateCheckBox);
		AssertJUnit.assertTrue(bCreateCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
		/*********************FOR ABC DATA LOADER DELETE*********************************/
		WebElement eDeleteCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___3']/img")); //'Delete' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___3']";
		boolean bDeleteCheckBox =useActionsforDoubleClick(eDeleteCheckBox,xCheckBoxValidation);
		System.out.println("Value of Delete Checkbox is " +bDeleteCheckBox);
		AssertJUnit.assertTrue(bDeleteCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
		/*****************************FOR ABC DATA LOADER EDIT****************************************************/
		WebElement eEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQdy_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bEditCheckBox = useActionsforDoubleClick(eEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bEditCheckBox);
		AssertJUnit.assertTrue(bEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}

	@Test(priority =2)
	public void sysadmin() throws InterruptedException
	{
		//driver.navigate().refresh();
		menuoptions();
		Thread.sleep(200);
		/*****************************FOR SYS ADMIN CREATE****************************************************/
		WebElement eSysCreateCheckBox = driver.findElement(By.xpath("//*[@id='00eC00000016HQP_01IC0000000lewVMAQ___0']/img")); //'Create' Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___0']";
		//*[@id="01IC0000000lewVMAQ___0"]
		boolean bSysCreateCheckBox  = useActionsforDoubleClick(eSysCreateCheckBox,xCheckBoxValidation);
		System.out.println("Value of Create Checkbox is " +bSysCreateCheckBox);
		AssertJUnit.assertTrue(bSysCreateCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
		/*****************************FOR SYS ADMIN DELETE****************************************************/
		WebElement eSysDeleteCheckBox = driver.findElement(By.xpath("//*[@id='00eC00000016HQP_01IC0000000lewVMAQ___3']/img")); //'Delete' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___3']";
		boolean bSysDeleteCheckBox =useActionsforDoubleClick(eSysDeleteCheckBox,xCheckBoxValidation);
		System.out.println("Value of Delete Checkbox is " +bSysDeleteCheckBox);
		AssertJUnit.assertTrue(bSysDeleteCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
		/*****************************FOR SYS ADMIN EDIT****************************************************/
		WebElement eSysEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC00000016HQP_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bSysEditCheckBox = useActionsforDoubleClick(eSysEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bSysEditCheckBox);
		AssertJUnit.assertTrue(bSysEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}
	@Test(priority =3)
	public void Finance() throws InterruptedException
	{
		menuoptionf();
		Thread.sleep(200);
		WebElement eFinEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQe6_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bFinEditCheckBox = useActionsforDoubleClick(eFinEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bFinEditCheckBox);
		AssertJUnit.assertTrue(bFinEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}
	@Test(priority =4)
	public void FinanceAcc() throws InterruptedException
	{

		Thread.sleep(200);
		WebElement eFinEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001CQe6_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bFinEditCheckBox = useActionsforDoubleClick(eFinEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bFinEditCheckBox);
		AssertJUnit.assertTrue(bFinEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}
	@Test(priority =5)
	public void FinanceAP() throws InterruptedException
	{            
		Thread.sleep(200);
		WebElement eFinAPEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001WeaT_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bFinAPEditCheckBox = useActionsforDoubleClick(eFinAPEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bFinAPEditCheckBox);
		AssertJUnit.assertTrue(bFinAPEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}

	@Test(priority =6)        
	public void FinanceAR() throws InterruptedException
	{            
		Thread.sleep(200);
		WebElement eFinAREditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001WeaY_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bFinAREditCheckBox = useActionsforDoubleClick(eFinAREditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bFinAREditCheckBox);
		AssertJUnit.assertTrue(bFinAREditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}

	@Test(priority =7)        
	public void FinanceCon() throws InterruptedException
	{            
		Thread.sleep(200);
		WebElement eFinConEditCheckBox = driver.findElement(By.xpath("//*[@id='00eC0000001WeaE_01IC0000000lewVMAQ___2']/img")); //'Edit' Access Checkbox xpath for ABC Dataloader
		xCheckBoxValidation = "//*[@id='01IC0000000lewVMAQ___2']";
		boolean bFinConEditCheckBox = useActionsforDoubleClick(eFinConEditCheckBox,xCheckBoxValidation);
		System.out.println("Value of Edit Checkbox is " +bFinConEditCheckBox);
		AssertJUnit.assertTrue(bFinConEditCheckBox);
		driver.findElement(By.xpath("//*[@id='cancelButton']")).click(); //click on the cancel button
	}

	public void siteslist() throws InterruptedException
	{
		driver.findElement(By.linkText("Chandana Rajulapati")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Setup")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("DevToolsIntegrate_font")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CustomDomain_font")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 8)
	public void site1() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("Advisory Site")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);          
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);
		//aread,bcreate,cedit,ddelete,eviewall,fmodifyall;

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));
		System.out.println("***********Advisory Site*************** ");
		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
			}
			else 
				if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Non Of the Checkboxes are set to true : Valid Condition");
				}
				else
				{
					System.out.println("Please Check Object Permissions for 'Advisory Site' for validation");
				}
	}
	//driver.findElement(By.xpath(""));
	@Test(priority = 9)        
	//@Ignore
	public void site2() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("Advisory Subscription Sites")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);

		System.out.println("*********Advisory Subscription Sites***************** ");
		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));

		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else
			if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
			}
			else 
				if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
				}


				else
				{
					System.out.println("Please Check Object Permissions for 'Advisory Subscription Sites' validate permissions");
				}
	}
	@Test(priority = 10)        
	//@Ignore
	public void site3() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("Cimson Meeting Site")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));
		System.out.println("*********Crimson Meeting Site ***************** ");

		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
			}
			else
				if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
				}
				else
				{
					System.out.println("Please Check Object Permissions for 'Crimson Meeting Site' validate permissions");
				}

	}

	@Test(priority = 11)    
	//@Ignore
	public void site4() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("Common Auth Site")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));
		System.out.println("********* Common Auth Site ***************** ");

		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
			}
			else
				if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
				}                        
				else
				{
					System.out.println("Please Check Object Permissions for 'Common Auth Site' validate permissions");
				}

	}
	@Test(priority = 12)
	//@Ignore
	public void site5() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("Crimson Support Center")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));
		System.out.println("********* Crimson Support Center ***************** ");
		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
			}
			else 

				if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
				}
				else
				{
					System.out.println("Please Check Object Permissions for 'Crimson Spport Center' for validate permissions");
				}

	}
	@Test(priority = 13)
	//@Ignore
	public void site6() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("EAB Site")).click();
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		driver.findElement(By.linkText("Programs")).click();

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));

		System.out.println("********* EAB Site ***************** ");

		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
			}
			else

				if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
				}
				else
				{
					System.out.println("Please Check Object Permissions for 'EAB Site' for validate permissions");
				}

	}
	@Test(priority = 14)
	public void site7() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("LiquidPlanner")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));

		System.out.println("********* LiquidPlanner***************** ");
		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
			}
			else
				if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
				}
				else
				{
					System.out.println("Please Check Object Permissions for 'Liquid Planner' for validate permissions");
				}

	}
	@Test(priority = 15)

	public void site8() throws InterruptedException
	{
		siteslist();
		driver.findElement(By.linkText("MyAdvisoryIdeas")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='thePage:form:thePageBlock:pageBlockButtons:pas']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id96:0:j_id97:j_id98:j_id100:j_id108:2:j_id110']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Programs")).click();
		Thread.sleep(2000);

		aread = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:0:olp_check']"));
		bcreate = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:1:olp_check']"));
		cedit = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:2:olp_check']"));
		ddel = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:3:olp_check']"));
		eviewall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:4:olp_check']"));
		fmodifyall = driver.findElement(By.xpath("//*[@id='page:console:j_id77:j_id78:j_id79:j_id101:j_id102:objects_tabs_detail:j_id120:0:j_id122:j_id123:j_id124:j_id176:j_id177:5:olp_check']"));
		System.out.println("********* MyAdvisoryIdeas ***************** ");
		if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
		{
			System.out.println("Only Read CheckBox is Checked: Valid Condition");
		}
		else 
			if((aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (eviewall.isSelected()) && (!fmodifyall.isSelected()))
			{
				System.out.println("Read CheckBox and View All Checkbox are Checked: Valid Condition");
			}
			else
				if((!aread.isSelected()) && (!bcreate.isSelected())  && (!cedit.isSelected()) && (!ddel.isSelected()) && (!eviewall.isSelected()) && (!fmodifyall.isSelected()))
				{
					System.out.println("Non Of the Checkboxes are set to True : Valid Condition");
				}
				else
				{
					System.out.println("Please Check Object Permissions for 'MyAdvisoryIdeas' for validate permissions");
				}

		//driver.close();
	}    

	@AfterClass
	public void Teardown() 
	{
		driver.quit();

	}
}

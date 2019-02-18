package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
//ctrl+shift+O ===> for auto import
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{

	//initialized with Global variable:
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	TasksPage tasksPage;
	
	public HomePageTest(){
		super(); //super keyword is help for my propertyFile will be defined from the super class(TestBase class) // so we can call super class constructor with help of the super(); keyword...--- for connection of TestBase class(parent class) to HomePageTest class(child class).
	}
	
	//test cases should be separated -- independent with each other
	//@before method each test case -- launch the browser and login
	//@Test -- execute test case
	//@after method each test case -- close the browser 

	@BeforeMethod
	public void setUp() throws InterruptedException{
		
		//create a object with that particular class:
		
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		dealsPage = new DealsPage();
		tasksPage = new TasksPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO", "Home page title is not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void clickOnContactsLinkTest(){
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(priority=4)
	public void clickOnDealsLinkTest(){
		testUtil.switchToFrame();
		dealsPage = homePage.clickOnDealsLink();
	}
	
	@Test(priority=5)
	public void clickOnTasksLinkTest(){
		testUtil.switchToFrame();
		tasksPage = homePage.clickOnTasksLink();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit(); 
	}





}

package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.util.TestUtil;

import java.io.IOException;

public class ContactsPageTest extends TestBase{
	
	//initialized with Global variable:
		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		ContactsPage contactsPage;
		DealsPage dealsPage;
		TasksPage tasksPage;
		
		String sheetName = "contacts";
		
	public ContactsPageTest(){
		super(); //then i can call my super class constructor to initialized my properties.
		
	}
	
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
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
	

   
   }
   
   @Test(priority=1)
   public void verifyContactsPageLabelTest(){
	   Assert.assertTrue(contactsPage.verifyContactsPageLabel(),"Contact label is missing on the page");
   }
	
	@Test(priority=2)
	public void selectSingleContactsTest(){
		contactsPage.selectContactsByName("Rohini Akter");
	}
	
	@Test(priority=3)
	public void selectMultipleContactsTest(){
		contactsPage.selectContactsByName("Rohini Akter");
		contactsPage.selectContactsByName("Nisha Patel");
		contactsPage.selectContactsByName("Steve Kim");
	}
	
	@DataProvider
	public void gerCRMTestData(){
		TestUtil.getTestData(sheetName);
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Eric", "Thomas", "Google");
		contactsPage.createNewContact(title, firstName, lastName, company);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit(); 
	}



}

package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
//	@BeforeSuite -- Setup system property for Chrome
//	@BeforeTest -- launching Chrome Browser
//	@BeforeClass -- enter URL

//	@BeforeMethod -- login to the app
//	@Test -- google Title Test
//	@AfterMethod -- logout from app

//	@BeforeMethod -- login to the app
//	@Test - Search Test
//	@AfterMethod -- logout from app

//	@AfterClass -- Delete all the cookies
//	@AfterTest -- close browser
//	
	//Pre-conditions annotations -- starting with @Before
	@BeforeSuite //1
	public void setUp(){
		System.out.println("@BeforeSuite -- Setup system property for Chrome");
	}
    @BeforeTest //2
    public void launchBrowser(){
    	System.out.println("@BeforeTest -- launching Chrome Browser");	
    }
	@BeforeClass //3
    public void enterUrl(){
		System.out.println("@BeforeClass -- enter URL");	
	}
	@BeforeMethod //4
    public void lonIn(){
		System.out.println("@BeforeMethod -- login to the app");	
	}
	//Test cases -- starting with @Test
	@Test //5
	public void googleTitleTest(){
		System.out.println("@Test -- google Title Test");	
	}
	@Test
	public void searchTest(){
		System.out.println("@Test - Search Test");
	}
	//Post conditions -- starting with@After
	@AfterMethod //6
	public void logOut(){
		System.out.println("@AfterMethod -- logout from app");
	}
	@AfterClass //7
	public void deleteAllTheCookies(){
		System.out.println("@AfterClass -- Delete all the cookies");
	}
	@AfterTest //8
	public void closeBrowser(){
		System.out.println("@AfterTest -- close browser");
	}
	@AfterSuite //9
	public void generateTestReport(){
		System.out.println("@AfterSuite -- Generate the Test Reports");
	}
	


 




































}

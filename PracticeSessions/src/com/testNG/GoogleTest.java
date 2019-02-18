package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	// priority=1 --- sequence maintain for the execution
	// groups="anyGroupName" --- multiple test cases we make in a group
	
	@Test(priority=1,groups="Title Test")
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="Logo Test")
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=3,groups="Link Test")
	public void gmailLinkTest(){
		boolean b1 = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1(){
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2(){
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3(){
		System.out.println("Test3");
	}
	
	@Test(priority=7,groups="Test")
	public void test4(){
		System.out.println("Test4");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	//Index.html location path:
	//C:\Users\sabrina\AppData\Local\Temp\testng-eclipse--1593506212\testng-customsuite.xml 
	
}

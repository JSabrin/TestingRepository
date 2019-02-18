package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

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
	
	@Test()
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	
		// no need to write if-else condition for check the validation 
		// in that case we can use Assert.assertEquals methods (actual, expected) results
		
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	
	@Test()
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}

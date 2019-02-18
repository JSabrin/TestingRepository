package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium{
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
      System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
      driver = new ChromeDriver();
	driver.get("http://www.gmail.com");
		
	}
	@Test
	public void Test1(){
		
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

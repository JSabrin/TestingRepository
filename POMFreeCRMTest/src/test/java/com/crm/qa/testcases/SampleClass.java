package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClass {
	
	public static WebDriver driver =null;
	
	@BeforeMethod
	
	public void setUp(){
		//we need to write system setProperty Provide two paramethers, specify the driver and provide driver .exe path
		System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
		// then intentiate the driver
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
		@Test
		public void enterText(){
			
			driver.findElement(By.name("q")).sendKeys("sabrina");
			
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		
	}

}

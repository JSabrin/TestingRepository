package com.data.driven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		//get test data from excel:
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sabrina\\workspace\\Project1\\src\\com"
		 		+ "\\excel\\data\\HalfEbay.Test.Data.xlsx");
		 String firstname = reader.getCellData("RegTestData", "firstname", 2);
		 System.out.println(firstname);
		 
		 String lastname = reader.getCellData("RegTestData", "lastname", 2);
		 System.out.println(lastname);
		 
		 String address1 = reader.getCellData("RegTestData", "address1", 2);
		 System.out.println(address1);
		 
		 String address2 = reader.getCellData("RegTestData", "address2", 2);
		 System.out.println(address2);
		 
		 String city = reader.getCellData("RegTestData", "city", 2);
		 System.out.println(city);
		 
		 String state = reader.getCellData("RegTestData", "state", 2);
		 System.out.println(state);
		 
		 String zipcode = reader.getCellData("RegTestData", "zipcode", 2);
		 System.out.println(zipcode);
		 
		 String emailaddress = reader.getCellData("RegTestData", "emailaddress", 2);
		 System.out.println(emailaddress);
		 
		 //WebDriver code:
		System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
		 driver = new ChromeDriver(); //launch chrome
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); //enter url
		 
		 driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
		 driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
		 driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);
		 driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(address2);
		 driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
		 
		 Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
		 select.selectByVisibleText(state);
		 driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipcode);
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailaddress);
		 driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailaddress);
		 
		 driver.quit();
		 
		 


		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

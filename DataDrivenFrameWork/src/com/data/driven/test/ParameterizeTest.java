package com.data.driven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {

		// WebDriver code:
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter
																									// url

		// Data Driven Approach ---- used to create data driven Framework
		// DDF(Parameterization)----Driving the test data from excel file or
		// from other file.

		// get test data from excel:
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\sabrina\\workspace\\Project1\\src\\com\\excel\\data\\HalfEbayTestData.xlsx");

		int rowCount = reader.getRowCount("RegTestData");

		reader.addColumn("RegTestData", "status");

		// Parameterization:
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			System.out.println("***********************");
			String firstname = reader.getCellData("RegTestData", "firstname",
					rowNum);
			System.out.println(firstname);

			String lastname = reader.getCellData("RegTestData", "lastname",
					rowNum);
			System.out.println(lastname);

			String address1 = reader.getCellData("RegTestData", "address1",
					rowNum);
			System.out.println(address1);

			String address2 = reader.getCellData("RegTestData", "address2",
					rowNum);
			System.out.println(address2);

			String city = reader.getCellData("RegTestData", "city", rowNum);
			System.out.println(city);

			String state = reader.getCellData("RegTestData", "state", rowNum);
			System.out.println(state);

			String zipcode = reader.getCellData("RegTestData", "zipcode",
					rowNum);
			System.out.println(zipcode);

			String emailaddress = reader.getCellData("RegTestData",
					"emailaddress", rowNum);
			System.out.println(emailaddress);

			// enter the data:
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(
					firstname);
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(
					lastname);
			driver.findElement(By.xpath("//*[@id='address1']")).clear();
			driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(
					address1);
			driver.findElement(By.xpath("//*[@id='address2']")).clear();
			driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(
					address2);
			driver.findElement(By.xpath("//*[@id='city']")).clear();
			driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
			// drop down method:
			Select select = new Select(driver.findElement(By
					.xpath("//*[@id='state']")));
			select.selectByVisibleText(state);
			driver.findElement(By.xpath("//*[@id='zip']")).clear();
			driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipcode);
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(
					emailaddress);
			driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
			driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(
					emailaddress);

			reader.setCellData("RegTestData", "status", rowNum, "pass");// write
																		// the
																		// data
																		// into
																		// the
																		// excel.

		}

	}

}

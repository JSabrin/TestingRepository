package Test_Pattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		DriverInit instanceDriver = DriverInit.getInstance();
		instanceDriver.openBrowser();
	}
	
	@Test
	public void testMethod1(){
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	/*@Test
	public void testMethod2(){
		System.out.println(driver.getPageSource());
	}
	*/
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}

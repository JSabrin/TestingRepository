package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectByJavascriptExecutor {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize(); //maximize the windows
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic Wait:
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //for all the page loaded
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait //for all the element loaded

		driver.get("https://www.spicejet.com/"); //enter URL
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal = "Sep 20 2018";  //"30-December-2018";
		
		WebElement date1 = driver.findElement(By.id("ctl00_mainContent_view_date2"));
		String dateValof = "Dec 20 2018";  //"30-December-2018";
		
		selectDepartDateByJS(driver, date, dateVal);
		selectReturnDateByJS(driver, date1, dateValof);
	}
		
	
		public static void selectDepartDateByJS(WebDriver driver, WebElement element, String dateVal){
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
			
		}
		
		public static void selectReturnDateByJS(WebDriver driver, WebElement element, String dateVal){
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
			
		}
		
		

	

}

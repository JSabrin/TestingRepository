package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait
		
		driver.get("https://www.facebook.com/"); //enter url
		
		clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_2']")), 20);
		
	}
	//Explicit Wait:
	//we use explicit wait for the specific element
	//if the element will found let's see in 5 seconds, so remain 15 seconds will be ignore totally and program will be continue bcoz explicit wait it's dynamic in nature 

	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	 //2. Explicit wait:
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
	 
	 //For explicit wait we need to create WebDriverWait object.when we know specific element 
	 //need extra time to loaded then we can use explicit wait for that particular code.
	 
	 // Diff between Implicit & Explicit:
	 //If we want to wait for the particular/specific element then we can use Explicit wait and 
	 //If we want to specifier timer for the entire page then we can go for implicit wait.
	 

}

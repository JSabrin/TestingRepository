 package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize(); //maximize the windows
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic Wait:
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //for all the page loaded
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait //for all the element loaded

		driver.get("https://www.freecrm.com/register/"); //enter URL
	
		//1. isDisplayed() method: is applicable for all the elements. 
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); //for submit button
		System.out.println(b1); //true
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); //false
		
		//make it isEnabled now:
		//Select I agree checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3); //true
		
		//3. isSelected() method: -- only applicable for checkbox, dropdown, radiobutton
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4); //true
		
		//de-select the checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5); //false
	
	
	
	
	}

}

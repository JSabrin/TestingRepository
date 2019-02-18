package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1.FF Browser:--geckodriver:
		/*System.setProperty("webdriver.gecko.driver", "C:\\All Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		//note: FirefoxDriver is a Class which is implementing WebDriver Interface.
		//new FirefoxDriver = Object
		//driver = Reference varialbe
		
		//2.Chrome Browser:
		System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch browser
		
		driver.get("https://www.google.com"); //enter URL
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//Validation Title of the page:
		String title = driver.getTitle(); //store in a String
		System.out.println(title);
		
		//System.out.println(driver.getTitle());
		
		if(title.equals("Google")){
			System.out.println("this is correct title");
		}else{
			System.out.println("this is not correct title");
		}
		
		driver.quit();
		
	}

}
 
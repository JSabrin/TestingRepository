package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsConcept {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait
		
		driver.get("https://www.google.com/"); //enter url
		
		driver.navigate().to("http://www.facebook.com"); //for external url, we use navigate().to("");
		
		Thread.sleep(2000);
		
		//back and forward buttons simulation:
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();

		Thread.sleep(2000);
		
		driver.navigate().back();
	
		driver.navigate().refresh();
	
	
	}

}

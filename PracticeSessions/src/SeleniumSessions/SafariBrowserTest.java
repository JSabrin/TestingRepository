package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserTest {

	public static void main(String[] args) {
		
		//Q: How to launched safari Browser with selenium?
		//Ans:1. use Safari extension for Selenium.
		//2. Need to enable-- Allow Remotes Automation.
		
		//you don't need to create setproperties for safaridriver bcoz safari by default for Mac
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		

	}

}

package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		//Q:How many handle pop up in selenium?
		
		//1.alerts pop up -- JavaScript pop up -- Alert API(accept, dismiss)
		//2.File upload pop up -- Browse button(type = file, sendKeys(path)
		//3.Browser window pop up -- Advertisement pop up(windowHandler API -- getWindowHandles() methods using)
		//                          It returns List<String> of objects.
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait
		
		driver.get("https://www.ebay.com/"); //enter url
		
		//1. get the total count of links on the page
		//2. get the text of each link on the page
		
		//all the links are represented by <a> html tag.
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linkList:
		System.out.println(linkList.size());
		
		
		//name/text of all linkList:
		for (int i=0; i<linkList.size(); i++){
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		
		
		
		

	}

}


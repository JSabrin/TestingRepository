package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait
		
		driver.get("https://www.ebay.com/"); //enter url
		
		//absolute xpath: not recommended
		//*[@id='mainContent']/div[1]/ul/li[8]/a
		
		//disadvantages of absolute xpath:
		//1. performance issue
		//2. not reliable
		//3. can be changed at anytime in future
		
		//advantages of customize xpath:
		//1. very fast
		//2. syntax is very simple
		//3. performance issue is not there
		//4. and it's unique & generic
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("mobile");
		//driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("iphone"); //contains it is a library of xpath.when you use contains make sure you use , not =
		
		//handle dynamic id: (html tag = input)
		//id = test_123
		//By.id("test_123")
		
		//starts-with:
		//id = test_456 suppose tomorrow change id value
		//id = test_789
		//id = test_test_789_test -- then use contains or starts-with 'test_test_'
		
		//ends-with:
		//id =1234_test_t
		//id = 5642_test_t
		//id = 45622_test_t
		
		// 3 functions use to handle dynamic id: contains, starts-with, ends-with
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("that for we use contains function");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("another function of xpath 'starts-with'");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("another function");
	
		//for links: custom xpath:
		//all the links are represented by <a> html tag.
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click(); //text() it is a another function but don't use @for text
	
	
	
	
	
	}

}

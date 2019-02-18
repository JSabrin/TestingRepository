package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();//launching Browser
	
	//HtmlUnitDriver:
	//when we have very small test cases & immediately we like to execute >
	//couple of feature again and again in that case we will use HtmlUnitDriver.
	
	//HtmlUnitDriver is not available After Selenium 3.x version.Before it is a part of Selenium jar file.
	//HtmlUnitDriver -- to use that we need to download HtmlUnitDriver jar & after download add the jar file on your project.(java BuildPath->libraries->add external jar).
	
	//Advantages:
	//1.Testing is happening behind the scene -- no browser launched.
	//2.very fast -- execution of test cases -- very fast -- performance of the script.
	//3.It's also called Ghost driver because nothing is visible.
	//4.Also we can say it is a Headless Browser.
	//5.There are lot of headless browser like---
	// HtmlUnitDriver ---- for Java
	// PhantomJS ---- for JavaScript
	//Limitations:
	//1.Not suitable for Actions class--- user actions: MouseMovement,doubleClick,Drag and Drop
	
	
	WebDriver driver = new HtmlUnitDriver();
	
	driver.manage().window().maximize();//maximize the window
	driver.manage().deleteAllCookies();//delete all cookies for that its give you refresh the browser
	//Static Wait:Thread.sleep
	//Dynamic Wait:implicit wait,Explicit wait,Fluent wait,pageLoad wait
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com");// enter Url
	
	System.out.println("Before login title is === "+ driver.getTitle());
	driver.findElement(By.name("username")).sendKeys("jsabrin");
	driver.findElement(By.name("password")).sendKeys("test123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	System.out.println("After login title is === "+ driver.getTitle());
	

	}

}

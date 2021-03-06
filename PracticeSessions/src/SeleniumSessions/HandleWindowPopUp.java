package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait
		
		driver.get("http://www.popuptest.com/goodpopups.html"); //enter url
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("child window pop up title: "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("parent window title: " + driver.getTitle());

	}

}

package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize(); //maximize the windows
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic Wait:
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //for all the page loaded
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait //for all the element loaded

		driver.get("https://www.freecrm.com/"); //enter URL
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");

		// links -- //a href <http://www.google.com>
		// images -- //img href <http://www.test.com>
		
		//1. Get the list of all the liks and images:
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images: =====> " + linksList.size());
		
		// for active links which have href<value>
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. iterate linkList: exclude all the links/images -- doesn't have any href attribute
		for(int i=0; i<linksList.size(); i++){
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href") != null){
			activeLinks.add(linksList.get(i));	
			}
		}
		
		// get the sixe of active links list:
		System.out.println("size of active links and images: =====> "+ activeLinks.size());
		
		//3. check the href url, with http connect api:
		//200 -- ok
		//404 -- not found 
		//500 -- internal error
		//400 -- bad request
		
		for(int j=0; j<activeLinks.size(); j++){
			
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "=====>" + response);
			
		
	
		
		}
	}

}

package PracticeWithSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		//setUp System.setProperty
		System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
        
		//initialize browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//delect all cookies on the webpage
		driver.manage().deleteAllCookies();
		
		//wait time set for entire pageLoad
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//wait time set for all the WebElement on this app
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//get the URL
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		//get the all links in the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Number of links
		System.out.println(links.size());
		
		//this is another way to get the all link text on console
		/*for(WebElement ele: links)
			System.out.println(ele.getText());*/ //output all links name
		
		//second way:
		for(int i=0; i<links.size(); i++){
			//by using href attribute we can get URL of required link
			//System.out.println(links.get(i)); //output all links by id
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href"); //return all the URL of link
			//System.out.println(url);
			
			URL link = new URL(url);
			
			//create a connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(2000);
			
			//establish Connection
			httpConn.connect();
			
			int rescode = httpConn.getResponseCode(); //return response code. 
			                                          //If resCode is above 400:then Brokenlink
			
		    if(rescode >= 400){
		    	System.out.println(url + " -- " + " is broken link");
		    }else {
		    	System.out.println(url + " -- " + " is valid link");
		    }
			
			
		}
		
		
		driver.close();
		
		
		
	}

}

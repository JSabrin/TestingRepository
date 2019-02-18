package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties(); //create object of Properties class.from javautil
		
		FileInputStream ip = new FileInputStream("C:\\Users\\sabrina\\workspace\\PracticeSessions\\src\\SeleniumSessions\\config.properties"); //create object of FileInputStream class

		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		System.out.println(prop.getProperty("URL"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\All Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); // launch browser
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.firefox.driver",
					"C:\\All Drivers\\geckodriver.exe");
			driver = new FirefoxDriver(); // launch browser
		}else if(browserName.equals("IE")){
			System.setProperty("webdriver.firefox.driver",
					"C:\\All Drivers\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver(); // launch browser
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
		
		
	}

}

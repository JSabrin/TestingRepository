package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		WebElement element = wait (ExpectedConditions.elementToBeClickable(By.("")))
//		
		
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Steve");
		driver.findElement(By.name("pass")).sendKeys("kim");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		
		
		
		
		
		
		
		//driver.findElement(By.partialLinkText("in")).click();
//		driver.findElement(By.id("lst-ib")).click();
//		driver.findElement(By.id("lst-ib")).sendKeys("Amazon");
//		
		
		/*
	    Element =object
		locator = property
	    locator value = value*/
	    

	}

}

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		// 2.Chrome Browser:
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //enter url
		
		//Handle AlertPopUp Message:
		driver.findElement(By.name("proceed")).click(); //click on Go button
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert(); //switchTo the alert message
		//System.out.println(alert.getText()); //get the alert text
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct alert message");
		}else{
			System.out.println("in-correct alert message");
		}
		alert.accept(); //click on OK button
		//alert.dismiss(); //click on Cancel button
		
		driver.quit();
		
		
		
	}

}

package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {

		// 2.Chrome Browser:
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser

		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url

		driver.findElement(By.id("firstname")).sendKeys("Steve");
	    driver.findElement(By.id("lastname")).sendKeys("Peter");
	    driver.findElement(By.cssSelector("#address1")).sendKeys("10-52 62 street, NY");
	    driver.findElement(By.xpath("//*[@id='city']")).sendKeys("New York");
	    
	    //Handle DropDown/dropbox:
	    //by Select class - make Selectclass with Select object - then pass which element you want to perform Action
	    
	    Select select = new Select(driver.findElement(By.id("state")));
	    //select.selectByVisibleText("Arizona");
	    
	    //select.selectByIndex(3);
	    select.selectByValue(""); //i have to check with value
	    List<WebElement> op = select.getOptions();
	    System.out.println("The select value are " + op);
	   
	}

}

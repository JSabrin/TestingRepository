package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		*/
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize(); //maximize the windows
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic Wait:
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //for all the page loaded
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait //for all the element loaded

		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2"); //enter URL
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
		System.out.println(list.size());
		
		//Select for individual checkbox("Angular"):
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("Angular")){
				list.get(i).click();
				break;
			}
		
		
		//Selecting all the checkbox/options element:
		/*for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
				list.get(i).click();
				
			}*/
		
		}
	}

}

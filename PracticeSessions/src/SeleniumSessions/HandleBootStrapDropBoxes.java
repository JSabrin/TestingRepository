package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrapDropBoxes {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize(); //maximize the windows
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic Wait:
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //for all the page loaded
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //dynamic wait //for all the element loaded

		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/"); //enter URL
		
		driver.findElement(By.id("dropdownMenuButton")).click(); //button click
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu'and@aria-labelledby='dropdownMenuButton']//a"));
		System.out.println(list.size());

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
			/*if(list.get(i).getText().contains("Another action")){
				list.get(i).click();
				break;
				}
				
				*/
		
		
		}
	}

}

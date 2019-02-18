package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		// 2.Chrome Browser:
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser

		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
																									

		// 1. xpath:-- 2
		// absolute xpath should not be used --- html/body/div[1]/div[5]/div[2]/a
		// relative xpath should be used --- //*[@id='firstname']
		/*
		 * driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Thomas"
		 * );
		 * driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Kim");
		 * driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(
		 * "10-52 62 street, NY");
		 * driver.findElement(By.xpath("//*[@id='city']")).sendKeys("New York");
		 * driver.findElement(By.xpath("//*[@id='state']")).sendKeys("");
		 */

		// 2. id: --1
		/*
		 * driver.findElement(By.id("firstname")).sendKeys("Steve");
		 * driver.findElement(By.id("lastname")).sendKeys("Peter");
		 */

		// 3. name: --3
		driver.findElement(By.name("firstname")).sendKeys("Tom");
		driver.findElement(By.name("lastname")).sendKeys("Sean");

		// 4.linkText:this is only for link--
		/*driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Fashion")).click();
*/
		// 5.partialLinkText: // not useful
		//driver.findElement(By.partialLinkText("How to pick")).click();
	
		// 6.CSSSelector: --2
		//if id is there --- #{id value}
		//if class is there -- .{class value}
		driver.findElement(By.cssSelector("#address1")).sendKeys("10-52 62 street, NY");
	
		//7. className: not useful --4
		driver.findElement(By.className("ancAsb")).click();
	
		//tagName:
		
	
	}

}

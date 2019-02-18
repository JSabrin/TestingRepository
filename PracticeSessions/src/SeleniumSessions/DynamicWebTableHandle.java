package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		

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
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[9]/td[2]/a
		
		
		// Method-1:
		
		/*String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		
		for (int i=4; i<=24; i++){
			String name = driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText(); 
			System.out.println(name);
			if(name.contains("Amita Mani")){
				//*[@id='vContactsForm']/table/tbody/tr[12]/td[1]/input				
				//driver.findElement(By.name("Amita Mani")).click(); //--- not good xpath for WebTable 
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" + i + "]/td[1]/input")).click();
			}
			
		}*/
		
		// Method-2:
		
		//note: td means = column, tr means = rows
		//a[contains(text(),'Amit Mohanty')]/parent::td//preceding_sibling::td//input[@name='contact_id'] 
		driver.findElement(By.xpath("//a[contains(text(),'Amit Mohanty')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'aa1 Cris')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Akshay Kumar')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click(); 

		//driver.quit();

	}

}

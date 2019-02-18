package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

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
		
		String date = "05-September-2018";
		String dateArr[] = date.split("-"); //{18,September,2018}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]
		
		String before_xpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		final int totalWeekDays = 7;
		
		//row - colomn // tr - td
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-1 3-2 3-3 3-4 3-5 3-6 3-7
		 
		boolean flag = false;
		String dalVal =  null;
		
		for(int rowNum=2; rowNum<=7; rowNum++){
			
			for(int colNum=1; colNum<=totalWeekDays; colNum++){
				
				try{
				dalVal = driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).getText();
				}catch(NoSuchElementException e){
					System.out.println("Please enter a correct data value");
					flag = false;
					break;
				}
					
				
				System.out.println(dalVal);
			
			if(dalVal.equals(day)){
				driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).click();
				flag = true;
				break;
			}
			
			}
		
			if(flag){
				break;
		
		}
		
		
		}
		

	}

}

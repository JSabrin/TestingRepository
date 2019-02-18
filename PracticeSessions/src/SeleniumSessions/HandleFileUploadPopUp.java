package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		
		//Handle fileUpload PopUp:
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\sabrina\\Desktop\\LoginData.xlsx");
		
		//type-"file" should be present for browser/AttachFile/UploadFile buttons
		//to handle fileUpload PopUp selenium can not handle Windows Popup -- in that case we not gonna click Browse button--
		//we will get the inspect on Browse --then .sendKeys(""); "pass the location path"
	}

}

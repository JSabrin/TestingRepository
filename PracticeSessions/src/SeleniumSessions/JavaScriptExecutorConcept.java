package SeleniumSessions;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;










import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\All Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		//driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all cookies
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com"); // enter url 
		
		driver.findElement(By.name("username")).sendKeys("jsabrin");
		driver.findElement(By.name("password")).sendKeys("test1234");
		
		// driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//JavascriptExecutor?? -- JavasvriptExecutor it is a class and we have to cast a driver into the JavascriptExecutor.
		// executeScript method --- it is used to execute javaScript code
		
	
		WebElement loginBtn = driver.findElement(By
				.xpath("//input[contains(@type,'submit')]"));//login Button
		
		flash(loginBtn, driver);//highlight the element
		drawBorder(loginBtn, driver);//draw a border
		
		//takes screenShot:
		//takes ScreenShot and store asPracticeSessions a file format
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyFile method
        FileUtils.copyFile(src, new File("C:\\Users\\sabrina\\workspace\\PracticeSessions\\src\\SeleniumSessions\\loginDefect.png"));
        
        //generate Alert
        //generateAlert(driver, "There is a defect in login button");
        
        //click on any element by using JS executor
         clickElementByJS(loginBtn, driver);
        
        //refresh the page:
        //1.by using selenium
         driver.navigate().refresh(); //refresh the page by using Selenium
        
        //2.by using JS executor
        refreshBrowserByJS(driver);
        
        //get the title of the page by JS:
        System.out.println(getTitleByJS(driver));
        
        //get the page text:
        System.out.println(getPageInnerTextByJS(driver));
	
        //scroll page down:
        //scrollPageDown(driver);
        
        WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
        scrollIntoView(forgotPwdLink, driver);
	
	
	
	
	}
	//JavascriptExecutor?? -- JavasvriptExecutor it is a class and we have to cast a driver into the JavascriptExecutor.

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgColor, element, driver);

		}
	}
 
	public static void changeColor(String color, WebElement element,
			WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}
	
	public static void drawBorder(WebElement element ,WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver,String message){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert'"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element );
	}

	public static void refreshBrowserByJS(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerTextByJS(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	
	
	
	
	
}

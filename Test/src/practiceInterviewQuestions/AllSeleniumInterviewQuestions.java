package practiceInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AllSeleniumInterviewQuestions {
	static WebDriver driver;

	
	public boolean isAlertPresent(){
		
		try{
			driver.switchTo().alert();
			return true;
		}catch (Exception e){
			return false;
			
		}
	}


	@Test
	public static void allSeleniumInterviewQuestions() throws IOException{
		
	System.setProperty("webdriver.chrome.driver", "C:\\All Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 //Alert -- class:
	 driver.switchTo().alert().accept();
	 driver.switchTo().alert().dismiss();
	 Alert text = driver.switchTo().alert();
	 System.out.println(text.getText());
	 
	 System.out.println("*************************");
	 
	 //switchTo frame: based in 3 ways (1.name 2.index 3.WebElement)
	 driver.switchTo().frame("frame");
	 driver.switchTo().frame(0);
	 driver.switchTo().frame(driver.findElement(By.xpath("***")));
	 
	 System.out.println("****************************");
	 
	 //Window Handle:
	 String pWindow = driver.getWindowHandle(); //return parent window
	 Set<String> allWindows = driver.getWindowHandles(); //return all the windows with Set of String
	 
	 //Q: what is the return type of getWindowHandles? //Ans: getWindowHandle return the Set of String.
	 Iterator<String> allWindow = allWindows.iterator(); //iterate the multipule windows
	 String parentWindow = allWindow.next(); //move to next window
	 driver.switchTo().window(parentWindow); //child to parent window
	 String childWindow = allWindow.next(); //move to child Window
	 driver.switchTo().window(childWindow); //parent to child window
	 driver.switchTo().defaultContent(); //childWindow to defaultWindow
	 
	 System.out.println("**********************************");
	 
	 //Wait conditions:
	 //1. implicit wait:
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 //Basically implicit wait it is applicable for entire page. So driver will wait till 30 seconds to loaded 
	 //all the DOM(Document Object Model)of the page if is loaded before 30 seconds then it will not wait 
	 //for extra seconds and if it will not loaded till 30 seconds then it will give you TimeOut Exception 
	 
	 //2. Explicit wait:
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
	 
	 //For explicit wait we need to create WebDriverWait object.when we know specific element 
	 //need extra time to loaded then we can use explicit wait for that particular code.
	 
	 //If we want to wait for the particular element then we can use Explicit wait and If we want
	 //to specifier timer for the entire page then we go for implicit wait.
	 
	 System.out.println("------------------------------");
	 
	 //Mouse Over: how to do mouse over in selenium? -- to use Actions class
	 Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
	 
	 System.out.println("--------------------------------");
	 
	 //How to select data in the dropdown? -- to use Select class
	 
	 Select sel = new Select(driver.findElement(By.xpath("")));
	 sel.selectByIndex(4);
	 sel.selectByValue("");
	 sel.selectByVisibleText("selenium");
	
	 //How you select all data from the dropdown? -- by using List of WebElement List<WebElement>
	 List<WebElement> op = sel.getOptions();
	 
	 System.out.println("-----------------------------");
	 
	 //DragAndDrop in selenium:
	 //we have to create Actions object with Actions class  
	 Actions act1 = new Actions(driver);
	 act1.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
	
	System.out.println("-------------------------------");
	
	//Screenshot: in selenium
	//Directly we can not take a screen shot in selenium.We have to cast our driver to TakesScreenshot class.

	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File ("c://test//secrrenshot//login"+".png"));
	
	System.out.println("-------------------------------");
	
	//Cordinate in selenium:
	driver.manage().window().getPosition().getX();
	driver.manage().window().getPosition().getY();
	Point position = driver.manage().window().getPosition(); //Point is a interface in Selenium.If we store into a variable
	position.getX();
	position.getY();
	
	System.out.println("---------------------------------");
	
	//Four Navigate to in selenium:
	driver.navigate().to("www.freecrm.com");
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().back();
	
	System.out.println("--------------------------------");
	
	//How you get the URL of that page?
	String curl = driver.getCurrentUrl(); //if I store into a variable it will return a String
	System.out.println(curl);
	driver.getTitle();
	
	System.out.println("-------------------------------");
	
	//How you can count similar object current/present in the UI?
    int e = driver.findElements(By.xpath("")).size();
	
    System.out.println("-----------------------------");
	
	driver.findElement(By.xpath("@id[@name='Test']/following-sibling::td[2]"));
	driver.findElement(By.xpath("@id[@name='Test']/preceiding-sibling::td[2]"));
	driver.findElement(By.xpath("@id[@name='Test']/child::td[2]"));
	
	System.out.println("---------------------------");
	
	//How you get the element number 5?
	driver.findElements(By.xpath("")).get(5);
	
	System.out.println("------------------------");
	
	// How to check that while element is selected or not?
	
	driver.findElement(By.xpath("")).isSelected();
	driver.findElement(By.xpath("")).isDisplayed();
	driver.findElement(By.xpath("")).isEnabled();
	//this all selenium API.
	
	System.out.println("--------------------------");
	
	//How to execute JavascriptExecutor in selenium?
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
	javascriptExecutor.executeScript("return Window.length");
	
	System.out.println("--------------------------------");
	
	//How to do maximize the window?
	driver.manage().window().maximize();
	driver.get("URL");
	
	System.out.println("---------------------------------");
	
	//What is difference between / or //?
	
	// "/" single slash / is used for absulate path and
	// "//" double slash // is used  for relative path.
	
	System.out.println("------------------------------");
	
	//How to get the attribute value from the particular WebElement?
	System.out.println(driver.findElement(By.xpath("")).getAttribute("name"));
	driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
	
	
	}

	}

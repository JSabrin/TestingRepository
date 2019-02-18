package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	//create a page factory:
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath="//input[@type='submit'and @value='Save']")
	WebElement saveBtn;
	
	//a[@name='Rohini Akter']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
	//not a good practice
	
	//Initializing the Page Object:
	public ContactsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsPageLabel(){
		return contactsLabel.isDisplayed();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	//It is not compolsary everytime you need to create a page factory, without page factory you can create a method.
	//if you want to execute only this method then select this method name->right click on that->run as TestNg then it will execute only this method.
	
	public void createNewContact(String title, String ftName, String ltName, String comp){
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
	
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp );
		saveBtn.click();
	}
	
	//a[@name='Rohini Akter']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
	
	//a[contains(text(),'Amit Mohanty')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	
	
	
	
	
	
	
}

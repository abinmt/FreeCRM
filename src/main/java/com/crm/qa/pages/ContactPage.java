package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactsLabel;
	
public ContactPage()
{
	PageFactory.initElements(driver, this);
}


public void ClickonContactName(String Name)
{
	driver.findElement(By.xpath("//a[text()='"+Name+"']//parent::td[@class='datalistrow']//preceding-sibling::td//input")).click();
	
	
}




public boolean VerifyContactsLabel()
{
	return ContactsLabel.isDisplayed();
	
	
}


}

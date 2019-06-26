package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	//Home Page Objects
	@FindBy(xpath="//*[contains(text(),'User:')]")
	WebElement username;
	
	@FindBy(xpath="//*[contains(text(),'SEARCH')]")
	WebElement search;
	
	@FindBy(xpath="//*[@title='Contacts']")
	WebElement contacts;
	
	
	@FindBy(xpath="//*[@title='Deals']")
	WebElement deals;
	
	
	@FindBy(xpath="//*[@title='Tasks']")
	WebElement tasks;
	
	//Constructor for Initiating the PageFactory Elements
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Page Actions
	public void verifyUsername() {
		String uname=username.getText();
		System.out.println("username"+uname);
		
	}
	
	public String  verifyHomePageTitle() {
		
		String homepagetitle=driver.getTitle();
		return homepagetitle;
	}
	
	public SearchPage  clickSearhButton() {
		search.click();
		return new SearchPage();
			}
	
	public ContactPage  clickContactsLink() {
		contacts.click();
		return new ContactPage();
			}
	
	
			
	
	public DealPage  clickDealsLink() {
		deals.click();
		return new DealPage();
			}
			
	
	public TaskPage  clickTasksLink() {
		tasks.click();
		return new TaskPage();
			}
			
			

}

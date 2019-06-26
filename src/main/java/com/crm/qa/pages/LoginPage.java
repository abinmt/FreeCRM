package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up']")
	WebElement signupbtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmLogo;
	
	//initializing Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//validate LoginPage
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	//Validate Crmlogo
	public boolean validateCRMLogo() {
		return crmLogo.isDisplayed();
	}
	
	//login
	
	public HomePage login(String uname,String pwd) {
	username.sendKeys(uname);
	password.sendKeys(pwd);
	loginbtn.click();
	
	return new HomePage();
	}

}

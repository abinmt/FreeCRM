package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	DealPage dealpage;
	TaskPage taskpage;
	TestUtil testutil;
	
	public ContactPageTest() {
		
    super();
		
	}
	
	@BeforeMethod
	void setup() {
		initialization();
		loginpage = new LoginPage();
		contactpage=new ContactPage();
		testutil=new TestUtil();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
		contactpage=homepage.clickContactsLink();

	}
	
	@Test(priority=1)
	void verifyContactLabelDisplayed() {
		Assert.assertTrue(contactpage.VerifyContactsLabel());
		
		
	}
	
	@Test(priority=2)
	void checkContact() {
		contactpage.ClickonContactName("test test");
		
		
	}
   
	
	@AfterMethod
	void TearDown() {
		driver.quit();
	}
	

}

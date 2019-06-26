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

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	DealPage dealpage;
	TaskPage taskpage;
	TestUtil testutil;
	
	//calling the constructor
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	void setup() {
	
		initialization();
		loginpage = new LoginPage();
		testutil=new TestUtil();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
		
		String hometitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(hometitle, "CRMPRO","Title not as expected");
		
	}
	
	@Test(priority=2)
	public void verifyUserName() {
		testutil.switchToFrame();
		homepage.verifyUsername();
				
	}
	
	//clicking on contact link
	@Test (priority=3)
	public void ClickonContact() {
		testutil.switchToFrame();
		contactpage=homepage.clickContactsLink();
	}
	
	//clicking on Deal link
		@Test (priority=4)
		public void ClickonDeal() {
			testutil.switchToFrame();
			dealpage=homepage.clickDealsLink();
		}
		
		//clicking on contact link
		@Test (priority=5)
		public void ClickonTask() {
			testutil.switchToFrame();
			taskpage=homepage.clickTasksLink();
		}
	
	
	@AfterMethod
	void tearDown() {
		driver.quit();
		
	}

}

package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;
import com.qa.amazon.pages.LandingPage;
import com.qa.amazon.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		init();
		
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		
		landingPage.mouseHoverOnSignInTextLink();
		landingPage.clickOnSignInLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String loginTitle = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(loginTitle, "Amazon Sign Ins");
	}
	
	
	@Test(priority = 2)
	public void verifyLoginPageLogoTest() {
		Assert.assertTrue(loginPage.verifyLoginPageLogo());
	}
	
	@Test(priority = 3)
	public void verifyConditionOfUseLinkTest() {
		Assert.assertTrue(loginPage.verifyConditionOfUseLink());
	}
	
	@Test(priority = 4)
	public void verifyNeedHelpLinkTest() {
		Assert.assertTrue(loginPage.verifyNeedHelpLink());
	}
	
	
	@Test(priority = 5)
	public void verifyPrivacyNoticeLinkTest() {
		Assert.assertTrue(loginPage.verifyPrivacyNoticeLink());
	}
	
	@Test(priority = 6)
	public void verifyCreateAccountSubmitTest() {
		Assert.assertTrue(loginPage.verifyCreateAccountSubmit());
	}
	
	@Test(priority = 7)
	public void verifyEnterEmailAddress() throws InterruptedException {
		loginPage.enterEmailAddress();
		loginPage.clickOnContinueLink();
	}
	
	
	
	

}

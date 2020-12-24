package com.qa.amazon.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;
import com.qa.amazon.pages.LandingPage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.SignInPage;

public class SignInPageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	SignInPage signInPage;
	
	public SignInPageTest() throws FileNotFoundException{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, FileNotFoundException{
		init();
		
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		signInPage = new SignInPage();
		
		landingPage.mouseHoverOnSignInTextLink();
		landingPage.clickOnSignInLink();
		loginPage.enterEmailAddress();
		loginPage.clickOnContinueLink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	@Test(priority = 1)
	public void verifySignInPageTitleTest() {
		String signInTitle = signInPage.verifySignInPageTitle();
		Assert.assertEquals(signInTitle, "Amazon Sign In");
	}
	
	
	@Test(priority = 2)
	public void verifyForgotPasswordLinkTest() {
		Assert.assertTrue(signInPage.verifyForgotPasswordLink());
	}
	
	
	@Test(priority = 3)
	public void verifyKeepMeCheckBoxTest() {
		Assert.assertFalse(signInPage.verifyKeepMeCheckBox());
	}
	
	
	@Test(priority = 4)
	public void verifyDetailsLinkTest() {
		Assert.assertTrue(signInPage.verifyDetailsLink());
	}
	
	
	@Test(priority = 5)
	public void verifyHelpLinkTest() {
		Assert.assertTrue(signInPage.verifyHelpLink());
	}
	
	
	@Test(priority = 6)
	public void verifyPrivacyNoticeLinkTest() {
		Assert.assertTrue(signInPage.verifyPrivacyNoticeLink());
	}
	
	
	@Test(priority = 7)
	public void verifyEnterPassword() throws InterruptedException {
		signInPage.enterPassword();
	}
	

}

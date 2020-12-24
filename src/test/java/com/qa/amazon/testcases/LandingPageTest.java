package com.qa.amazon.testcases;

//What is Log? : Capturing info/activites at the time of program.

//Types of Log:
	//1. Info
	//2. Warn
	//3. Error
	//4. Fatal

//How to generate the logs? : use Apache Log4j API
//How it works? : it reads log4j configuration from log4.properties file
//Where to create the file? : Create inside resources source folder


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;

import com.qa.amazon.pages.LandingPage;

public class LandingPageTest extends TestBase{
	
	LandingPage landingPage;
	
	public LandingPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		init();
		
		landingPage = new LandingPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void verifyLandingPageTitleTest() {
		String titleLandingPage = landingPage.verifyLandingPageTitle();
		Assert.assertEquals(titleLandingPage, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	
	
	@Test(priority = 2)
	public void verifyLandingPageLogoTest() {
		Assert.assertTrue(landingPage.verifyLandingPageLogo());
	}
	
	
	@Test(priority = 3)
	public void verifyLandingPageSearchTextBoxTest( ) {
		Assert.assertTrue(landingPage.verifyLandingPageSearchTextBox());
	}
	
	@Test(priority = 4)
	public void verifyLandingPageFlagLogoTest() {
		Assert.assertTrue(landingPage.verifyLandingPageFlagLogo());
	}
	
	@Test(priority = 5)
	public void verifyLandingPageCondtionOfUseLinkTest() {
		Assert.assertTrue(landingPage.verifyLandingPageCondtionOfUseLink());
	}
	
	
	@Test(priority = 6)
	public void verifyClickOnSignInLinkTest() throws InterruptedException {
		landingPage.mouseHoverOnSignInTextLink();
		Assert.assertTrue(landingPage.verifyClickOnSignInLink());
		landingPage.clickOnSignInLink();
	}
	

}

package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.amazon.base.TestBase;
import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LandingPage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.SignInPage;
import com.qa.amazon.utilities.TestUtil;

public class HomePageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	SignInPage signInPage;
	HomePage homePage;
	
	String sheetName = "item";
	
	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		init();
		
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		signInPage = new SignInPage();
		homePage = new HomePage();
		
		landingPage.mouseHoverOnSignInTextLink();
		landingPage.clickOnSignInLink();
		loginPage.enterEmailAddress();
		loginPage.clickOnContinueLink();
		signInPage.enterPassword();
		signInPage.signInSubmitBtn();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homeTitle, prop.getProperty("homepageTitle"));
	}
	
	
	@Test(priority = 2)
	public void verifyHomePageLogoTest() {
		Assert.assertTrue(homePage.verifyHomePageLogo());
	}
	
	
	@Test(priority = 3)
	public void verifyDiscountImageTest() {
		Assert.assertTrue(homePage.verifyDiscountImage());
	}
	
	
	@Test(priority = 4)
	public void verifyCartImageTest() {
		Assert.assertTrue(homePage.verifyCartImage());
	}
	
	@Test(priority = 5)
	public void verifyDealsStoreLinkTest() {
		Assert.assertTrue(homePage.verifyDealsStoreLink());
	}
	
	
	/*
	@DataProvider
	public Object[][] getAmazonTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	
	@Test(priority = 6, dataProvider = "getAmazonTestData")
	public void searchTest(String search) {
		homePage.search(search);
	} */
	
	
	
}

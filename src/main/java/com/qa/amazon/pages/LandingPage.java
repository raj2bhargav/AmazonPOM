package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class LandingPage extends TestBase {

	Actions action;

	
	// Initializing the Page Objects
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	
	//Amazon Landing Page Title
	public String verifyLandingPageTitle() {
		return driver.getTitle();
	}

	
	//Amazon Landing Page Logo
	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement landingPageLogo;

	
	public boolean verifyLandingPageLogo() {
		return landingPageLogo.isDisplayed();
	}

	
	//Amazon Landing Page Search Text Box
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement landingPageSearchTextBox;

	
	public boolean verifyLandingPageSearchTextBox() {
		return landingPageSearchTextBox.isEnabled();
	}

	
	//Amazon Landing Page Flag Logo
	@FindBy(xpath = "//span[@class='icp-nav-flag icp-nav-flag-ca']")
	WebElement landingPageFlagLogo;

	
	public boolean verifyLandingPageFlagLogo() {
		return landingPageFlagLogo.isDisplayed();
	}

	
	//Amazon Landing Page - Conditions Of Use Link
	@FindBy(xpath = "//a[contains(text(),'Conditions of Use')]")
	WebElement landingPageConditionsOfUse;

	
	public boolean verifyLandingPageCondtionOfUseLink() {
		return landingPageConditionsOfUse.isDisplayed();
	}

	
	//Amazon Landing Page -- Mouse Hover on Sign In Link
	@FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
	WebElement mouseHoverOnSignIn;

	public void mouseHoverOnSignInTextLink() throws InterruptedException {
		action = new Actions(driver);
		action.moveToElement(mouseHoverOnSignIn).build().perform();
		Thread.sleep(2000);
	}


	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement clickSignInLink;
	
	
	public boolean verifyClickOnSignInLink() {
		return clickSignInLink.isDisplayed();
	}
	
	
	public LoginPage clickOnSignInLink() throws InterruptedException {
		clickSignInLink.click();
		Thread.sleep(2000);
		
		return new LoginPage();
	}

}

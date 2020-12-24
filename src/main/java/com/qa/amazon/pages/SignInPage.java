package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class SignInPage extends TestBase{
	
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifySignInPageTitle() {
		return driver.getTitle();
	}
	
	
	//Forgot Password Link
	@FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
	WebElement forgorPasswordLink;
	
	public boolean verifyForgotPasswordLink() {
		return forgorPasswordLink.isDisplayed();
	}
	
	
	//Keep Me Signed In Check Box
	@FindBy(xpath = "//input[@name='rememberMe']")
	WebElement keepMeCheckBox;
	
	public boolean verifyKeepMeCheckBox() {
		return keepMeCheckBox.isSelected();
	}
	
	
	//Details Link
	@FindBy(xpath = "//a[@id='remember_me_learn_more_link']")
	WebElement detailsLink;
	
	public boolean verifyDetailsLink() {
		return detailsLink.isEnabled();
	}
	
	
	//Help Link
	@FindBy(xpath = "//a[contains(text(),'Help')]")
	WebElement helpLink;
	
	public boolean verifyHelpLink() {
		return helpLink.isDisplayed();
	}
	
	
	//Privacy Notice Link
	@FindBy(xpath = "//a[contains(text(),'Privacy Notice')]")
	WebElement privacyNoticeLink;
	
	public boolean verifyPrivacyNoticeLink() {
		return privacyNoticeLink.isDisplayed();
	}
	
	
	//Enter Password
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement enterPassword;
	
	//Sign In Button
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signInSubmitBtn;
	
	public HomePage enterPassword() throws InterruptedException {
		enterPassword.sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		//signInSubmitBtn.click();
		
		//Thread.sleep(2000);
		return new HomePage();
	}
	
	public void signInSubmitBtn() throws InterruptedException {
		signInSubmitBtn.click();
		Thread.sleep(2000);
	}

}

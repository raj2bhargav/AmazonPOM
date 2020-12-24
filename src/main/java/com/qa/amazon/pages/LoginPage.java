package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
	WebElement loginPageLogo;

	public boolean verifyLoginPageLogo() {
		return loginPageLogo.isDisplayed();
	}

	@FindBy(xpath = "//div[@id='legalTextRow']//a[contains(text(),'Conditions of Use')]")
	WebElement conditionOfUseLink;

	public boolean verifyConditionOfUseLink() {
		return conditionOfUseLink.isDisplayed();
	}

	@FindBy(xpath = "//span[@class='a-expander-prompt']")
	WebElement needHelpLink;

	public boolean verifyNeedHelpLink() {
		return needHelpLink.isDisplayed();
	}

	@FindBy(xpath = "//div[@id='legalTextRow']//a[contains(text(),'Privacy Notice')]")
	WebElement privacyNoticeLink;

	public boolean verifyPrivacyNoticeLink() {
		return privacyNoticeLink.isDisplayed();
	}

	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	WebElement createAccountSubmitBtn;

	public boolean verifyCreateAccountSubmit() {
		return createAccountSubmitBtn.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueLink;

	public void enterEmailAddress() throws InterruptedException {
		emailAddress.sendKeys(prop.getProperty("email_address"));
		Thread.sleep(2000);
	}

	public SignInPage clickOnContinueLink() throws InterruptedException {
		continueLink.click();
		Thread.sleep(2000);

		return new SignInPage();
	}

}

package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.TestBase;

public class HomePage extends TestBase{
	
	//Initializing Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement homePageLogo;
	
	public boolean verifyHomePageLogo() {
		return homePageLogo.isDisplayed();
	}
	
	
	@FindBy(xpath = "//a[@class='nav-imageHref']//img")
	@CacheLookup
	WebElement discountImage;
	
	public boolean verifyDiscountImage() {
		return discountImage.isDisplayed();
	}
	
	
	@FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
	WebElement cartImage;
	
	public boolean verifyCartImage() {
		return cartImage.isDisplayed();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Deals Store')]")
	WebElement dealsStoreLink;
	
	public boolean verifyDealsStoreLink() {
		return dealsStoreLink.isEnabled();
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Go']")
	WebElement clickGo;
	
	
	public void search(String item) {
		searchBox.sendKeys(item);
		clickGo.click();
	}
	

}

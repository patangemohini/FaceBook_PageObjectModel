package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[contains(text(),'Welcome to Facebook, Mohini')]")
	WebElement title;
	
	@FindBy(xpath = "//span[contains(text(),'Mohini Patange')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//span[contains(text(),'Events')]")
	WebElement Events;
	
	@FindBy(xpath = "//span[contains(text(),'Watch')]")
	WebElement Watch;

	@FindBy(xpath = "(//div[@aria-label='Messenger'])[1] ")
	WebElement messenger;

	@FindBy(xpath = "//a[@aria-label='Notifications, 1 unread']")
	WebElement Notifications;
	
	@FindBy(xpath = "//span[contains(text(),'Find Friends')]")
	WebElement findfirends;


	@FindBy(xpath = "//input[@placeholder='Search by name']")
	WebElement serach;
	
	@FindBy(xpath = "//span[contains(text(),'Add Picture')]")
	WebElement AddPictureBtn ;
	
	@FindBy(xpath = "//span[contains(text(),'Marketplace')]']")
	WebElement Marketplace;
	
	@FindBy(xpath = "//span[contains(text(),'Mohini Patange')]")
	WebElement profileLink;
	
	@FindBy(xpath = "//span[contains(text(),'Mohini Patange')]")
	WebElement newprofileLink;
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateFPMTitle() {
		return title.isDisplayed();
	}
	
	public boolean validateFPMNameLable() {
		return userNameLabel.isDisplayed();
	}
	
	public boolean validateFPMEvents() {
		return Events.isDisplayed();
	}
	
	
	public boolean validateFPMWatch() {
		return Watch.isDisplayed();
	}

	
	public boolean validateFPMMessenger() {
		return messenger.isDisplayed();
	}

	public boolean validateFPMNotifications() {
		return Notifications.isDisplayed();
	}

	
	public boolean validateFPMfindfirends() {
		return findfirends.isDisplayed();
	}

	
	public boolean validateFPMserach() {
		return serach.isDisplayed();
	}

	public boolean validateFPMFAddPictureBtn() {
		return AddPictureBtn.isDisplayed();
	}

	public boolean validateFPMarketplace() {
		return Marketplace.isDisplayed();
	}

	
	public void clickOnNewProfiletLink(){
		Actions action = new Actions(driver);
		action.moveToElement(profileLink).build().perform();
		newprofileLink.click();
		
	}
}
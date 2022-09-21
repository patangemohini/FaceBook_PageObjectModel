package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Create New Account')]")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[@alt='Facebook']")
	WebElement fpmLogo;

	@FindBy(xpath = "//a[normalize-space()='Forgotten password?']")
	WebElement fpmforgotpassword;

	@FindBy(xpath = "//img[@alt='Facebook']")
	WebElement fpmlable;

	@FindBy(xpath = "//a[@class='_8esh']")
	WebElement fpmsecondlable;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateFPMImage() {
		return fpmLogo.isDisplayed();
	}

	public void EnterEmail(String un) {
		username.sendKeys(un);
	}

	public void EnterPassword(String pass) {
		password.sendKeys(pass);
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();

		return new HomePage();
	}

	public boolean validateFPMLoginBtn() {
		return loginBtn.isDisplayed();
	}

	public boolean validateFPMsignUpBtn() {
		return signUpBtn.isDisplayed();
	}

	public boolean validateFPMLable() {
		return fpmlable.isDisplayed();
	}

	public boolean validateFPMSecondSLable() {
		return fpmsecondlable.isDisplayed();
	}

	public boolean validateFPMforgotpassword() {
		return fpmforgotpassword.isDisplayed();
	}
}
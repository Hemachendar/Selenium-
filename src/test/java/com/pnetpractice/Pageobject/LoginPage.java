package com.pnetpractice.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(partialLinkText = "LOGI")
	WebElement login;

	@FindBy(name = "email")
	WebElement emailid;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement submit;

	public void Clicklogin() 
	{

		login.click();
	}

	public void setusername(String uname) {
		emailid.sendKeys(uname);
	}

	public void Setpassword(String passwrd) {
		pass.sendKeys(passwrd);

	}

	public void clickonsubmit() {
		submit.click();
	}

}

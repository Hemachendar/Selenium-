package com.pnetpractice.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	
	
	@FindBy(xpath = "//a[@class='masternav-item masternav-item_user hidden-xs hidden-sm hidden-md at-usermenu-mobile']")
	WebElement Clickdropdown;
	
	@FindBy(xpath = "//a[@class='masternav-item_my-cvs at-myprofile ']")
	WebElement mmanage;
	
	@FindBy(xpath = "//span[text()='Edit Profile']")
	WebElement Editprofile;
	
	@FindBy(xpath = "//button[@class='btn btn-edit ']")
	WebElement edit;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;
	
	
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

	public void clickonsubmit()
	{
		submit.click();
	}
	
	

}

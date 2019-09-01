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
	
	@FindBy(xpath = "/html/body/div[3]/header/nav/div/div/div[2]/nav/ul/li[2]/a")
	WebElement droupclick;
	
	@FindBy(xpath = "/html/body/div[2]/header/nav/div/div/div[2]/nav/ul/li[2]/ul/li[7]/a")
	WebElement Logout;

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
	public void droupdownclick() 
	{
		droupclick.click();
	}
	public void logout()
	{
	
		Actions Act=new Actions(driver);
		 Act.moveToElement(Logout).build().perform();
		//Select sel=new Select(droupclick);
		//sel.selectByVisibleText("Logout");
		
	}
	

}

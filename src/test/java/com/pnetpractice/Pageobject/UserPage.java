package com.pnetpractice.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage 
{
	WebDriver driver;
	
	public UserPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='masternav-item masternav-item_user hidden-xs hidden-sm hidden-md at-usermenu-mobile']")
	WebElement Clickdropdown;
	
	@FindBy(xpath = "//a[@class='masternav-item_my-cvs at-myprofile ']")
	WebElement manage;
	
	@FindBy(xpath = "//span[text()='Edit Profile']")
	WebElement Editprofile;
	
	@FindBy(xpath = "//button[@class='btn btn-edit ']")
	WebElement edit;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;
	
	public void clickDropdown() 
	{
		Clickdropdown.click();
		
	}
	public void manageProfile() 
	{
		Actions Act=new Actions(driver);
		WebElement managecv = manage;
		Act.moveToElement(managecv).perform();
		manage.click();
	}
	
	public void editprofile() 
	{
		Editprofile.click();
	}
	public void useredit() 
	{
		edit.click();	
	}
	public void save() 
	{
		save.click();
	}
	

}

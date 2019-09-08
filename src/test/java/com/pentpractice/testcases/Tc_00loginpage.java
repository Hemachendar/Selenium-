package com.pentpractice.testcases;

import java.awt.Window;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
import com.pnetpractice.Pageobject.UserPage;
import com.pnetpractice.Utilitys.Screenshorts;


public class Tc_00loginpage extends BaseClass {

	@Test
	public void logintest() throws InterruptedException, IOException {

		
		driver.get(Baseurl);
		logger.info("navigate the Url");
		
		LoginPage log = new LoginPage(driver);
		log.Clicklogin();
		logger.info("click the link");
		
		

		Thread.sleep(4000);

		log.setusername(usrname);
		logger.info("Enter the user name");
		

		log.Setpassword(password);
		logger.info("enter the password");

		log.clickonsubmit();
		logger.info("click on login button");
		
		UserPage userpage=new UserPage(driver);
		
		userpage.clickDropdown();
		userpage.manageProfile();
		userpage.editprofile();
		userpage.useredit();
		Thread.sleep(4000);
		JavascriptExecutor jsr=(JavascriptExecutor)driver;
		jsr.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(2000);
		
		userpage.save();
		
		Thread.sleep(2000);
		JavascriptExecutor jsr2=(JavascriptExecutor)driver;
		jsr2.executeScript("window.scrollBy(0,-250)");
		
		userpage.clickDropdown();
		
		userpage.manageProfile();
		
		driver.findElement(By.xpath("//div[@class='head-logo']")).click();
		
		
	/*	WebElement click = driver.findElement(By.xpath("//a[@class='masternav-item masternav-item_user hidden-xs hidden-sm hidden-md at-usermenu-mobile']"));
		click.click();
		Actions Act=new Actions(driver);
		WebElement manage = driver.findElement(By.xpath("//a[@class='masternav-item_my-cvs at-myprofile ']"));
		Act.moveToElement(manage).perform();
		driver.findElement(By.xpath("//a[@class='masternav-item_my-cvs at-myprofile ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit Profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-edit ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		//driver.navigate().refresh();
		
		
		
		/*WebElement element = driver.findElement(By.xpath("//a[@class='masternav-item_logout at-logout ']"));
		Act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[@class='masternav-item_logout at-logout ']")).click();
		
		
		
	//Select select=new Select(driver.findElement(By.xpath("//a[@class='masternav-item masternav-item_user hidden-xs hidden-sm hidden-md at-usermenu-mobile']")));
		//select.selectByVisibleText("Your Account");
		
		
		//List<WebElement> lest = driver.findElements(By.xpath("/html/body/div[2]/header/nav/div/div/div[2]/nav/ul/li[3]/a"));
		
		
		
		
		//Screenshorts.getscreenshort();
		

		// jobs in South Africa|job search||pnet.co.za
		
		/*
		 * List<WebElement> named = driver.findElements(By.xpath(
		 * "/html/body/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div"
		 * )); for (WebElement itr:named) {
		 * System.out.println(itr.getAttribute("innerHTML")); if
		 * (itr.getText().contains("Jobs in South Africa | Job search | Pnet.co.za")) {
		 * itr.click(); }
		 * 
		 * }
		 */
		

		/*
		 * if
		 * (driver.getTitle().equals("Jobs in South Africa | Job search | Pnet.co.za"))
		 * { Assert.assertTrue(true); logger.info("log in succsess");
		 * Thread.sleep(2000); Screenshorts.getscreenshort();
		 * 
		 * } else { Assert.assertTrue(false); logger.info("login fail"); }
		 */

	}

}

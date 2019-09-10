package com.pentpractice.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
import com.pnetpractice.Pageobject.UserPage;
import com.pnetpractice.Utilitys.Screenshorts;

public class Tc_003loginpage extends BaseClass
{

	@Test
	public void logintest3() throws IOException, InterruptedException 
	{
		driver.get(Baseurl);
		logger.info("navigate the Url");
		LoginPage log=new LoginPage(driver);
		log.Clicklogin();
		logger.info("click the link");
		
		log.setusername(woringusrname);
		logger.info("Enter the user name");
		
		log.Setpassword(woringpassword);
		logger.info("enter the wrong password");
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
		String title = driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.xpath("//div[@class='head-logo']")).click();
		
		
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
		
		
		if (driver.getTitle().equals("Jobs, vacancy, recruiters, career, application, online recruitment | Pnet.co.za")) 
		{
			Assert.assertTrue(true);
			Thread.sleep(2000);
			logger.info("log in succsess");
			Screenshorts.getscreenshort();
		}else 
		{
			logger.info("login fail");
			Assert.assertTrue(true);
		
			
		}
		
		
		
	}
	

}

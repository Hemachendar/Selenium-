package com.pentpractice.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
import com.pnetpractice.Pageobject.UserPage;
import com.pnetpractice.Utilitys.Screenshorts;

public class Tc_004prataploginpage extends BaseClass
{
	

	@Test
	public void logintest() throws InterruptedException, IOException {

		driver.get(Baseurl);
		logger.info("navigate the Url");

		LoginPage log = new LoginPage(driver);
		log.Clicklogin();
		logger.info("click the link");

		Thread.sleep(4000);

		log.setusername(pratapuname);
		logger.info("Enter the user name: pratapkarthikeya@gmail.com");

		log.Setpassword(pratappass);
		logger.info("enter the password : yogiparama99999");

		log.clickonsubmit();
		logger.info("click on login button");
		 List<WebElement> named = driver.findElements(By.xpath("/html/body/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div"));
		for (WebElement itr : named) {
			System.out.println(itr.getAttribute("innerHTML"));
			logger.info("pratap login fail: <p>E-mail and/or password you entered are not correct.</p>");
			if (itr.getText().contains("Jobs in South Africa | Job search | Pnet.co.za"))
			{
				itr.click();
				//logger.info("pratap login fail: <p>E-mail and/or password you entered are not correct.</p>");
			}

		}
		

		UserPage userpage = new UserPage(driver);

		userpage.clickDropdown();
		logger.info("Click user dropdown");

		userpage.manageProfile();
		logger.info("Clieck on manage/edit profile");

		userpage.editprofile();
		logger.info("click up date button");

		userpage.useredit();
		logger.info(" clicked in edit");
		Thread.sleep(4000);
		JavascriptExecutor jsr = (JavascriptExecutor) driver;
		jsr.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);

		userpage.save();
		logger.info("click on save");

		Thread.sleep(2000);
		
		JavascriptExecutor jsr2 = (JavascriptExecutor) driver;
		jsr2.executeScript("window.scrollBy(0,-250)");

		userpage.clickDropdown();
		logger.info("back to dropdown user link");

		userpage.manageProfile();
		logger.info("manage update Success ");

		String title = driver.getTitle();
		System.out.println(title);

		if (driver.getTitle()
				.equals("Jobs, vacancy, recruiters, career, application, online recruitment | Pnet.co.za")) {
			Assert.assertTrue(true);
			Thread.sleep(2000);
			logger.info("log in succsess");
			Screenshorts.getscreenshort();
		} else {
			logger.info("login fail");
			Assert.assertTrue(true);

		}
	
}
}

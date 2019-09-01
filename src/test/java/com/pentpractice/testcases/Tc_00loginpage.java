package com.pentpractice.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
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
		

		if (driver.getTitle().equals("Jobs in South Africa | Job search | Pnet.co.za")) {
			Assert.assertTrue(true);
			logger.info("log in succsess");
			Thread.sleep(2000);
			Screenshorts.getscreenshort();
			
		} else {
			Assert.assertTrue(false);
			logger.info("login fail");
		}

	}

}

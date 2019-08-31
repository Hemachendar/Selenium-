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
		
		
		LoginPage log = new LoginPage(driver);
		log.Clicklogin();
		
		

		Thread.sleep(4000);

		log.setusername(usrname);
		

		log.Setpassword(password);
		

		log.clickonsubmit();
		Screenshorts.getscreenshort();
		

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
		} else {
			Assert.assertTrue(false);
		}

	}

}

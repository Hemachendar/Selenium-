package com.pentpractice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
import com.pnetpractice.Utilitys.Screenshorts;
import com.relevantcodes.extentreports.LogStatus;

public class Tc_00loginpage extends BaseClass {

	@Test
	public void logintest() throws InterruptedException, IOException {

		e.startTest("Tc_00loginpage");
		driver.get(Baseurl);
		//test.log(LogStatus.INFO, "navigate the application URl");
		
		LoginPage log = new LoginPage(driver);
		log.Clicklogin();
		//test.log(LogStatus.INFO, "Click the login button");
		

		Thread.sleep(4000);

		log.setusername(usrname);
		//test.log(LogStatus.INFO,"entering the username");

		log.Setpassword(password);
		//test.log(LogStatus.INFO,"entering the password");

		log.clickonsubmit();
		Screenshorts.getscreenshort();
		//test.log(LogStatus.INFO,"submit");

		// jobs in South Africa|job search||pnet.co.za

		if (driver.getTitle().equals("Jobs in South Africa | Job search | Pnet.co.za")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}

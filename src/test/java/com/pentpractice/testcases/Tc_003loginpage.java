package com.pentpractice.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;

public class Tc_003loginpage extends BaseClass
{

	@Test
	public void logintest3() 
	{
		driver.get(Baseurl);
		LoginPage log=new LoginPage(driver);
		log.Clicklogin();
		log.setusername(usrname);
		log.Setpassword(woringpassword);
		log.clickonsubmit();
		if (driver.getTitle().equals("Jobs in South Africa | Job search | Pnet.co.za")) 
		{
			Assert.assertTrue(true);
		}else 
		{
			Assert.assertTrue(false);
		}
		
		
		
	}
	

}

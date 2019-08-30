package com.pentpractice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
import com.pnetpractice.Utilitys.Screenshorts;

public class Tc_002loginpage extends BaseClass
{
	@Test
	public void logintest2() throws IOException 
	{
		driver.get(Baseurl);
		LoginPage page=new LoginPage(driver);
		page.Clicklogin();
		page.setusername(woringusrname);
		page.Setpassword(woringpassword);
		page.clickonsubmit();
		Screenshorts.getscreenshort();
		
		if(driver.getTitle().equals("Jobs in South Africa | Job search | Pnet.co.za")) 
		{
			Assert.assertTrue(true);
		}else 
		{
			Assert.assertTrue(false);
		}
		
	}

}

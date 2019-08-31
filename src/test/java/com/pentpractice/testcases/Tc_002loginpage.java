package com.pentpractice.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		 List<WebElement> named = driver.findElements(By.xpath("/html/body/div[6]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div"));
			for (WebElement itr:named)
			{
				System.out.println(itr.getAttribute("innerHTML"));
				if (itr.getText().contains("Jobs in South Africa | Job search | Pnet.co.za"))
				{
					itr.click();
				}
				
			}
		
		/*
		 * if(driver.getTitle().equals("Jobs in South Africa | Job search | Pnet.co.za"
		 * )) { Assert.assertTrue(true); }else { Assert.assertTrue(false); }
		 */
	}

}

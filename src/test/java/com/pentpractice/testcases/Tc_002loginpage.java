package com.pentpractice.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pnetpractice.Pageobject.LoginPage;
import com.pnetpractice.Utilitys.Screenshorts;
import com.pnetpractice.Utilitys.XLUtils;


// Data Driven testing class

public class Tc_002loginpage extends BaseClass
{
	@Test(dataProvider = "Testdata")
	public void logintest2(String username,String passwrd) throws InterruptedException  
	{
		//driver.get(Baseurl);
		LoginPage page=new LoginPage(driver);
		page.Clicklogin();
		page.setusername(username);
		page.Setpassword(passwrd);
		page.clickonsubmit();
		
		Thread.sleep(3000);
		
		if (isLoginpage()==true) 
		{
			
			Assert.assertTrue(true);
			//page.droupdownclick();
			//page.logout();
			page.Clicklogin();
		}else 
		{
			Assert.assertTrue(false);
			Thread.sleep(3000);
			//page.droupdownclick();
			//page.logout();
			page.Clicklogin();
		}
		
	}
	
	public boolean isLoginpage() 
	{
		try 
		{
			driver.navigate().refresh();
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
		
	}
	
	@DataProvider(name="Testdata")
	String [][]getData() throws Exception
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/pnetpractice/testdata/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colcount = XLUtils.getCellCount(path, "sheet1", 1);
		
		String logindata[][] = new String[rownum][colcount];
		for (int i = 1; i <=rownum; i++) 
		{
			for (int j = 0; j <colcount; j++) 
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"sheet1",i,j);
				
			}
			
		}
		return logindata;
	}
}

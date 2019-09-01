/*package com.Datadriventest.practice;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurulogin.PageObject.LoginPage;
import com.gurulogin.Utility.XLUtils;

public class TC00_DDTloginpage extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void logInpage(String user, String pass) throws InterruptedException {
		LoginPage page = new LoginPage(driver);

		page.setname(user);
		logger.info("Enter the UseId ");

		page.setpass(pass);
		logger.info("enter the pass word");

		page.setsubmit();
		logger.info("click on subbmit");
		Thread.sleep(2000);

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login faild");

		} else {
			 Assert.assertTrue(true); 
			logger.info("test pass");
			page.setlogout();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}

	}

	public boolean isAlertPresent() // user defined method created to check alert is presetn or not
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/gurulogin/datatable/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0
			}

		}
		return logindata;
	}

}*/

package com.pentpractice.testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.pnetpractice.Utilitys.Readconfig;


public class BaseClass {
	
	Readconfig Readcofig=new Readconfig();
	public String Baseurl = Readcofig.getapplication();
	public String usrname = Readcofig.getusername();
	public String password = Readcofig.getpassword();
	public String woringusrname=Readcofig.getworingusrname();
	public String woringpassword=Readcofig.getworingpasswrd();
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir")+"//driver//chromedriver.exe"); driver=new
		 * ChromeDriver();
		 */

		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@AfterClass
	public void teardoem() {
		driver.quit();
	}

}

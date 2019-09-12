package com.pentpractice.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.pnetpractice.Utilitys.Readconfig;


public class BaseClass {
	
	Readconfig Readcofig=new Readconfig();
	public String Baseurl = Readcofig.getapplication();
	public String Husrname = Readcofig.getusername();
	public String Hpassword = Readcofig.getpassword();
	public String chanduusrname=Readcofig.getchanduusrname();
	public String chandupassword=Readcofig.getchandupasswrd();
	public String pratapuname=Readcofig.getpratapuname();
	public String pratappass=Readcofig.getpratappass();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void setup() {
		
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir")+"//driver//chromedriver.exe"); driver=new
		 * ChromeDriver();
		 */

		driver = new FirefoxDriver();
		
		logger=Logger.getLogger("pnetpractice");
		PropertyConfigurator.configure("log4j.properties");
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.get(Baseurl);
	}

	@AfterClass
	public void teardoem() 
	{
		driver.quit();
	}
	

}

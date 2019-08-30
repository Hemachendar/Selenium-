package com.pnetpractice.Utilitys;

import java.io.File;
import java.util.Date;

import com.pentpractice.testcases.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;

public class Extentmanager extends BaseClass
{
	public static ExtentReports extent;

	public static ExtentReports getinstance() 
	{
		if(extent==null) 
		{
			Date d=new Date();
			String filepath = d.toString().replace(':', '_').replace(' ', '_')+".html";
			extent=new ExtentReports(System.getProperty("user.dir")+"//HTMLReports//"+filepath);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//extentreport.xml"));
			extent.addSystemInfo("selenium Language","3.141.59").addSystemInfo("Environment", "production");
		
		}
		return extent;
	}
}


package com.pnetpractice.Utilitys;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.pentpractice.testcases.BaseClass;

public class Screenshorts extends BaseClass
{
	public static SimpleDateFormat getscreenshort() throws IOException 
	{
		Date dt=new Date();
		System.out.println(dt);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		FileHandler.copy(src, new File(System.getProperty("user.dir")+"//screenshorts//"+dateformat.format(dt)+".png"));
		return dateformat;
	}

}

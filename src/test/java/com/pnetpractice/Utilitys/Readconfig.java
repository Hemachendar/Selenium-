package com.pnetpractice.Utilitys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig 
{
	public static final String path="./Config.properties";
	public Properties pro;
	
	public Readconfig()  
	{
		
		File f=new File(path);
		try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	public String getapplication() 
	{
	 String url = pro.getProperty("baseurl");
	return url;
	}
	public String getusername() 
	{
		String uname = pro.getProperty("usrname");
		return uname;
	}
	public String getpassword() 
	{
		String passwd = pro.getProperty("password");
		return passwd;
	}
	public String getworingusrname() 
	{
		String uname = pro.getProperty("wornguname");
		return uname;
	}
	public String getworingpasswrd() 
	{
		String wpass = pro.getProperty("worngpass");
		return wpass;
		
	}

}

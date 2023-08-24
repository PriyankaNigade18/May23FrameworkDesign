package com.SwagLabs.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile 
{
	public Properties p1;
	
	public PropertiesFile()
	{
		 p1=new Properties();
		 File f1=new File("./"+"\\TestData\\config.properties");
		  FileInputStream fs;
		  try {
			fs=new FileInputStream(f1);
			 p1.load(fs);
		} catch (FileNotFoundException e) {
			System.out.println("Check the file path!");
		} catch (IOException e) {
			System.out.println("File is not loaded!");
		}
		 
				  
	}
	
	public String getValue(String key)
	{
		 return p1.getProperty(key);
	}
}

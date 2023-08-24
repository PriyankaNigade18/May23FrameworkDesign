package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation=private data + public method
	
	//By locator
	
	private WebDriver driver;//current class instance
	
	//Driver Initialization in Page class
	public LoginPage(WebDriver driver)//local driver from Base class
	{
	this.driver=driver;	
	}
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By button=By.id("login-button");
	
	//Actions
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(button).click();
		String curl=driver.getCurrentUrl();
		if(curl.contains("inventory"))
		{
			System.out.println("Login done Successfully!");
		}else
		{
			System.out.println("Login fail");
		}
		
	}
	
	public String getAppTitle()
	{
		String title=driver.getTitle();
		System.out.println("Application title is: "+title);
		return title;
	}
	
	
	
	
	
	
	

}

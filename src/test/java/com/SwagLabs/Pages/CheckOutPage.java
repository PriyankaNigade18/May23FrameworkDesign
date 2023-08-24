package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage
{
	private WebDriver driver;
	
	//initialize driver
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//locators
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By contbtn=By.id("continue");
	private By cancelbtn=By.id("cancel");
	
	
	//Actions
	
	public void doContinue(String fname,String lname,String zcode)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		System.out.println("User data is Entered!");
		driver.findElement(contbtn).click();
	}
	
	
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
	
	
	
	
	
	
	
	
}

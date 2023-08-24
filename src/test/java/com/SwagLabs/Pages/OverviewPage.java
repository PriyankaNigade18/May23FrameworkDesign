package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage
{
	private WebDriver driver;
	
	//initialization
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
				
	}
	
	//Locators
	private By details=By.xpath("//div[@id='checkout_summary_container']");
	private By finishbtn=By.id("finish");
	private By cancelbtn=By.id("cancel");
	private By status=By.xpath("//span[@class='title']");
	private By msg=By.xpath("//h2");
	
	
	//Actions
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void getSummary()
	{
		System.out.println("*******Product Summary*********");
		String text=driver.findElement(details).getText();
		System.out.println(text);
	}
	
	
	public void doFinish()
	{
		driver.findElement(finishbtn).click();
		String chstatus=driver.findElement(status).getText();
		System.out.println("Order status is: "+chstatus);
		String chmsg=driver.findElement(msg).getText();
		System.out.println("Final Message: "+chmsg);
		
	}
	
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
	

}

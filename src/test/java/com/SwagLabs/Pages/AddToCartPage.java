package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage
{

	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//By
	private By cartele=By.xpath("//a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By conbtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkbtn=By.xpath("//button[text()='Checkout']");
	
	
	
	//Actions
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void openCartPage()
	{
		driver.findElement(cartele).click();
		
	}
	
	
	public void doRemove()
	{
		driver.findElement(removebtn).click();
		System.out.println("Product is removed!");
	}
	
	
	
	public void doContinue()
	{
		driver.findElement(conbtn).click();
	}
	
	
	public void doCheckout()
	{
		driver.findElement(checkbtn).click();
		System.out.println("Checkout process Started!");
	}
}

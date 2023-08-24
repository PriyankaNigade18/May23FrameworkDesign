package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{

	private WebDriver driver;
	
	//initialization of driver
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By totalProduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By pname=By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name']");
	private By addToCartbtn=By.xpath("//button[text()='Add to cart']");
	
	
	
	//Action
	public int getTotalProductCount()
	{
		return driver.findElements(totalProduct).size();
	}
	
	public void getProductNames()
	{
		System.out.println("***********Total Products Available on Page**********");
		List<WebElement> list=driver.findElements(pname);
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addProductToCart(String product)
	{
		List<WebElement> list=driver.findElements(pname);
		
		for(WebElement i:list)
		{
			if(i.getText().contains(product))
			{
				i.click();
				break;
							
			}


		}
		driver.findElement(addToCartbtn).click();
		System.out.println("Selected Product get added into cart!");
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
}

package com.SwagLabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyTitle()
  {
	  String actTitle=ip.getAppTitle();
	  Assert.assertTrue(actTitle.equals("Swag Labs"),"Title is not matched!");
	  System.out.println("Title is matched!....Test is pass");
	  System.out.println(actTitle);
	  
//	  if(actTitle.equals("Swag Labs"))
//	  {
//		  System.out.println("Title is matched!....Test is pass");
//		  System.out.println(actTitle);
//	  }
	  
  
  }
  
  @Test(priority=2)
  public void verifyTotalProducts()
  {
	int count=ip.getTotalProductCount();  
	if(count==6)
	{
		System.out.println("Count Match!");
		System.out.println("Total Product are: "+count);
	}
	
  }
  
  @Test(priority=3)
  public void VerifyProductName()
  {
	  ip.getProductNames();
  }
  
  @Test(priority=4)
  public void verifyAddToCart()
  {
	ip.addProductToCart("Sauce Labs Fleece Jacket"); 
	
  }
  
}

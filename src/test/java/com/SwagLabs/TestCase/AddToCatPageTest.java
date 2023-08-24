package com.SwagLabs.TestCase;

import org.testng.annotations.Test;

public class AddToCatPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyTitle()
  {
	  System.out.println("Add To Cart Page Title: "+ap.getAppTitle());
  }
  
  
  @Test(priority=2)
  public void verifyCheckOut()
  {
	  ap.doCheckout();
  }
  
  
}

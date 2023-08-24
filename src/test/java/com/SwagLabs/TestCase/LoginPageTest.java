package com.SwagLabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseClass
{
  @Test(priority=2)
  public void loginTest() 
  {
	
	  lp.doLogin("standard_user","secret_sauce");
  }
  
  @Test(priority=1)
  public void verifyTitle()
  {
	  String actTitle=lp.getAppTitle();
	  
	  Assert.assertTrue(actTitle.contains("Labs"),"Title Verified....! Test Case is Fail");
	  System.out.println("Title Verified....! Test Case is Pass");
	  
//	  if(actTitle.contains("Labs"))
//	  {
//		  System.out.println("Title Verified....! Test Case is Pass");
//	  }else
//	  {
//		  System.out.println("Title Verified....! Test Case is Fail");
//
//	  }
	  
  }
}

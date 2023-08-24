package com.SwagLabs.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyTitle()
  {
	  String title=op.getAppTitle();
	  System.out.println("Title of Overview page: "+title);
  }
  
  
  @Test(priority=2)
  public void verifySummary()
  {
	  op.getSummary();
  }
  
  @Test(priority=3)
  public void verifyFinish()
  {
	  op.doFinish();
  }
  
  @Test(enabled=false)
  public void verifyCancel()
  {
	  op.doCancel();
  }
  
 
}

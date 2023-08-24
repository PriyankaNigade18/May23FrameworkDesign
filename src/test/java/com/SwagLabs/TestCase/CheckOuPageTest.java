package com.SwagLabs.TestCase;

import org.testng.annotations.Test;

public class CheckOuPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyCheckoutProcess() 
  {
	  cp.doContinue("Priyanka","Nigade","411047");
  }
  
  @Test(priority=2,enabled=false)
  public void verifyCancelProcess()
  {
	  cp.doCancel();
  }
}

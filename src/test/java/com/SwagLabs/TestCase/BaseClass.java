package com.SwagLabs.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesFile;
import com.SwagLabs.Utility.Utility;

public class BaseClass 
{	
	public WebDriver driver;//declaration
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OverviewPage op;
	public PropertiesFile p1;
	
	@BeforeTest
	public void setBrowser()
	{
		driver=new ChromeDriver();//initialization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		p1=new PropertiesFile();
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckOutPage(driver);
		op=new OverviewPage(driver);
				
	}
	
	@BeforeClass
	public void setUpPage()
	{
		System.out.println("Login Page title is: "+lp.getAppTitle());
		lp.doLogin(p1.getValue("un"),p1.getValue("psw"));
		waitProcess();
		Utility.getScreenshot(driver);
		System.out.println("************InventoryPageTest************");
		System.out.println("Inventory Page Title is: "+ip.getAppTitle());
		System.out.println("Total Product Count is: "+ip.getTotalProductCount());
		ip.getProductNames();
		ip.addProductToCart(p1.getValue("pname"));
		Utility.getScreenshot(driver);
		waitProcess();
		System.out.println("************AddtoCartPageTest************");
		ap.openCartPage();
		System.out.println("Add To Cart Page title is: "+ap.getAppTitle());
		waitProcess();
		Utility.getScreenshot(driver);
		ap.doCheckout();
		System.out.println("***************CheckOut Page is Open***************");
		waitProcess();
		Utility.getScreenshot(driver);
		cp.doContinue(p1.getValue("fname"),p1.getValue("lname"),p1.getValue("zcode"));
		waitProcess();
		Utility.getScreenshot(driver);
		System.out.println("*****************Overview Page Test**************");
	}
	
	
	
	
	public void waitProcess()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}
	

}

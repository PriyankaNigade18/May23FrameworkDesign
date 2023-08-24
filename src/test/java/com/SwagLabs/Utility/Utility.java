package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is dropdown supported multiple selection?: "+dd.isMultiple());
		
		//all options
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			
			if(i.getText().equals(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
	//Explicit Wait
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}

	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.elementToBeClickable(loc));
		
	}
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.titleContains(title));
	}
	
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.urlContains(url));
	}
	
	public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	
	public static void getScreenshot(WebDriver driver)
	{
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File("./"+"\\Screenshot\\SwagLabs_"+System.currentTimeMillis() +".png");
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

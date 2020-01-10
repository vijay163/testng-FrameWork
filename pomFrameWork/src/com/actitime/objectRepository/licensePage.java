package com.actitime.objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.genric.FWUtils;

public class licensePage extends FWUtils {
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productEdition;
	@FindBy(xpath="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;
	public  licensePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	  public void productE()
      {
    	  System.out.println("***edition***"+productEdition.getText());
      }
      public void date()
      {
    	  System.out.println("**issue date**"+issueDate.getText());
      }
      public void verifylicensePage(WebDriver driver)
      {  
    	 String actitile = "actiTIME - Licenses";
 		 WebDriverWait wait = new WebDriverWait(driver, 10);
 		 wait.until(ExpectedConditions.titleContains("actiTIME - Licenses"));
       String t = driver.getTitle(); 
             if(t.equals(actitile))
       {
    	   System.out.println("****title is matched==="+actitile);
       }
       else
       {
    	   System.out.println("not match==="+t);
       }
      }
      public void verifyIssuseDate()
      {
    	  String edate="Jul 14, 2017";
    	  String acDate=issueDate.getText();
    	  if(edate.equals(acDate))
    	  {
    		  System.out.println("**the expected issuse date is******"+edate);
    	  }
    	  else
    	  {
    		  System.out.println("**the actual issue date is present===="+acDate);
    	  }
      }
      public void verifyProductEdition()
      {
    	  String eproduct = "actiTIME 2017.4";
    	   String acProduct = productEdition.getText();
        if(eproduct.equals(acProduct))
        {
        	System.out.println("***the expected product is==="+eproduct);
        }
        else
        {
        	System.out.println("*** the product is not math==="+acProduct);
        }
      }
	}

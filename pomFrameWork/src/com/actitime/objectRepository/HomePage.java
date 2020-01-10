package com.actitime.objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.genric.FWUtils;

public class HomePage extends FWUtils {
	@FindBy(xpath="//div[@class='popup_menu_icon settings_icon']")
	private WebElement settings;
	@FindBy(xpath="//a[text()='Licenses']")
	private WebElement license;
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void  VerifyHomePage(WebDriver driver)
	{
		String title = driver.getTitle();
		String actitle = "actiTIME - Enter Time-Track";
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		if(title.equals(actitle))
		{
			System.out.println("***title is same*=="+actitle);
		}
		else
		{
			System.out.println("**wrong title=="+title);
		}
	}
	
	public void clickSettings() throws InterruptedException
	{
		settings.click();
		Thread.sleep(1000);
	}
   public void clickLicense()
  {
   license.click();	
   
   }
	}
   
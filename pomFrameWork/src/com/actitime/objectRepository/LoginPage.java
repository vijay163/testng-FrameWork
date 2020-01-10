package com.actitime.objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.genric.FWUtils;

public class LoginPage extends FWUtils {
	@FindBy(id="username")
	private WebElement user;
	@FindBy(name="pwd")
	private WebElement pass;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement ErrorMSg;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUser(String un) throws InterruptedException
	{
		user.sendKeys(un);
		Thread.sleep(1000);
		System.out.println("*entered usrename==="+user.getAttribute("value"));
	}
	public void setPass(String pw) throws InterruptedException
	{
		pass.sendKeys(pw);
		Thread.sleep(1000);
		System.out.println("*entered passward==="+pass.getAttribute("value"));
	}
	public void setLogin() throws InterruptedException
	{
		login.click();
		Thread.sleep(1000);
	}
	public void ERRMessage() throws InterruptedException

	{
		/*if(ErrorMSg.isDisplayed())
		{
			Thread.sleep(2000);
			System.out.println("*****Error Message is Displayed***"+ErrorMSg.getText());
		}
	    */Assert.assertTrue(ErrorMSg.isDisplayed());
	      System.out.println("**Error message is**"+ErrorMSg.getText());
	
	}
}
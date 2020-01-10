package com.actitime.objectRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genric.FWUtils;

public class newProject extends FWUtils {
	@FindBy(xpath="//input[@id='createTasksPopup_newProject']")
	private WebElement project;
	@FindBy(xpath="//div[text()='TIME-TRACK']")
	private WebElement clickTimeTrack;
	@FindBy(xpath="//span[text()='New']")
	private WebElement newUser;
	@FindBy(xpath="(//td[@class='x-btn-right'])[1]")
	private WebElement tab;
	@FindBy(xpath="//a[text()='- New Customer -']")
	private WebElement selectCustomer;
	@FindBy(xpath="//input[@id='createTasksPopup_newCustomer']")
	private WebElement name;
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder'])[1]")
	private WebElement task;
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement clickTask;
	public newProject(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickTab()
	{
		tab.click();
	}
	public void enterNew()
	{
		newUser.click();
	}
	public void clickNew()
	{
		selectCustomer.click();
	}
    
	public void nameOfCust(String n) throws AWTException
	{
		name.sendKeys(n);
		
	    
	}
	public void projectName(String p)
	{
	project.sendKeys(p);
	}
	public void custTask(String tas)
	{
		task.sendKeys(tas);
	}
	public void created() {
		clickTask.click();
	}
}

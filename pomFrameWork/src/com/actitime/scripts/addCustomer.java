package com.actitime.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.actitime.genric.Basetest;
import com.actitime.objectRepository.LoginPage;
import com.actitime.objectRepository.newProject;

public class addCustomer extends Basetest 
{
	@Test
public void newCustomer()throws InterruptedException, AWTException 
	{
	Basetest.openApplication();
	LoginPage lp = new LoginPage(driver);
    lp.setUser("admin");
    lp.setPass("manager");
    lp.setLogin();
    newProject np = new newProject(driver);
    Thread.sleep(3000);
     np.enterNew();
     Thread.sleep(2000);
     np.clickTab();
     Thread.sleep(2000);
    np.clickNew();
    Thread.sleep(2000);
    np.nameOfCust("rahul");
    np.projectName("dance");
    Thread.sleep(2000);
    np.custTask("dj baby");
    Thread.sleep(2000);
    np.created();
    Thread.sleep(1000);
    np.verifyWebPage(driver,"actiTIME - Enter Time-Track");
   Basetest.closeApplication();
   }
}


package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.genric.Basetest;
import com.actitime.objectRepository.HomePage;
import com.actitime.objectRepository.LoginPage;
import com.actitime.objectRepository.licensePage;

public class testLicensePageforIssueDate extends Basetest
{
   @Test
public void issueDate() throws InterruptedException 
{ 
	Basetest.openApplication();
   	LoginPage l = new LoginPage(driver);
    l.setUser("admin");
    l.setPass("manager");
    l.setLogin();
    HomePage h = new HomePage(driver);
    Thread.sleep(2000);
    h.VerifyHomePage(driver);
    h.clickSettings();
    h.clickLicense();
    licensePage lic = new licensePage(driver);
    Thread.sleep(2000);
    System.err.println("***********verify page************");
    lic.verifylicensePage(driver);
    Thread.sleep(2000);
    lic.productE();
    lic.date();
    System.err.println("***************product issue date***********");
    lic.verifyIssuseDate();
    Basetest.closeApplication();

  }
}

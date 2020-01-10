package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.genric.Basetest;
import com.actitime.genric.FWUtils;
import com.actitime.objectRepository.HomePage;
import com.actitime.objectRepository.LoginPage;
import com.actitime.objectRepository.licensePage;

public class testLicensePage extends Basetest 
{
   @Test
public void licencePage() throws InterruptedException 
{
	String us = FWUtils.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 0);
	String pw=FWUtils.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 1);
	Basetest.openApplication();
   	LoginPage l = new LoginPage(driver);
    l.setUser(us);
    l.setPass(pw);
    l.setLogin();
    HomePage h = new HomePage(driver);
    Thread.sleep(2000);
    h.VerifyHomePage(driver);
    h.clickSettings();
    h.clickLicense();
    licensePage lic = new licensePage(driver);
    Thread.sleep(2000);
    System.err.println("*****verify license page**************");
    lic.verifylicensePage(driver);
    Thread.sleep(2000);
    lic.productE();
    lic.date();
    System.err.println("***verify product edition**********");
    lic.verifyProductEdition();
    FWUtils.takeScreenShot(driver,"./screenShot/license.png");
    Thread.sleep(1000);
    Basetest.closeApplication();

  }
}

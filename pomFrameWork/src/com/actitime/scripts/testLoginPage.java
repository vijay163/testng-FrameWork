package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.genric.Basetest;
import com.actitime.genric.FWUtils;
import com.actitime.objectRepository.LoginPage;
/*
 * @vijay
 */
public class testLoginPage extends Basetest
{
	@Test
public void readData() throws InterruptedException 
{
	int rc=FWUtils.XL_Row_Count(XL_DATA_PATH, "InvalidLogin");
	System.out.println(rc);
	System.err.println("********test is start now*****************");
     Basetest.openApplication();
	//create login page object
	LoginPage lp = new LoginPage(driver);
	for(int i=1;i<=rc;i++)
	{
		String un=FWUtils.read_XL_Data(XL_DATA_PATH, "InvalidLogin", i, 0);
		String pw=FWUtils.read_XL_Data(XL_DATA_PATH, "InvalidLogin", i, 1);
		lp.setUser(un);
		lp.setPass(pw);
		lp.setLogin();
		Thread.sleep(1000);
		lp.ERRMessage();
	}
	    
        FWUtils.verifyWebPage(driver,"actiTIME - Login");	
	    Basetest.closeApplication();
   

}
}

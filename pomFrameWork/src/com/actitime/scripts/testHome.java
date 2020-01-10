package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.genric.Basetest;
import com.actitime.genric.FWUtils;
import com.actitime.objectRepository.LoginPage;

public class testHome extends Basetest
{
	@Test
	public void verifyHomePage() throws InterruptedException {
		// FirefoxDriver driver = new FirefoxDriver();
		Basetest.openApplication();
		String un = FWUtils.read_XL_Data(XL_DATA_PATH, "ValidLogin", 1,0);
		String pw = FWUtils.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.setUser(un);
		lp.setPass(pw);
		lp.setLogin();
		
		FWUtils.verifyWebPage(driver, "actiTIME - Enter Time-Track");
		Basetest.closeApplication();

	}
}

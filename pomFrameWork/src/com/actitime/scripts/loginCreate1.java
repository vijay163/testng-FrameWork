package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.genric.FWUtils;

public class loginCreate1 extends FWUtils
{
	@Test
public void readData()
	{
	FWUtils.write_Xl_DATA(XL_DATA_PATH, "ValidLogin", 4, 0, "harish sankar ");
	System.out.println("done");
	
}
}

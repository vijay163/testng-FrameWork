package com.actitime.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 abstract public class Basetest implements IAutoconstant {
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE );
	}
   public static WebDriver driver;
  public static void openApplication()
  {
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(URL);
		
  }
  public static void closeApplication()
  {
	  driver.close();
  }
  
}

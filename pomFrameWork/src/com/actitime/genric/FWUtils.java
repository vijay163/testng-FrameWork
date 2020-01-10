package com.actitime.genric;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils implements IAutoconstant{
/**
 * used to verify the webpage based on arguments	
 * @param driver
 * @param expectedTitle
 */


	public static void verifyWebPage(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.titleIs(expectedTitle));
	    String actualTitle = driver.getTitle();
	    if(actualTitle.equals(expectedTitle))
	    {
	     	System.out.println("****the expected title is==="+expectedTitle);
	    }
	    else
	    {
	    	System.out.println("*the expected title is wrong we get===="+actualTitle);
	    }
	    
	}
	/**
	 * user to read the in XML sheet based on arguments
	 * @param path
	 * @param sheet
	 * @param rowN
	 * @param colN
	 * @return
	 */
	public static String read_XL_Data(String path,String sheet,int rowN,int colN)
	{ 
		String data="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		   data=wb.getSheet(sheet).getRow(rowN).getCell(colN).toString();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	/**
	 *used to write data into XML sheet based on arguments
	 * @param path
	 * @param sheet
	 * @param row
	 * @param col
	 */
	public static void write_Xl_DATA(String path,String sheet,int row,int col,String cellValue)
	{
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		    wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(cellValue);
		    
		    wb.write(new FileOutputStream(path));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	/**
	 * used to count the Rows in XML sheet based on arguments
	 * @param path
	 * @param sheet
	 * @return
	 */
	public static int XL_Row_Count(String path,String sheet)
	{
	    int rowCount=0;
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		    rowCount=wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	return rowCount;
	}
	/**
	 * used to take the ScreenShot for Idenetity
	 * @param driver
	 * @param path
	 */
	public static void takeScreenShot(WebDriver driver,String path)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		     File des = new File(path);
		    FileUtils.copyFile(src, des);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * is used to pass Explicit wait method()
	 * @param driver
	 */
	public static void explictWait(WebDriver driver)
	{
		new WebDriverWait(driver,ETO);
	}
	/**
	 * using for all actions methods()
	 * @param driver
	 */
	public static void action(WebDriver driver)
	{
		new Actions(driver);
	}
	/**
	 * using to perform mousecurser
	 * @param element
	 */
	public static void mouseAction(WebElement element)
	{
		new Select(element);
	}
	/**
	 * using for robot actions
	 * @param driver
	 */
	public static void robot(WebDriver driver)
	{ try {
		new Robot();
	      }
	catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	}
	}

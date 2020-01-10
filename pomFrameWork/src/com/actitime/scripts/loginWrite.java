package com.actitime.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class loginWrite
{
	@Test
public void enterData() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
Cell un = wb.getSheet("ValidLogin").createRow(2).createCell(0);
un.setCellValue("maheshBabu");
wb.write(new FileOutputStream("./data/input.xlsx"));
Cell pw = wb.getSheet("ValidLogin").getRow(2).createCell(1);
pw.setCellValue("Alokvarma");
wb.write(new FileOutputStream("./data/input.xlsx"));

}
}

package org.datagenerators;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	
	@DataProvider(name = "Excel")
	public static Object[][] testDataGenerator() throws IOException{
		
		FileInputStream fis = null;
		XSSFWorkbook workbook = null;
		
		try {
			fis = new FileInputStream("./TestData/TestData.xlsx");
			workbook = new XSSFWorkbook(fis);
			XSSFSheet loginSheet = workbook.getSheet("Login");
			
			int NumberOfRow = loginSheet.getPhysicalNumberOfRows();
			Object[][] testData = new Object[NumberOfRow][2];
			
			for(int i=0; i<NumberOfRow;i++) {
				XSSFRow row = loginSheet.getRow(i);
				XSSFCell username = row.getCell(0);
				XSSFCell password = row.getCell(1);
				
				testData[i][0]= username.toString();
				testData[i][1]= password.toString();
			}
			
			return testData;
			
		} finally {
			// Close resources to prevent memory leaks
			if(workbook != null) {
				workbook.close();
			}
			if(fis != null) {
				fis.close();
			}
		}
		
	}

}

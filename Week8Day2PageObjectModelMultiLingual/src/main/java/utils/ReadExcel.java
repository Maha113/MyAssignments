package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	public static String[][] getData(String excelfilename) throws IOException{
		//To Open a spreadsheet
		XSSFWorkbook book = new XSSFWorkbook("./testData/"+excelfilename+".xlsx");
		//To open a specific sheet
		XSSFSheet sheet = book.getSheetAt(0);
		// To get the number of rows of data available
		int rowCount  = sheet.getLastRowNum();
		System.out.println("Rows Count "+ rowCount);
		// To get the number of cols of data available
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count " + colCount);
		
		//Create 2D Array to store the data read from the excel
		String[][] data = new String[rowCount][colCount];
		
		for (int i=1; i<=rowCount; i++) {
			for(int j=0; j< colCount; j++) 
			{
			   String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			    System.out.println(stringCellValue);
			    data[i-1][j]= stringCellValue;
			}
		}
		
		book.close();
		return data;
	}

}

package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_SingleTestData {

	public static void main(String[] args) throws IOException {


		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(3);
		
		Cell cell = row.createCell(4);
		
		cell.setCellValue("Learning Automation");
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		workbook.write(file1);
		
	}

}

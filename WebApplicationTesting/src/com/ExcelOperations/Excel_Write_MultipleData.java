package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_MultipleData {

	public static void main(String[] args) throws FileNotFoundException {

		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/MultipleTestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		
		
		
	}

}

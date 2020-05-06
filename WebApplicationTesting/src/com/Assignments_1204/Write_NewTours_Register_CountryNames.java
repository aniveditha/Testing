package com.Assignments_1204;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Write_NewTours_Register_CountryNames extends BasicScript{
	
	public void newTours_register() throws IOException
	{
		url="http://newtours.demoaut.com";
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();

		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select select_country = new Select(country);

		List<WebElement>countries=country.findElements(By.tagName("option"));
	
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/Data_Export_Import_Testing.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("NewToursCountryName");
		
		for(int i=0;i<countries.size();i++)
		{
		
			String countryname = countries.get(i).getText();
			
			System.out.println(countryname);
			
		
		    Row row=sheet.createRow(i);
			
			
			Cell cell = row.createCell(0);
			cell.setCellValue(countryname);

			FileOutputStream fos = new FileOutputStream("./src/com/ExcelTestDataFiles/Data_Export_Import_Testing.xlsx");
			workbook.write(fos);
			
			
		
		
		}
		
	
	}
	

	public static void main(String[] args) {
		
		Write_NewTours_Register_CountryNames Countrynames = new Write_NewTours_Register_CountryNames();
		
		Countrynames.launchBrowser();
		try
		{
		Countrynames.newTours_register();
		} 
		catch(Exception e)
		{
		System.out.println("something wrong");
		}
		
		Countrynames.ApplicationClose();
		


		

	}

}

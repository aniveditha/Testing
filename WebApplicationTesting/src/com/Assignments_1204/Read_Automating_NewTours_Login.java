package com.Assignments_1204;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Read_Automating_NewTours_Login extends BasicScript {

	
	public void newTours_Login() throws IOException
	{
	
		url = "http://newtours.demoaut.com";
		driver.get(url);
		
		// <input type="text" name="userName" size="10">
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/Data_Export_Import_Testing.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("NewTours_Login_Input_Output");
		
		
		int rowcount=sheet.getLastRowNum();

		for(int i=0;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			int cellcount = row.getLastCellNum();
			
			for(int j=0;j<cellcount;j++)
			{
				Cell cell =  row.getCell(j);
		
				String data=cell.getStringCellValue();
			
				if(j==0)
				{
					userName.sendKeys(data);
					System.out.println("j==0 -"+i+" - "+j+" - "+data);
									}
				if(j==1)
				{
				password.sendKeys(data);
				System.out.println("j==1 -"+i+" - "+j+" - "+data); 
				
				}
				
						
				
				Actions action = new Actions(driver);
				
				action.sendKeys(Keys.ENTER).perform();
						
				String expected_homepage_title="find a flight: mercury tours";
				
				if(driver.getTitle().equalsIgnoreCase(expected_homepage_title))
						{
							System.out.println("Navigated to Home page - PASS");
						}
				else
				{
					System.out.println("Failed to navigate to homepage - FAIL");
				}
				
				driver.get(url);
				userName = driver.findElement(By.xpath("//input[@name='userName']"));
				password=driver.findElement(By.xpath("//input[@name='password']"));
				
			}
		}
		
		/*
		Row r1=sheet.getRow(1);
		Cell c1=r1.getCell(0);
		String userName_input=c1.getStringCellValue();
		
		Cell c2=r1.getCell(1);
		String password_input=c2.getStringCellValue();
		
		userName.sendKeys(userName_input);
		password.sendKeys(password_input);
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		*/
		
		
		
		
	}
	
	public static void main(String[] args) {


		Read_Automating_NewTours_Login WebApplication = new Read_Automating_NewTours_Login();
		
		WebApplication.launchBrowser();
		try {
			WebApplication.newTours_Login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebApplication.ApplicationClose();
		

	}

}

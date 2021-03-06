package com.NewToursApplication_TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_LoginTest_MultipleTestData extends BaseTest{

	
	@Test
	public void logInPage() throws IOException
	{
	
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_Login_TestData.xlsx");
		XSSFWorkbook wordBook = new XSSFWorkbook(file);
		XSSFSheet sheet = wordBook.getSheet("Sheet1");

		int rowcount=sheet.getLastRowNum();

		for(int i=1;i<=rowcount;i++)
		{
			
		Row row=sheet.getRow(i);
		
			
		//<input type="text" name="userName" size="10">
		
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.sendKeys(row.getCell(0).getStringCellValue());
	
		//<input type="password" name="password" size="10">
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys(row.getCell(1).getStringCellValue());
	
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		String expected_HomePageTitle = "Find";
		System.out.println("The expected HomePage title after successful login is : "+expected_HomePageTitle );
	
		String actual_HomePageTitle=driver.getTitle();
		System.out.println("The actual HomePage Title is : "+actual_HomePageTitle);
		
		if(actual_HomePageTitle.contains(expected_HomePageTitle))
		{
			System.out.println("Login Successfull - PASS");
			row.createCell(2).setCellValue("Login Successfull - PASS");
		}
		else
		{
			System.out.println("Login Failed - FAIL");
			row.createCell(2).setCellValue("Login Failed - FAIL");
			
		}
		FileOutputStream fos = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LoginTest_TestData_TestResult.xlsx");
		wordBook.write(fos);
		
		driver.navigate().back();
		}
	}
	}

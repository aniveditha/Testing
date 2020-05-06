package com.NewToursApplication_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Register_MultipleData extends BaseTest
{

	@Test
	public void registration() throws IOException
	{
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_Register_TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
				
		Row row = sheet.getRow(i);
			
		
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.clear();
		firstName.sendKeys(row.getCell(0).getStringCellValue());
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.clear();
		lastName.sendKeys(row.getCell(1).getStringCellValue());

		
		double x = row.getCell(2).getNumericCellValue();
		long d=(long)x;
		String phoneNumber =Long.toString(d);
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.clear();
		phone.sendKeys(phoneNumber);
		
		WebElement email=driver.findElement(By.name("userName"));
		email.clear();
		email.sendKeys(row.getCell(3).getStringCellValue());
		
		WebElement address=driver.findElement(By.name("address1"));
		address.clear();
		address.sendKeys(row.getCell(4).getStringCellValue());
		
		WebElement city=driver.findElement(By.name("city"));
		city.clear();
		city.sendKeys(row.getCell(5).getStringCellValue());
		
		WebElement state=driver.findElement(By.name("state"));
		state.clear();
		state.sendKeys(row.getCell(6).getStringCellValue());
		
		double p=row.getCell(7).getNumericCellValue();
		long q=(long)p;
		String postalcode_Number=Long.toString(q);
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.clear();
		postalCode.sendKeys(postalcode_Number);
		
		WebElement country=driver.findElement(By.name("country"));
		Select select_country=new Select(country);
		select_country.selectByVisibleText(row.getCell(8).getStringCellValue());
		
		WebElement userName = driver.findElement(By.name("email"));
		userName.clear();
		userName.sendKeys(row.getCell(9).getStringCellValue());
		
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys(row.getCell(10).getStringCellValue());
		
		WebElement confirmPassword=driver.findElement(By.name("confirmPassword"));
		confirmPassword.clear();
		confirmPassword.sendKeys(row.getCell(11).getStringCellValue());
		
		WebElement submit=driver.findElement(By.name("register"));
		submit.click();
		
		String expected_userName=row.getCell(9).getStringCellValue();
		System.out.println("The expected username is : "+expected_userName);
		
		String actual_userName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println("The actual username is :"+actual_userName);
		
		
		if(actual_userName.contains(expected_userName))
		{
			System.out.println("The regestraion was done successfully - PASS");
			row.createCell(12).setCellValue(" The regestraion was done successfully - PASS ");
			
		}
		else
		{
			System.out.println("Regestration failed - FAIL");
			row.createCell(12).setCellValue(" Regestration failed - FAIL ");
		}
		
		FileOutputStream fos = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_Register_TestResult.xlsx");
		workBook.write(fos); 
		
		driver.navigate().back();
		}

	
	
	
	
		}
	
}
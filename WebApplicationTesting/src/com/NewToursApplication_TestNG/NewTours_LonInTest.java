package com.NewToursApplication_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LonInTest {

	WebDriver driver = null;
	String url = "http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void end()
	{
		driver.quit();
	}
	
	
	@Test
	public void logInPage() throws IOException
	{
	
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_Login_TestData.xlsx");
		XSSFWorkbook wordBook = new XSSFWorkbook(file);
		XSSFSheet sheet = wordBook.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		
		//<input type="text" name="userName" size="10">
		
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys(row.getCell(0).getStringCellValue());
	
		//<input type="password" name="password" size="10">
		
		WebElement password = driver.findElement(By.name("password"));
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
	}
	
}
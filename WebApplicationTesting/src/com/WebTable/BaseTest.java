package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public String url = "http://timeanddate.com";
	public WebDriver driver = null;
	
public void launchBrowser()
		{

          System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
          driver.get(url);
          driver.findElement(By.linkText("World Clock")).click();
		}
public void WebApplicationClose()
{
	driver.quit();
	
}
	
public void excel() throws IOException
{
	FileInputStream file = new FileInputStream("/src/com/ExcelTestDataFiles/Data_Export_Import_Testing.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("WebTableData");
	
	
	
}

public void launchNewTours()
{
	
}

}

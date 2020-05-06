package com.Assignments_1204;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	String url;
	WebDriver driver = null;
	
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}



	
	public void ApplicationClose()
	{
		driver.quit();
	}
	
	public static void main(String[] args) {
		BasicScript base = new BasicScript();
		base.launchBrowser();
		
		base.ApplicationClose();
	}
}

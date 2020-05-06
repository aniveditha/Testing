package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cityname_FirstRow_FirstColumn {

	String url = "http://timeanddate.com";

	WebDriver driver = null;

	
public void dateandtime() {

	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get(url);
	//<a href="/worldclock/" class="navMenu__item">World Clock</a>
	
	driver.findElement(By.linkText("World Clock")).click();
	WebElement cityname=driver.findElement(By.linkText("Accra"));

	String cityname_text=cityname.getText();
	
	System.out.println(cityname_text);

}

public void WebApplicationClose()
{
	driver.quit();
	
}
	public static void main(String[] args) {
		
		
		Cityname_FirstRow_FirstColumn firstCityName = new Cityname_FirstRow_FirstColumn();
	
		firstCityName.dateandtime();
		firstCityName.WebApplicationClose();
		
		
		
	}

}

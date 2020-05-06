package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\NivedithaSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
		
	driver.get("http://amazon.in");	

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\NivedithaSelenium\\WebApplicationTesting\\DriverFiles\\geckodriver.exe");
		
	FirefoxDriver driverd = new FirefoxDriver();
	driverd.get("http://facebook.com");	
		
		
	}

}

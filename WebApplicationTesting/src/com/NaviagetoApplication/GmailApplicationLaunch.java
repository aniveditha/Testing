package com.NaviagetoApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class GmailApplicationLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("http://gmail.com");
		
		chrome.get("http://facebook.com");
		
		//chrome.close();

	}

}

package com.NewTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LinksCount {

	public static void main(String[] args) {
		
		String url = "http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		//<a href="mercurysignon.php">SIGN-ON</a>
		//<a href="mercuryregister.php">REGISTER</a>
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links on the NewTours Login Page are - "+links.size());
		
		
		for(int i=0;i<links.size();i++)
		{
			String linkName = links.get(i).getText();
			System.out.println(i+" "+linkName);
			
			links.get(i).click();
			
			System.out.println("The actual title of the Web Page is : "+driver.getTitle());
			System.out.println("The Current Url of the WebPage is : "+driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			links = driver.findElements(By.tagName("a"));
			
			
		}
		driver.quit();
	
	}

}

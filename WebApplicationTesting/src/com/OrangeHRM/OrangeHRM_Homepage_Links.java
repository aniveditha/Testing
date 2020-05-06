package com.OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Homepage_Links {

	public static void main(String[] args) {
		String url="http://opensource-demo.orangehrmlive.com/";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		//id - txtUsername
		WebElement UserName=driver.findElement(By.id("txtUsername"));
		WebElement Password=driver.findElement(By.id("txtPassword"));
		WebElement LogIn=driver.findElement(By.id("btnLogin"));
		UserName.sendKeys("Admin");
		Password.sendKeys("admin123");
		LogIn.click();
		
		List<WebElement>Links_Homepage=driver.findElements(By.tagName("b"));
		int Links_Count=Links_Homepage.size();
		
		System.out.println("The number of links in the orange hrm homepage is : "+Links_Count);
		System.out.println();
		
		for(int i=0;i<Links_Count;i++)
		{
			System.out.println(i+" "+Links_Homepage.get(i).getText());
		}
		
	}

}

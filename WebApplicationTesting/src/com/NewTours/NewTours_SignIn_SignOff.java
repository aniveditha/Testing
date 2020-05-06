package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_SignIn_SignOff {

	public static void main(String[] args) {
		
		String url = "http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		//name - "userName"
		
		WebElement UserName=driver.findElement(By.name("userName"));
		
		//name - "password"
		
		WebElement Password=driver.findElement(By.name("password"));
		
		UserName.sendKeys("tutorial");
		Password.sendKeys("tutorial");

		//name - "login"
		
		driver.findElement(By.name("login")).click();
		
		//Signoff linktext - "SIGN-OFF"

		WebElement SignOff = driver.findElement(By.linkText("SIGN-OFF"));
		
		
		SignOff.click();
		
		driver.quit();
		

	}

}

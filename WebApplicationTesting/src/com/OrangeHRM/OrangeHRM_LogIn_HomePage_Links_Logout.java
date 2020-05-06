package com.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM_LogIn_HomePage_Links_Logout {

	public static void main(String[] args) {
		
		String url="http://opensource-demo.orangehrmlive.com/";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get(url);
		//id - txtUsername
		WebElement UserName=driver.findElement(By.id("txtUsername"));
		WebElement Password=driver.findElement(By.id("txtPassword"));
		WebElement LogIn=driver.findElement(By.id("btnLogin"));
		UserName.sendKeys("Admin");
		Password.sendKeys("admin123");
		LogIn.click();
		
		List<WebElement>Links_Homepage=driver.findElements(By.tagName("a"));
		int Links_Count=Links_Homepage.size();
		
		System.out.println("The number of links in the orange hrm homepage is : "+Links_Count);
		System.out.println();
		
		for(int i=0;i<Links_Count;i++)
		{
			System.out.println(i+" "+Links_Homepage.get(i).getText());
		}
		
		
		Links_Homepage.get(1).click();
		//Links_Homepage.get(2).click();
		WebElement logout=driver.findElement(By.linkText("Logout"));
		
		String logout_url=logout.getAttribute("href");
		logout.click();
		
		
		System.out.println("The url for logout is : "+logout_url);
		
		
		//driver.quit();		
	}

}

package com.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_HomePage_DisplayVisibleLinks {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("admin123").perform();	
		action.sendKeys(Keys.ENTER).perform();
		
		List<WebElement>links_homepage=driver.findElements(By.tagName("a"));
	
		for(int i=0;i<links_homepage.size();i++)
		{
			if(links_homepage.get(i).isDisplayed())
			{
			System.out.println(i+" "+links_homepage.get(i).getText());
			}
		}
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(7000);
		
		driver.quit();
		
	}

}

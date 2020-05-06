package com.NewTours;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Links_Validation {

	public static void main(String[] args) throws IOException {
		
		String url = "http://newtours.demoaut.com";
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links on the Newtours Home Page is : "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			String expected_UrlAddress=links.get(i).getAttribute("href");
						
			System.out.println(i+" "+linkName);
			System.out.println("The Expected Url Address of "+linkName+" is "+expected_UrlAddress);
			
			
			links.get(i).click();
			
			String actual_UrlAdrdress = driver.getCurrentUrl();
			System.out.println("The Title of the Webpage is : "+driver.getTitle());
			System.out.println("The Current Url of the Webpage is : "+actual_UrlAdrdress);
			System.out.println();
			
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("./Screenshot/"+linkName+".png"));
			
			
			if(actual_UrlAdrdress.equals(expected_UrlAddress))
			{
				System.out.println("Navigated to "+linkName+" Page - PASS");
			}
			else
			{
				System.out.println("Failed to navigate to "+linkName+" Page - FAIL");
			}
			
			System.out.println();
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
					
		}

		
		
		
		driver.quit();
	}

}
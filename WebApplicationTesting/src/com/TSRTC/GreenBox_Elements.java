package com.TSRTC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenBox_Elements {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://tsrtconline.in";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		// attributename - target = "_top" - attributevalue
				
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		//System.out.println("No. of Links in the homepage : "+Links.size());
		
		int count =0;
		for(int i=0;i<Links.size();i++)
		{
			String Links_Attribute=Links.get(i).getAttribute("target");
			String Attribute_Value = "_top";
						
			if(Links_Attribute.equals(Attribute_Value))
			{
				count=count+1;
				System.out.println(count+" - "+Links.get(i).getText());
				String Expected_url = Links.get(i).getAttribute("href");
				System.out.println("The expected url is : "+Expected_url);
				Links.get(i).click();
				System.out.println("The current url of the webpage is : "+driver.getCurrentUrl());
				if(driver.getCurrentUrl().equals(Expected_url))
				{
					System.out.println("Navigated to the expected page - PASS");
				}
				else
				{
					System.out.println("Failed to navigate - FAIL");
				}
				System.out.println();
				driver.navigate().back();
				Links=driver.findElements(By.tagName("a"));
			}
			
		}
			System.out.println("Total number of Elements in the green box is : "+count);
			
			Thread.sleep(5000);
			driver.quit();
		
		
		
	}

}

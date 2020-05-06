package com.Amazon_MouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_LoginPage_Links {

	public static void main(String[] args) {
	
		String url = "http://amazon.in";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement>links_AmazonLoginPage=driver.findElements(By.tagName("a"));
		int Count_links = links_AmazonLoginPage.size();
		System.out.println("The number of links in the amazon login page are : "+Count_links);
		
		for(int i=0;i<Count_links;i++)
		{
			System.out.println(i+" "+links_AmazonLoginPage.get(i).getText());
		}
		//nav-action-button - class
		//driver.findElement(By.className("nav-action-button")).click();
		WebElement HelloSignIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions action = new Actions(driver);
		
		
		action.moveToElement(HelloSignIn).perform();
		driver.findElement(By.linkText("Sign in")).click();
		
		
		//driver.quit();
	}

}

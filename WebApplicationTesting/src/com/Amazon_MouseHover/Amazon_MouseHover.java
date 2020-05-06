package com.Amazon_MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_MouseHover {

	public static void main(String[] args) {

		String url="http://amazon.in";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		//id - nav-link-accountList
		
		WebElement HelloSignIn=driver.findElement(By.id("nav-link-accountList"));
	
		Actions action = new Actions(driver);
		
		action.moveToElement(HelloSignIn).perform();
		
		//link - Your Wish List
		
		WebElement YourWishList=driver.findElement(By.linkText("Your Wish List"));
		
		YourWishList.click();
		
		driver.quit();
	}

}

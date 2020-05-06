package com.Amazon_MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Signin_Signout {

	public static void main(String[] args) {
	
		String url = "http://amazon.in";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		//id - nav-link-accountList (signin)
		
		WebElement SignIn=driver.findElement(By.id("nav-link-accountList"));		
		
		Actions action = new Actions(driver);
		
			
		SignIn.click();
		
		//username - id - "ap_email"
		
		WebElement Login = driver.findElement(By.id("ap_email"));
		Login.sendKeys("anivedithaa@gmail.com");

		//continue button id - "continue"
		
		driver.findElement(By.id("continue")).click();
		
		//password id - "ap_password"
		
		WebElement password=driver.findElement(By.id("ap_password"));
				
		password.sendKeys("manohar7");
		
		//login button - id- "signInSubmit"
		
		driver.findElement(By.id("signInSubmit")).click();
		
		action.moveToElement(SignIn).perform();
		
		WebElement SignOut=driver.findElement(By.id("nav-item-signout"));
		SignOut.click();
		
				//signout id - "nav-item-signout"

		
		
	}

}

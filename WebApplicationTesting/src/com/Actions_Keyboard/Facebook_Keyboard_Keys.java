package com.Actions_Keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Keyboard_Keys {

	public static void main(String[] args) {

		String url = "http://facebook.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		//<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		//*[@id="email"]

		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("anivedithaa@gmail.com");
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("manohar").perform();
		action.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
	}

}

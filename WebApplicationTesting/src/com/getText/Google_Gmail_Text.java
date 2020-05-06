package com.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Gmail_Text {

	public static void main(String[] args) {
		
		String url = "http://google.com";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);		
		
		//<a class="gb_g" data-pid="23" href="https://mail.google.com/mail/?tab=wm&amp;ogbl">Gmail</a>
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		System.out.println("The text of the gmail element is : "+gmail.getText());

		driver.quit();

		

	}

}

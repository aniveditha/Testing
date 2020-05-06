package com.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_LoginPage_HomePage_Validate {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://opensource-demo.orangehrmlive.com/";
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		String expected_text = "LOGIN Pannel";
		System.out.println("The expected Text on the Login Page is : "+expected_text);
		
		WebElement LoginPanel = driver.findElement(By.id("logInPanelHeading"));
		
		System.out.println("The actual Text on the Login Page is : "+LoginPanel.getText());
		
		if(LoginPanel.getText().equals(expected_text))
		{
			System.out.println("The displayed Text Matched : PASS");
		}
		else
		{
			System.out.println("Text Not Matched - FAIL");
		}
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Username.sendKeys("Admin");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("admin123").perform();
		action.sendKeys(Keys.ENTER).perform();
		
		String expected_HomePageTitle = "OrangeHRM";
		System.out.println();
		System.out.println("The expected HomePage Title is : "+expected_HomePageTitle);
		System.out.println("The actual Homepage Title is : "+driver.getTitle());
		
		if(driver.getTitle().equals(expected_HomePageTitle))
				{
					System.out.println("The HomePage Title Matached - PASS");
				}
		else
		{
			System.out.println("Home Page Title Not Matched - FAIL");
		}
		
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		
		//<a href="/index.php/auth/logout">Logout</a>
		
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();

		Thread.sleep(5000);
				
		driver.quit();
		
		
	}

}

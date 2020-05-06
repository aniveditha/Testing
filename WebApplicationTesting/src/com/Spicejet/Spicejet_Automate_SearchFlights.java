package com.Spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Automate_SearchFlights {

	public static void main(String[] args) throws InterruptedException {

		String url="http://spicejet.com";
		WebDriver driver =null;
		
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);
		
		// departure city element id = "ctl00_mainContent_ddl_originStation1"
		
		//WebElement departure=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		
		//Select select_departure = new Select(departure);
		
		//select_departure.selectByVisibleText("Bengaluru (BLR)");
		
		//departure.click();
		
		
		//Add-ons Element-id="highlight-addons"
		driver.findElement(By.id("highlight-addons")).click();
		
		
		//Actions action = new Actions(driver);
		
		//action.moveToElement(addon).perform();
		
		driver.findElement(By.id("highlight-addons")).click();
		driver.findElement(By.linkText("SpiceMax")).click();
		
		driver.findElement(By.id("highlight-addons")).click();
		driver.findElement(By.partialLinkText("Seat + Meal Combo")).click();
		
		driver.switchTo().alert().accept();

        driver.findElement(By.id("highlight-addons")).click();
        driver.findElement(By.linkText("Priority Check-in")).click();
		
		driver.findElement(By.id("highlight-gift-card")).click();
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
	}

}

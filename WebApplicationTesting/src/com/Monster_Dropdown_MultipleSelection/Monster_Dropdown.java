package com.Monster_Dropdown_MultipleSelection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_Dropdown {

	public static void main(String[] args) {


		String url="https://www.monsterindia.com/";

		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		//Register with us button - linktext = "Register with us"
		//driver.findElement(By.linkText("Register with us")).click();
		
		//"semi-bold reg-btn block uprcse"=class : register with us element
		
		//driver.findElement(By.className("semi-bold reg-btn block uprcse")).click();
		
		
		//upload resume element : "Upload Resume" = linktext
		
		driver.findElement(By.linkText("Upload Resume")).click();
		
		//          name = "location" /classname ="multiselect modal-ref-class multiBox" //current location
		
		//WebElement currentLocation=driver.findElement(By.name("location"));
		//currentLocation.click();
		//currentLocation.sendKeys("bengaluru");
				
		// preferred insustry element - name = "industry"
		
		
		WebElement industry=driver.findElement(By.name("industry"));
		Select selection_industry = new Select(industry);
		
		selection_industry.selectByIndex(0);
		industry.sendKeys("ad");
		
		
		
		
		
	}

}

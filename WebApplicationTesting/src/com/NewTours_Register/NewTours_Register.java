package com.NewTours_Register;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register {

	public static void main(String[] args) {


		String url = "http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		//<a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement> countries=country.findElements(By.tagName("option"));
		int countrycount=countries.size();
		System.out.println("The number of countries in the dropdown is : "+countrycount);
		
		for(int i=0;i<countrycount;i++)
		{
			String countryname=countries.get(i).getText();
			System.out.println(i+" "+countryname);
		}
		
		Select selection = new Select(country);
		
		selection.selectByIndex(99);
		selection.selectByValue("85");
		
		selection.selectByVisibleText("ZIMBABWE");
		
		driver.quit();

	}

}

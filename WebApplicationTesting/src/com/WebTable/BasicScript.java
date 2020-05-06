package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	String url;
	WebDriver driver = null;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void newTours_register()
	{
		url="http://newtours.demoaut.com";
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();

		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select select_country = new Select(country);

		List<WebElement>countries=country.findElements(By.tagName("option"));
	
		for(int i=0;i<countries.size();i++)
		{
			System.out.println(countries.get(i).getText());
		}
	
	
	}

	public void ApplicationClose()
	{
		driver.quit();
	}
	
	public static void main(String[] args) {
		BasicScript base = new BasicScript();
		base.launchBrowser();
		base.newTours_register();
		base.ApplicationClose();
	}
}

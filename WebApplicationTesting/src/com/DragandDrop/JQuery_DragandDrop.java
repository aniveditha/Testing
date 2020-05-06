package com.DragandDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://jquery.com";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.linkText("jQuery UI")).click();
		driver.findElement(By.linkText("Droppable")).click();
		
		WebElement dropElementFrame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(dropElementFrame);
		
		WebElement	dragelement=driver.findElement(By.id("draggable"));
		System.out.println(dragelement.getClass());
				
		
		WebElement drop_target=driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(dragelement, drop_target).perform();
		driver.switchTo().defaultContent();
		
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		resizable.click();
		System.out.println("The title of the resizable page is : "+driver.getTitle());
		
		driver.quit();
		

		


		

	}

}

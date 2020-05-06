package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstColumnCitynames extends BaseTest {
	
	public void firstColumn() {
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		
		for(int i=1;i<36;i++)
		{
		
			WebElement cityname = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println(cityname.getText());
		}
			
		
	}
	

	public static void main(String[] args) {
		
		FirstColumnCitynames columncitynames = new FirstColumnCitynames();
		columncitynames.launchBrowser();
		columncitynames.firstColumn();
		columncitynames.WebApplicationClose();


		
		
		
	}

}

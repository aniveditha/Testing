package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CityName_Complete_Table extends BaseTest{
	
	public void capturingWebTable() {
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<8;j++)
			{
				WebElement cityname=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
			
				System.out.print(cityname.getText()+"   ");
			
			}
			System.out.println();
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		CityName_Complete_Table WebApplication = new CityName_Complete_Table();
		WebApplication.launchBrowser();
		WebApplication.capturingWebTable();
		WebApplication.WebApplicationClose();
		

	}

}

package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_CapturingWebTable extends BaseTest{

	public void dynamicCapturing()
	{
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]
		
		WebElement table = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
	
		//System.out.println(webTable.getSize());
		
		List<WebElement>row=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<col.size();j++)
			{
				System.out.print(col.get(j).getText());
			}

			System.out.println();
		}
	
	}
	
	
	public static void main(String[] args) {


		Dynamic_CapturingWebTable WebApplication = new Dynamic_CapturingWebTable();
		WebApplication.launchBrowser();
		WebApplication.dynamicCapturing();
		WebApplication.WebApplicationClose();
		
		

	}

}

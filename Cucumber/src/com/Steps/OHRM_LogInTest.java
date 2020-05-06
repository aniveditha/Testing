package com.Steps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRM_LogInTest
{

	WebDriver driver = null;
	String url="https://opensource-demo.orangehrmlive.com/";
			
	@Given("^Navigate to OrangeHRM Application$")
	public void navigate_to_OrangeHRM_Application() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  
	
	}
/*
	@When("^User enters UserName$")
	public void user_enters_UserName()
	{
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");

	}

	@Then("^User enters Password$")
	public void user_enters_Password()
	{
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

	}

		*/

	@When("^User enters \"([^\"]*)\" UserName$")
	public void user_enters_UserName(String UserName) 
	{
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(UserName);
			
	}

	@Then("^User enters \"([^\"]*)\" Password$")
	public void user_enters_Password(String Password) 
	{
	    
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(Password);
		 
	}
	
	@Then("^User performs click operation on logIn button$")
	public void user_performs_click_operation_on_logIn_button() 
	{
		WebElement logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();

	}

	
	@Then("^User \"([^\"]*)\" able to successfully login to the applicaiton and close the application$")
	public void user_able_to_successfully_login_to_the_applicaiton_and_close_the_application(String LogInType) throws IOException 
	{
		try {
		String expected_UserName="Admin";
		System.out.println("The expected UserName is : "+expected_UserName);
		
		WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
		String actul_WelcomeText=welcomeAdmin.getText();
		System.out.println("The actual HomePage welcome message is  : "+actul_WelcomeText);
		
		
		if(actul_WelcomeText.contains(expected_UserName))
		{
			System.out.println("Login Successful - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
			
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss, new File("./Screenshots/page.png"));
			
		}
		
		
		welcomeAdmin.click();
		
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		}catch(Exception e) {
		driver.quit();
		}
	    
	}
	
	/*
	
	@Then("^User should be able to successfully login to the applicaiton and close the application$")
	public void user_should_be_able_to_successfully_login_to_the_applicaiton_and_close_the_application() 
	{
		String expected_UserName="Admin";
		System.out.println("The expected UserName is : "+expected_UserName);
		
		WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
		String actul_WelcomeText=welcomeAdmin.getText();
		System.out.println("The actual HomePage welcome message is  : "+actul_WelcomeText);
		
		
		if(actul_WelcomeText.contains(expected_UserName))
		{
			System.out.println("Login Successful - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
			
		}
		
		welcomeAdmin.click();
		
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		
		driver.quit();


	}
	*/


}

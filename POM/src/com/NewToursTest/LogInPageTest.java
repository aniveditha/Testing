package com.NewToursTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.NewToursPages.LogInPage;

public class LogInPageTest extends BaseTest
{

	LogInPage logInPage = null;
	
	@Test(priority=1)
	public void signOnTest()
	{
		//LogInPage logInPage = new LogInPage();
		//logInPage.signOn();
		
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.signOn();
			
	}

	@Test(priority=2)
	public void yourDestinationTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.yourDestination();
		
	}
	/*
	@Test(priority=3)
	public void registerTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.register();
	}*/
	
	@Test(priority=4)
	public void supportTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.support();
	}
	
	@Test(priority=5)
	public void contactTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.contact();
		
			
		
	}
	
	@Test(priority=6)
	public void homeTest() throws IOException, InterruptedException
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.home();
		
		//Thread.sleep(6000);
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("./Screenshot/home.png"));
		
		
	}
	
	@Test(priority=7)
	public void flightsTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.flights();
		
	}
	
	@Test(priority=8)
	public void hotelsTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.hotels();
	}
	
	@Test(priority=9)
	public void carRentalsTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.carRentals();
	}
	
	@Test(priority=10)
	public void cruisesTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.cruises();
	}
	
	
	@Test(priority=11)
	public void destinationsTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.destinations();
	}
	
	@Test(priority=12)
	public void vacationsTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.vacations();
	}
	
	@Test(enabled=false)
	public void userNameTest()
	{
		logInPage=PageFactory.initElements(driver, LogInPage.class);
		logInPage.userName();
		
	}
	
	@Test(enabled=false)
	public void passwordTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.password();
	}
	
	@Test(priority=15)
	public void signInTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.signIn();
	}
	
	@Test(priority=16)
	public void featuredVacationDestinationsTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.featuredVacationDestinations();
	}
	
	@Test(priority=17)
	public void registerHereTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.registerHere();
	}
	
	@Test(priority=18)
	public void businessTravelTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.businessTravel();
	}
	
	@Test(priority=19)
	public void salonTravelTest()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		logInPage.salonTravel();
	}
	
	
}


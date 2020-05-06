package com.NewToursPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.jetty9.server.Authentication.User;

public class LogInPage 
{
	
		@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
	
	public void signOn()
	{
		SignOn.click();
	}

	@FindBy(linkText="your destination")
	WebElement YourDestination;
	
	public void yourDestination()
	{
		YourDestination.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	
	/*public void support()
	{
		Support.click();
	}*/
	
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	
	public void contact()
	{
		Contact.click();
	}
	
	@FindBy(linkText="Home")
	WebElement Home;
	
	public void home()
	{
		Home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement Flights;
	
	public void flights()
	{
		Flights.click();
	}
	
	@FindBy(linkText="Hotels")
	WebElement Hotels;
	
	public void hotels()
	{
		Hotels.click();
		
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement CarRentals;
	
	public void carRentals()
	{
		CarRentals.click();
	}
	
	@FindBy(linkText="Cruises")
	WebElement Cruises;
	
	public void cruises()
	{
		Cruises.click();
		
	}
	
	@FindBy(linkText="Destinations")
	WebElement Destinations;
	
	
	public void destinations()
	{
		Destinations.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	
	public void vacations()
	{
		Vacations.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	public void userName()
	{
		UserName.sendKeys("tutorial");
	}
	
	@FindBy(name="password")
	WebElement Password;
	
	public void password()
	{
		Password.sendKeys("tutorial");
	}
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void signIn()
	{
		SignIn.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement FeaturedVacationDestinations;
	
	public void featuredVacationDestinations()
	{
		FeaturedVacationDestinations.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement RegisterHere;
	
	public void registerHere()
	{
		RegisterHere.click();
	}
	
	// <a href="http://businesstravel.about.com/mbody.htm?PM=78_101_T&amp;cob=home" target="_blank">Business Travel @ About.com</a>
	
	@FindBy(linkText="Business Travel @ About.com")
	WebElement BusinessTravel;
	
	public void businessTravel()
	{
		BusinessTravel.click();
	}
	
	@FindBy(linkText="Salon Travel")
	WebElement SalonTravel;
	
	public void salonTravel()
	{
		SalonTravel.click();
	}

	public void support() {
		// TODO Auto-generated method stub
	Support.click();	
	}
	
	
	
	
}

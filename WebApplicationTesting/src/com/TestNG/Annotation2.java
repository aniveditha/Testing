package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	
	
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch Success");
	}

	@AfterTest
	public void starredBox()
	{
		System.out.println("starredBox functionality Executed Succesfully");
	}
	
	@Test(priority=1)
	public void inBox()
	{
		System.out.println("Inbox Functionlaity Executed Successfully");
			}

	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println("composeMail Functionlaity Executed Successfully");
	}
	
	@Test(priority=3)
	public void sentMail()
	{
		System.out.println("sentMail Functionlaity Executed Successfully");
	}
	

}

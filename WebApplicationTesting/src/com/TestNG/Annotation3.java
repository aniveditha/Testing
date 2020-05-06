package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 {


	@BeforeMethod
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch Success");
	}

	@AfterMethod
	public void applicationCLose()
	{
		System.out.println("Application Closed Succesfully");
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



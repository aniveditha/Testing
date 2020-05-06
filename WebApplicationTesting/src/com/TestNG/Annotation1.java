package com.TestNG;

import org.testng.annotations.Test;

public class Annotation1 {
	
	@Test(priority=1)
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch Success");
	}
	
	@Test(priority=2)
	public void inBox()
	{
		System.out.println("Inbox Functionlaity Executed Successfully");
			}

	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println("composeMail Functionlaity Executed Successfully");
	}
	
	@Test(priority=4)
	public void sentMail()
	{
		System.out.println("sentMail Functionlaity Executed Successfully");
	}
}

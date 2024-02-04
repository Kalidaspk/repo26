package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule 

{
	@Test
	public void login()
	{
			Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	@Test
	public void CreateCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test
	public void ModifyCustomer()
	{
		Reporter.log("ModifyCustomer",true);
	}
	
	
}

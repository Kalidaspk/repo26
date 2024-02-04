package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;


@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer1 extends BaseClass

{
		@Test
		
		public void createTask()
		{
			Reporter.log("createTask",true);
			Assert.fail();
		}
	}



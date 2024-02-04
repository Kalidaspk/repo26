package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

public class ActiCustomer extends BaseClass {
   
	   @Test
	   public void TestCreateCustomer() throws InterruptedException
	   {
		   Reporter.log("create customer",true);
		  // Assert.fail();
		   
		   HomePage h=new HomePage(driver);
		       h.setTask();
		   
		   
		    TaskPage t=new TaskPage(driver);
		       t.getAddbtn().click();
		       Thread.sleep(2000);
		       t.getNewCustmerbtn().click();
		         Thread.sleep(2000);
		       t.getPlaceholderText().sendKeys("Hdfc-001");
		       Thread.sleep(2000);
		       t.getDescription().sendKeys("banking Project");
		       Thread.sleep(2000);
		       t.getDropDown().click();
		       Thread.sleep(2000);
		       t.getDropDElement().click();
		       Thread.sleep(2000);
		       t.getCreateCustomer().click();
		       
	   }
	   

}

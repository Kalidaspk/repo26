package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logoutLink")
	private WebElement Logout;
	
	 @FindBy(xpath="//div[text()='Tasks']")
	  private   WebElement taskTab;
	
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void setLogout()
	{
		Logout.click();
	}
	public void setTask()
	{
		taskTab.click();
	}

}

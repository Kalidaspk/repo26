package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginProject 
{
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	@FindBy(id="container_tasks")
	private WebElement taskbtn;
	
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addbtn;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement addnew;
	@FindBy(xpath="	(//input[contains(@class,'inputFieldWithPlaceholder')])[4]")
	private WebElement addname;
	@FindBy(xpath="(//div[@class='inputContainer'])[9]")
	private WebElement addDescription;
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement select;

	public LoginProject (WebDriver driver)
{
	PageFactory.initElements(driver,this);
	}
public void setUser(String un,String pw,String add,String desc) throws InterruptedException
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgBtn.click();
	taskbtn.click();
	addbtn.click();
	addnew.click();
	addname.sendKeys(add);
	Thread.sleep(1000);
	 addDescription.sendKeys(desc);
	 select.click();
}

}

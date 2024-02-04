package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class TaskPage {
  

	@FindBy(xpath="//div[text()='Add New']")
	    private WebElement addbtn;
	 
	 @FindBy(xpath="//div[text()='+ New Customer']")
	    private WebElement newCustmerbtn;
	 
	 
	 @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	    private WebElement placeholderText;
	 

	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	    private WebElement description;
	 
	   @FindBy(xpath="//div[text()='- Select Customer -'and@class='emptySelection']")
	    private WebElement dropDown;
	 
	  // @FindBy(xpath="//div[@class='searchItemList']/div[@class='itemRow cpItemRow selected']")
	   @FindBy(xpath="(//div[@class='searchItemList']/div)[3]")
	   private WebElement dropDElement;
	   
	   @FindBy(xpath="//div[text()='Create Customer']")
	    private WebElement createCustomer;
	   
	   public TaskPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	    

		 public WebElement getAddbtn() {
			return addbtn;
		}

		public WebElement getNewCustmerbtn() {
			return newCustmerbtn;
		}

		public WebElement getPlaceholderText() {
			return placeholderText;
		}

		public WebElement getDescription() {
			return description;
		}

		public WebElement getDropDown() {
			return dropDown;
		}

		public WebElement getDropDElement() {
			return dropDElement;
		}

		public WebElement getCreateCustomer() {
			return createCustomer;
		}
	   

}

package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.actitime.pom.LoginPage;

public class ExecuteMethod {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	LoginPage l=new LoginPage(driver);
	//	l.setUser("admin","manager");
		
	}

}

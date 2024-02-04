package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.Login;

public class BaseClass {
//	public static WebDriver driver;
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) 
	{
		Reporter.log("openBrowser", true);
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
	}
		else if(browser.equals("firefox"))
		{	
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Reporter.log("closeBrowser", true);
		Thread.sleep(4000);
		driver.quit();
	}

	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login", true);
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		Login l = new Login(driver);
		l.setLogin(un, pw);
	}
   
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
		HomePage h = new HomePage(driver);
		h.setLogout();
	}
  
	}

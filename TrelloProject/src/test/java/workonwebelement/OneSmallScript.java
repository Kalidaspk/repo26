package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneSmallScript 
{
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameTextField = driver.findElement(By.id("usename"));
	usernameTextField.clear();
	usernameTextField.sendKeys("admin");
	Thread.sleep(2000);
//	enter the password
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
//		click on login button
		driver.findElement(By.id("loginButton"));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.quit();
	
	
}
}

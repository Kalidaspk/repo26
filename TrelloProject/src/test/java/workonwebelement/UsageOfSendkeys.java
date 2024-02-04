package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendkeys 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//identify the user name text field
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.sendKeys("admin");
	Thread.sleep(2000);
	WebElement pswtextfield = driver.findElement(By.name("pwd"));
	pswtextfield.sendKeys("manager");
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.quit();
	
	
}
}

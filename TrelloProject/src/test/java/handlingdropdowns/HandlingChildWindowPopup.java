package handlingdropdowns;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup 
{
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/");
	//Thread.sleep(3000);
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	String pwh = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh)
	{
		Thread.sleep(2000);
		driver.switchTo().window(wh);
	
	if(pwh.equals(wh))
			{
		
			}
	else
	{
	driver.close();
	}
	}
	
}
}

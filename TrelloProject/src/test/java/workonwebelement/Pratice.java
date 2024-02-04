package workonwebelement;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice
{
	public static void main(String[] args) throws Throwable  
 {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-facebook-button")).click();
		
		Set<String> allwindowid = driver.getWindowHandles();
		for(String id:allwindowid)
		{
			driver.switchTo().window(id);
			driver.close();
		}
//		driver.close();

 }
}
	

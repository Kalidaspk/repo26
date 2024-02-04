package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage 
{
	public static void main(String[] args) throws InterruptedException {
		
	
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.actitime.com/login.do");
 driver.findElement(By.id("username")).sendKeys("admin");
 driver.findElement(By.id("pwd")).sendKeys("manager");
 Thread.sleep(2000);
 driver.findElement(By.id("loginButton")).clear();
 
	}
}

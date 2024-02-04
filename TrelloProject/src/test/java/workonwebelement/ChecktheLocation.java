package workonwebelement;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChecktheLocation 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Point usenameLocation = driver.findElement(By.id("email")).getLocation();
	System.out.println("usenameLocation = "+ usenameLocation);
	Point passwordLocation = driver.findElement(By.id("passContainer")).getLocation();
	System.out.println("passwordLocation = "+passwordLocation);
	driver.manage().window().minimize();
	driver.quit();
}
}

package workonwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton
{
public static void main(String[] args) throws InterruptedException 
{
//	instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//	maximize the browser window 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	pass the main URL of the applications
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
//	find login button
	WebElement loginbutton = driver.findElement(By.name("login"));
//	click on login button
	loginbutton.click();
//	click on login button
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.quit();
	
}
}

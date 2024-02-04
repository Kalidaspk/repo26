package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinktext
{

public static void main(String[] args) throws Throwable 
{
//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
//	maximize the browser window
	driver.manage().window().maximize();
//	pass the main Url of the app
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
//	identify the Forgotten password?
	 WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
//	click on Forgotten password?
	 forgottenPassword.click();
	 Thread.sleep(4000);
	 driver.manage().window().minimize();
	 driver.quit();
}
}

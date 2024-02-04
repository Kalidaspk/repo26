package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinkText_01 
{
	
public static void main(String[] args) throws Throwable
{
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.facebook.com/");
 Thread.sleep(2000);
 //find the forgotten password?
  WebElement linktext = driver.findElement(By.linkText("Forgotten password?"));
   linktext.click();
   Thread.sleep(2000);
   driver.manage().window().minimize();
   driver.quit();
 
}
}

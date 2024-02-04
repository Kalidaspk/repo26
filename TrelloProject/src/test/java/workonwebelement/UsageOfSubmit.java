package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit 
{
public static void main(String[] args)
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
//	identify the submit button on page
	WebElement submitButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	
	submitButton.click();
}
}

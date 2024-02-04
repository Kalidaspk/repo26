package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EvaluateDropDownType 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/signup");
	//identify the month drop-downs
	WebElement monthDropdown = driver.findElement(By.id("month"));
	//create the select class object 
	//select(webElement Drop-down)
	Select monthSelect = new Select(monthDropdown);
	if(monthSelect.isMultiple())
	{
		System.out.println("Boolean true");
		System.out.println("Month Dropdown is Multi-select Dropdown");
		
	}
	else
	{
		System.out.println("Boolean false");
		System.out.println("Month Dropdown is single-selected Dropdown");
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}

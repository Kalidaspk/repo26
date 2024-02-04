package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithCssLocator 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//InvalidSelectorException -Selenium-run-Unchecked
		//when the class Attribute contains space in it's value
		driver.findElement(By.className("fb_content clearfix "));
		driver.manage().window().minimize();
		driver.quit();
		
	}
}

package assignments;
/*WAS a script to Navigate to Google.com & search for
Wipro Jobs and Capture All the URL of the all links present in the 
Search page &print it on the console.*/
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllUrlInGoogle
{
	public static void main(String[] args) {
//		instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
//		maximize the browser
		driver.manage().window().maximize();
//		Enter the get String URL
		driver.get("https://www.google.com/");
//	    inspect the search text and find the locator 
		driver.findElement(By.id("APjFqb")).sendKeys("Wipro jobs"+Keys.ENTER);
	
		  List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		for(WebElement links:alllinks)
		{
			System.out.println(links.getText());
		}
		driver.quit();
				
		
}
}

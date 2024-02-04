package assignments;
/*
WAS a script to navigate to BBC.com and Capture all the latest Business
news  and printout on the console
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBbcNews 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.BBC.com/");
		List<WebElement>  capatureAll=driver.findElements(By.xpath("//div[@class='most-popular']"));
		for(WebElement news:capatureAll)
		{
			System.out.println(news.getText());
		}
		driver.quit();
	}
}

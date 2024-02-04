package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorClassName 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify the tagLine Text its class name as locator
		WebElement tagline = driver.findElement(By.className("_8eso"));
		//Capture the TaglineText 
		String tagLineText = tagline.getText();
		System.out.println("tagLineText");
		driver.manage().window().minimize();
		driver.quit();
	}
		
}

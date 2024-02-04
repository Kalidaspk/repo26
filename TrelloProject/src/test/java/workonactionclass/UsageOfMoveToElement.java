package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfMoveToElement
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait	=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement linkText = driver.findElement(By.linkText("Forgotten password?"));
//		Create a Object for the Action Class
					Actions actions = new Actions(driver);
					actions.pause(2000).moveToElement(linkText).perform();
		}
	}
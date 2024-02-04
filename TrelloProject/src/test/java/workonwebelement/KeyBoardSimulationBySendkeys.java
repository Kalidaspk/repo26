package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulationBySendkeys 
{
public static void main(String[] args) throws InterruptedException 
{
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//	identify the user name
	WebElement emailIdTextField = driver.findElement(By.id("email"));
	Thread.sleep(2000);
	emailIdTextField.sendKeys("kalidaskp56@gmail.com");
	// Tab 2 time +one time enter
		
	emailIdTextField.sendKeys(Keys.TAB,Keys.ENTER);
	emailIdTextField.sendKeys("selenium");
	Thread.sleep(2000);
	emailIdTextField.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	
	emailIdTextField.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
			
}
}

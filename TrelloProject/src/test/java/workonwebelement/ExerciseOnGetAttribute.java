package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOnGetAttribute 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	try {
		driver.get("https://pib.gov.in/");
	}
	catch(WebDriverException e)
	{
		driver.navigate().refresh();
	}
	Thread.sleep(3000);
	//75 years of Independance 
	WebElement Azadi = driver.findElement(By.xpath("//a[@href='https://amritmahotsav.nic.in/']/img"));
	Thread.sleep(3000);
	String AzadiTooltipText = Azadi.getAttribute("title");
	System.out.println("AzadiTooltipText = "+AzadiTooltipText);
	Thread.sleep(3000);
	String AzadiAlternativetext = Azadi.getAttribute("alt");
	System.out.println(AzadiAlternativetext);
	driver.manage().window().minimize();
	driver.quit();
	
}
}



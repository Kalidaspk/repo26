package handlingpopup;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp 
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	//Thread.sleep(3000);
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
	wait.until(ExpectedConditions.alertIsPresent());
	 Alert a = driver.switchTo().alert();
	 	String text=a.getText();
	 	a.accept();
	 	System.out.println(text);
	 	driver.manage().window().minimize();
	 	driver.quit();
}
}

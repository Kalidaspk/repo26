package assignments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitime
{
public static void main(String[] args) throws InterruptedException {
//	Instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
//	maximize the browser
	driver.manage().window().maximize();
//	enter the URL
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(2000);
//	click on the login button
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(3000);
//	click on the help drop-down	 
		 driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
//		click on the About Your actiTime
		 driver.findElement(By.linkText("About your actiTIME")).click();
		 	Thread.sleep(2000);
//		 click to the Read Service Agreement
		 	driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]")).click();
		
		 			Set<String> allwh = driver.getWindowHandles();
		 			int count=allwh.size();
		 			System.out.println(count);
		 			for(String wh:allwh)
		 			{
		 				driver.switchTo().window(wh);
		 			}
		 			 List<WebElement> heading = driver.findElements(By.xpath("//h2"));
		 			 for(WebElement allHeading:heading )
		 			 {
		 				 System.out.println(allHeading.getText());
		 			 }
		 			 driver.manage().window().minimize();
		 			 driver.quit();
//		 	get the title of the element	
		 
}
}

package handlingframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlternativeChar 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);

//		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("d");
	}
}

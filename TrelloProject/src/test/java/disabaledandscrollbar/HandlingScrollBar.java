package disabaledandscrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		   int y = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getX();
		 JavascriptExecutor j=(JavascriptExecutor) driver;
//		 j.executeScript("window.scrollBy(0,"+y+")");
		 j.executeScript("window.scrollBy(0,"+y+")");
		
	}
}

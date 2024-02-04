package workonactionclass;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop 
{
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
		
		
		
		
		
	}
}

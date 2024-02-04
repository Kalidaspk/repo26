package handlingpopup;
/*WAS Number Of Tabs open present in ActiTime after clicking actiTIME Inc. link
and print the window handle of all Tabs*/
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();
	int	count=allwh.size();
	System.out.println(count);
	for(String wh:allwh)
	{
		System.out.println(wh);
	}
		driver.quit();
		
		
		
		}
}

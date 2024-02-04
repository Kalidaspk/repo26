package handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandle1
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pwh = driver.getWindowHandle();
		System.out.println(pwh);
				Set<String> allwh = driver.getWindowHandles();
				int count = allwh.size();
				System.out.println(count);
				for(String wh:allwh)
				{
					driver.switchTo().window(wh);
				}
				driver.quit();
	}
					
}
	

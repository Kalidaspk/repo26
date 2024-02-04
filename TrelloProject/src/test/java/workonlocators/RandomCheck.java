package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheck 
{
public static void main(String[] args) 
{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
//		find the login | register button
//		by id
		driver.findElement(By.id("my-acc-btn")).click();
//		by className
		driver.findElement(By.className("transparent")).click();
		
		
}
}

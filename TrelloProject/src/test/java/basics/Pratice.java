package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {
	public static void main(String[] args) throws Throwable
	{
	/**WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//label[text()='Male']/parent::span[@class='_5k_2 _5dba']/descendant::input")).click();
	
	Thread.sleep(2000);
	driver.manage().window().minimize();
	//driver.close();*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@class='_2puWtW _3a3qyb'][1]  ")).click();
		driver.findElement(By.name(""));
	
	}

}

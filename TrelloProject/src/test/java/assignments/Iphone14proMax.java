package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone14proMax 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14promax"+Keys.ENTER);
		List<WebElement> allName = driver.findElements(By.tagName("a"));
//		int count=allName.size();
//		System.out.println(count);
		List<WebElement> iphonemax = driver.findElements(By.xpath("(//div[@class='_4rR01T'])[1]"));
		for(WebElement phone:iphonemax)
		{
			System.out.println(phone.getText());
		}
	}
}

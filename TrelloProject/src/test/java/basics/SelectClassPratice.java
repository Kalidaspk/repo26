package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassPratice 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
        WebElement iphone = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        iphone.sendKeys("iphone12"+Keys.ENTER);
        List<WebElement> proname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='_3I9_wc _27UcVY']"));
        int count = proname.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
        	String text=proname.get(i).getText();
        	String text1=price.get(i).getText();
        	System.out.println(text+"--->"+text1);
        }
        driver.manage().window().minimize();
        driver.close();
	}
}

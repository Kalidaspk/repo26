package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class AutoSuggestionOfGoggle

{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int count=suggestions.size();
		System.out.println(count);
		for(WebElement sugg:suggestions)
		{
			System.out.println(sugg.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}
}

package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllAutosuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");

		driver.findElement(By.id("APjFqb")).sendKeys("isro");
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.id  ("jZ2SBf"));
		int count = allsugg.size();	
		System.out.println(count);
		for (WebElement e : allsugg) {
			System.out.println(e.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}

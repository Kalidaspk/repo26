package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUsage {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

//driver.get("https://demo.actitime.com/login.do");

		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();

		WebElement usernsme = driver.findElement(By.id("username"));

		usernsme.sendKeys("admin");

		WebElement user = driver.findElement(By.id("username"));

		user.clear();
		Thread.sleep(3000);
		user.sendKeys("kali");

		driver.manage().window().minimize();

		driver.quit();

	}
}

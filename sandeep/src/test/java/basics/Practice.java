package basics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		/**WebDriver driver=new EdgeDriver();
		driver.get("https://www.automationtesting.in/alert.html/");
		driver.findElement(By.xpath("//button[@class='btn-danger']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(expectedcondtion.alertIsprasent());
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		driver.close();**/
		//Hidden Divison pop-up
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www,flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='X']")).click();
		driver.close();*/
		
//		HandlingChildPopUp
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-burron")).click();
		driver.findElement(By.id("Login-facebok-button")).click();
		Set<String> wind = driver.getWindowHandles();
		for(String s:wind)
			driver.switchTo().window(s);
		List<WebElement> text = driver.findElements(By.id(""));
	}

}

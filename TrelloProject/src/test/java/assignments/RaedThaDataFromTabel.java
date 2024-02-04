package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAS to print the data content of the tabel
public class RaedThaDataFromTabel
{
	@Test
	public void Tabel()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/tabel2.html");
		List<WebElement> content = driver.findElements(By.tagName("td"));
		for(WebElement e:content)
			
		{
			System.out.println(e.getText());
		}

		}
}

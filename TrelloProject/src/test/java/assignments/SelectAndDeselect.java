package assignments;
//WAS Select and Deselect in the give
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectAndDeselect
{
	@Test
	public void selectDeselect() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/listBox.html");
		WebElement listBox = driver.findElement(By.id("a"));
		Select s=new Select(listBox);
		List<WebElement> opt = s.getOptions();
		for(WebElement e:opt)
		{
			s.selectByVisibleText(e.getText());
			Thread.sleep(2000);
			for(WebElement a:opt)
			{
				s.deselectByVisibleText(a.getText());
			}
		}
	}
}

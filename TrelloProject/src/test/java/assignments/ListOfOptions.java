package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListOfOptions
{
	@Test
	public void ListBox()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/listBox.html");
		WebElement listBox = driver.findElement(By.id("a"));
		Select s=new Select(listBox);
//		If Asking the Questions like without using the loop means write like that
		WebElement option = s.getWrappedElement();
		System.out.println(option.getText());
		//List<WebElement> opt = s.getOptions();
		//for(WebElement e:opt)
		{
			//System.out.println(e.getText());
		}
		driver.quit();
	}
}

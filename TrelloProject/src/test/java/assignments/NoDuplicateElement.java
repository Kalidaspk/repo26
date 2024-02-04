package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoDuplicateElement 
{
	 public static void main(String[] args) {
		 HashSet<String> hs=new HashSet<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/DayList.html");
		WebElement dayList = driver.findElement(By.id("a"));
		Select s= new Select(dayList);
		List<WebElement> allopt = s.getOptions();
			int count = allopt.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
				{
				String text=allopt.get(i).getText();
				//if(hs.add(text)==false)
				hs.add(text);
				}
				for(String text :hs)
				{
					System.out.println(text);
				}
			driver.quit();
	}
	}
	



package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder 
{
	 public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/DayList.html");
		WebElement dayList = driver.findElement(By.id("a"));
		Select s= new Select(dayList);
		List<WebElement> allopt = s.getOptions();
			int count = allopt.size();
			System.out.println(count);
			for(int i=0;i<allopt.size();i++)
				{
				String text=allopt.get(i).getText();
				al.add(text);
				}
					Collections.sort(al);
					System.out.println(al);
					for(int i=0;i<al.size();i++)
					{
						System.out.println(al.get(i));
					}
			driver.quit();
	}
	
}

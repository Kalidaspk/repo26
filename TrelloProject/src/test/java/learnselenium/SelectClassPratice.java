package learnselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPratice 
{
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	
	WebElement daylist = driver.findElement(By.name("birthday_day"));
	Select d=new Select(daylist);
	/*d.selectByIndex(10);
	Thread.sleep(3000);
	WebElement mlist=driver.findElement(By.name("birthday_month"));
	Select m=new Select(mlist);
	m.selectByValue("08");
	Thread.sleep(3000);
	WebElement ylist = driver.findElement(By.name("birthday_year"));
	Select y=new Select(ylist);
	y.selectByVisibleText("1995");
	Thread.sleep(3000);*/
	List<WebElement> allOption = d.getOptions();
	System.out.println(allOption.size());
	for(WebElement e :allOption)
	{
      String s=e.getText();
         d.selectByVisibleText(s);
	}
	   List<WebElement> sl = d.getAllSelectedOptions();
	   for(WebElement w: sl)
	   {
		   System.out.println(w.getText());
	   }
		
	    System.out.println();
	driver.close();
}
}

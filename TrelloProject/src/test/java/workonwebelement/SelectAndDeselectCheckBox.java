package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/");
//identify the keepLoggedInCheckBox
 WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
//select the checkbox
 keepLoggedInCheckBox.click();
 Thread.sleep(5000);
// un check check box
 keepLoggedInCheckBox.click();
 Thread.sleep(4000);
 driver.manage().window().minimize();
 driver.quit();

}
}

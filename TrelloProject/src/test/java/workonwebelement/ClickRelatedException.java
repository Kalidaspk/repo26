package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRelatedException 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
Thread.sleep(5000);
// identify the men T-shirt under top wear
WebElement menTshirt = driver.findElement(By.xpath("//a[text()='Topwear']/../..//a[text()='T-Shirts']"));
//ElementNotIntractableException
//element is there but it is not visible and hence it is non-Interactable

menTshirt.click();
Thread.sleep(5000);
driver.manage().window().minimize();
driver.quit();


}
}

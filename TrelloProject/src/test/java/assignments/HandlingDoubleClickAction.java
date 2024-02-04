package assignments;
/*WAS the following Scanario's
1) Go to Vtiger
2)mouse Hover to Resources
3)click on Customer in the DropDown menu
4)Double click on login Button
5)Verify the login page is Displayed or not
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClickAction 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers"));
	WebElement logibutton = driver.findElement(By.id("login"));
		Thread.sleep(3000);
		a.doubleClick(logibutton).perform();
		String title="Login - vtiger";
		if(title.equals(driver.getTitle()))
		{
			System.out.println("pass:login page is displayed and its varified");
			System.out.println(driver.getTitle());
		}
		else
		{
			System.out.println("pass: login page is dispalyed and its varified");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	
	
	
	
	}
}

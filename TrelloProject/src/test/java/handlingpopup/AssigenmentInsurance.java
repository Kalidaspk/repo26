package handlingpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigenmentInsurance 
{
	public static void main(String[] args)throws Throwable {
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.id("policynumber")).sendKeys("123");
Thread.sleep(2000);
driver.findElement(By.id("dob")).click();
Thread.sleep(2000);
driver.findElement(By.tagName("select")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//option[@value='7']")).click();

driver.findElement(By.xpath("//option[@value='1995']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("10")).click();
Thread.sleep(4000);
driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
Thread.sleep(2000);
driver.findElement(By.id("CaptchaCode")).sendKeys("aDKOc7");
Thread.sleep(2000);
driver.findElement(By.id("renew_policy_submit")).click();

driver.manage().window().minimize();
driver.quit();


	}
}

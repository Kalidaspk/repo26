package handlingpopup;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTypeAssignment 
{
		public static void main(String[] args)throws Throwable {
			  WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			  driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
			  // identify the policy no. textfield
			  driver.findElement(By.id("policynumber")).sendKeys("123");
			  // identify annd click on dob field
			  driver.findElement(By.id("dob")).click();
			  WebElement month = driver.findElement(By.className("ui-datepicker-month"));
			  Select Monthselect = new Select(month);
			  Monthselect.selectByVisibleText("Aug");
			  WebElement year = driver.findElement(By.className("ui-datepicker-year"));
			  Select dropdownYearSelect = new Select(year);
			  dropdownYearSelect.selectByVisibleText("1995");
			  Thread.sleep(2000);
			  driver.findElement(By.linkText("10")).click();
			  Thread.sleep(2000);
			  // identify the contact number
			  driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
			  // identify lets renew button
			  driver.findElement(By.id("renew_policy_submit")).click();
			  String expectedErrorMessage = "Please enter valid Policy No.";
			  String actualErrorMessage = driver.findElement(By.id("policynumberError")).getText();
			  Thread.sleep(2000);

			  System.out.println(actualErrorMessage);
			  if (actualErrorMessage.equals(expectedErrorMessage)) 
			  {
			   System.out.println("Error message is found correct and it is verified.");
			  } else 
			  {
			   System.out.println("Error message is found Incorrect and it is verified.");
			  }
			  driver.manage().window().minimize();
			  driver.quit();

		
		
		
}
}

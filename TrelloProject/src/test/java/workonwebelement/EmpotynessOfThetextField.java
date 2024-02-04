package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpotynessOfThetextField 
{
public static void main(String[] args)
{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		//attribute is there but it will not carry any value
		
		String valueAttvalue = usernameTextField.getAttribute("value");
		System.out.println("valueAttvalue = " +valueAttvalue);
		if(valueAttvalue.isEmpty())
		{
			System.out.println("boolean true");
			System.out.println("The Attribute Value is Empty String");
		}
		else
			
		{
			System.out.println("boolean false");
			System.out.println("The Attribute Value is Not-Empty String");
		}
		driver.manage().window().minimize();
		driver.quit();
}
}

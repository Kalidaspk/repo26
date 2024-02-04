package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTgaLineText 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement tagLine = driver.findElement(By.className("_8eso"));
				String actualTagLineText = tagLine.getText();
				System.out.println("actualTagLineText = "+actualTagLineText);
				String expectedTagLineText="Facebook helps you connect and share with the people in your life.";
				System.out.println("expectedTagLineText = "+ expectedTagLineText);
				if(actualTagLineText.equals(expectedTagLineText))
				{
					System.out.println("pass: The tagline text is found correct and it is verified.");
				}
				else
				{
					System.out.println("fail: the tagline text is found incorrect and its verifield.");
				}
		driver.manage().window().minimize();
		driver.quit();
		
	}
	
}

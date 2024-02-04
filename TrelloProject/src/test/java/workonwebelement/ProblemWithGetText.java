package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithGetText 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement divTag = driver.findElement(By.className("_8eso"));
				String divTagName = divTag.getText();
				System.out.println("divTagNmae");
				String divTagText = divTag.getText();
				//here <div> has no tag Text 
				System.out.println("<"+divTagName+">"+divTagName+"<"+divTagName+">");
				//=====================================================================
				System.out.println("=================================================================");
				WebElement actualtag = driver.findElement(By.className("_8eso"));
				String actualTagName = actualtag.getTagName();
				System.out.println(actualTagName);
				String actualtagText = actualtag.getText();
				//here the <div> has no tag text
				System.out.println("<"+actualTagName+">"+actualtagText+"<"+actualTagName+">");
				driver.manage().window().minimize();
				driver.quit();
				
	}
}

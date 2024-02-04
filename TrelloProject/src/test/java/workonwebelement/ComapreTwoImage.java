package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComapreTwoImage 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://pib.gov.in/");
		} 
		catch (WebDriverException e)

		{
			driver.navigate().refresh();
		}
		// identify the Azadi Ka Amrith Mahotsav image
		WebElement Azadi = driver.findElement(By.xpath("//a[@href='https://amritmahotsav.nic.in/']/img"));
		// identify the G20 image
		WebElement g20Image = driver.findElement(By.xpath("//a[@href='https://pib.gov.in/newsite/g20india.aspx']/img"));
		// get image source from src
		String AzadiSource = Azadi.getAttribute("src");
		System.out.println("AzadiSource = " + AzadiSource);
		String g20ImageSorce = g20Image.getAttribute("src");
		System.out.println("g20ImageSorce = " + g20ImageSorce);
		if (Azadi.equals(g20ImageSorce)) 
		{
			System.out.println("Since Both the Image source are same and Image will also be same");
		} else 
		{
			System.out.println("Since Both the Image source is diffrent and images are different from each other");

		}
		driver.manage().window().minimize();
		driver.quit();
	}
}

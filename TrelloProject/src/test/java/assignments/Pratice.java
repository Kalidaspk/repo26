package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice 
{
	public static void main(String[] args) throws IOException, InterruptedException {
	/**	//capture the all links
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	 List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='UUbT9']"));
	int count = allLinks.size();
	System.out.println(count);
	for(WebElement e:allLinks)
	{
		System.out.println(e.getText());
	}
	
//	raed the data from proertiesfile
//create the fileinputStream object with the file address as the input
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
//		create the object for the properties file
		Properties pobj=new Properties();
//		load the all the inputStream into pro file object
		pobj.load(fis);
//		call the appropriate method of the properties file
		String value = pobj.getProperty("url");
		System.out.println(value);
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("//input[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.className("//input[@class='Pke_EE']")).sendKeys("iphone 12");
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///c:/user/desktop/naikari.html");
		Thread.sleep(4000);
		File f=new File("./data/naukari.docx");
		String abpath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abpath);**/
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
}
	}
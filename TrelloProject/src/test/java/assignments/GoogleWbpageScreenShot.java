package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWbpageScreenShot 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		step 1)TypeCast the WebDriver Object into takeScreenshot interface
			TakesScreenshot ts = (TakesScreenshot) driver;
//		step 2)Call the getScreenShot() Method target output file as file
			File temporaryaddress = ts.getScreenshotAs(OutputType.FILE);
//		step 3)Store the temporary Screenshot returned by getScreenshotAs()in the file class reference variable 
			String address = temporaryaddress.getAbsolutePath();
			System.out.println(address);
//		step 4)create the destination file, file class object with destination file path by calling the file constructor
			String timespan = LocalDateTime.now().toString().replace(':', '-');
//		step 5)copy the temporary file class object given by getScreenshotAs() into the destination file object by using copy file
			File parmentAddress = new File("./errorshots/" + timespan + "google.png");
			FileUtils.copyFile(temporaryaddress, parmentAddress);
			driver.manage().window().minimize();
			driver.quit();
	}
}

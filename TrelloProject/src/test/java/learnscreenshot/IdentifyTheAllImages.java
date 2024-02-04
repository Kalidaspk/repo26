package learnscreenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyTheAllImages
{
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.Filpkart.com/");
		//identify the all images in webPage
			List<WebElement> allImages = driver.findElements(By.tagName("img"));
			//Iterate one image at a time by taking Screenshot
			for(WebElement ele :allImages){
				File srcFile = ele.getScreenshotAs(OutputType.FILE);
				File destFile=new File("./errorshots/"+LocalDateTime.now().toString().replace(':', '-'));
				FileUtils.copyFile(srcFile,destFile);
			}
	}
}

package handlingpopup;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPopUp {
public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/HP/Desktop/Naukari.html");
	Thread.sleep(5000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	File f = new File("./src/test/resourse/Resume.docx");
	driver.findElement(By.id("cv"));
	driver.manage().window().minimize();
	driver.quit();
}
}

package handlingpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowHandle2
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String pwh = driver.getWindowHandle();
				System.out.println(pwh);
		driver.close();
	}
}

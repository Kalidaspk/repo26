package handlingpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobotcls
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			WebDriver driver=new ChromeDriver();
			Runtime.getRuntime().exec("notepad");
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_Q);
			//r.keyPress(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_P);
			
			
			
	}
}

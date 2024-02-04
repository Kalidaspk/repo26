package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseRadioButton 
{
public static void main(String[] args) throws Throwable
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
Thread.sleep(6000);
// find the radio button
WebElement MaleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type='radio']"));
Thread.sleep(5000);
WebElement FemaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@type='radio']"));
Thread.sleep(5000);
WebElement CustomeRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input[@type='radio']"));
Thread.sleep(7000);
// choose the male radio button
  MaleRadioButton.click();
  Thread.sleep(4000);
//  find the Female Radio Button
  FemaleRadioButton.click();
  Thread.sleep(6000);
//  find the Custom RadioButton
  CustomeRadioButton.click();
  Thread.sleep(7000);
  	driver.manage().window().minimize();
  	driver.quit();
  
  
}
}

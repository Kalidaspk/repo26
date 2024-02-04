package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class MyHooks {
  public  WebDriver driver;

    @BeforeClass
    public void setup(){
       // Properties prop = ConfigReader.initializeProperties();
         driver=new ChromeDriver();
      //  DriverFactory.openBrowser("browser");
      //  driver=DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");


    }
    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
package handlingdropdowns;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckOrderAndSpelling 
{
	public static void main(String[] args)throws Throwable 
	{
		ArrayList<String> actualDayList = new ArrayList<String>();
		ArrayList<String> actualMonthList = new ArrayList<String>();
		ArrayList<String> actualYearList = new ArrayList<String>();
		ArrayList<String> expectedDayList = new ArrayList<String>();
		ArrayList<String> expectedMonthList = new ArrayList<String>();
		ArrayList<String> expectedYearList = new ArrayList<String>();
		
//	Instantiate the browser specific class
				WebDriver driver = new ChromeDriver();
//	maximize the browser
				driver.manage().window().maximize();
// call the imp wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
// Create the WebDriverWait Object
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
// pass the URl OF the application
				driver.get("https://www.facebook.com/signup");
// capture all the drop-downs in the Web-page
				List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
// iterate one drop down at a time
				for (WebElement dropdown : allDropDowns) 
				{
// consider only drop-down which are visible in UI
					if (dropdown.isDisplayed()) 
					{
				// create the Select class object for the drop-down
						Select dropdownSelect = new Select(dropdown);
				// capture all the options of all the drop-down
						List<WebElement> allOptions = dropdownSelect.getOptions();
						for (WebElement option : allOptions) 
						{
							// identify the drop-down under current iteration
							if (dropdown.getAttribute("title").equals("Day")) 
							{
								actualDayList.add(option.getText());
							} 
							else if (dropdown.getAttribute("title").equals("Month")) 
							{
								actualMonthList.add(option.getText());
							} 
							else if (dropdown.getAttribute("title").equals("Year")) 
							{
								actualYearList.add(option.getText());
							}
						}

					}
				}
				// create fileInputStream Object
				FileInputStream fis = new FileInputStream("./src/test/resourse/facebook.xlsx");
				Workbook workbook = WorkbookFactory.create(fis);
				Sheet sheet = workbook.getSheet("dodlist");
				int firstRowIndex = sheet.getFirstRowNum();
				int lastRowIndex = sheet.getLastRowNum();
				for (int i = firstRowIndex; i <= lastRowIndex; i++) 
				{
					int firstCellIndex = (int) sheet.getRow(i).getFirstCellNum();
					int lastIncrimentalIndex = (int) sheet.getRow(i).getLastCellNum();
					for (int j = firstCellIndex + 1; j < lastIncrimentalIndex; j++) 
					{
						if (String.valueOf(sheet.getRow(i).getCell(j).getCellType()).equals("STRING")) 
						{
							expectedMonthList.add(sheet.getRow(i).getCell(j).getStringCellValue());
						} else if (String.valueOf(sheet.getRow(i).getCell(j).getCellType()).equals("NUMERIC")) 
						{
							if (lastIncrimentalIndex == 32) {
								expectedDayList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
							} else if (lastIncrimentalIndex == 120) {
								expectedYearList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
							}
						}
					}
				}
				System.out.println(actualDayList);
				System.out.println(expectedDayList);
				if (actualDayList.equals(expectedDayList)) 
				{
					System.out.println("Pass: The Day Dropwdown list box options order and Spelling is correct and it is verified.");
				} 
				else 
				{
					System.out.println("Fail: The Day Dropwdown list box options order and Spelling is incorrect and it is verified.");
				}
				System.out.println(actualMonthList);
				System.out.println(expectedMonthList);
				if (actualMonthList.equals(expectedMonthList)) 
				{
					System.out.println("Pass: The Month Dropwdown list box options order and Spelling is correct and it is verified.");
				} 
				else 
				{
					System.out.println("Fail: The Month Dropwdown list box options order and Spelling is incorrect and it is verified.");
				}
				System.out.println(actualYearList);
				System.out.println(expectedYearList);
				if (actualYearList.equals(expectedYearList))
				{
					System.out.println("Pass: The Year Dropwdown list box options order and Spelling is correct and it is verified.");
				} 
				else 
				{
					System.out.println("Fail: The Year Dropwdown list box options order and Spelling is incorrect and it is verified.");
				}
				driver.manage().window().minimize();
				driver.quit();
			}
		}
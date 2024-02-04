package handlingdropdowns;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintCellCountInEcahRowColumn 
{
public static void main(String[] args) throws Throwable
{
	ArrayList<String> expectedDayList = new ArrayList<String>();
	ArrayList<String> expectedMonthList = new ArrayList<String>();
	ArrayList<String> expectedYearList = new ArrayList<String>();
	//Instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	FileInputStream fis = new FileInputStream("./src/test/resourse/facebookdata.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("data");
	int column_count = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(column_count);
	int firstRowIndex = sheet.getFirstRowNum();
	int lastRowIndex = sheet.getLastRowNum();
	System.out.println(firstRowIndex);
//	System.out.println(lastRowIndex);
	for(int i=0;i<=column_count;i++)
	{
	for(int j=firstRowIndex;j<=firstRowIndex;j++)
	{
		 Cell c = sheet.getRow(j).getCell(i);
		if(c!=null)
		{
			CellType celltype = sheet.getRow(j).getCell(i).getCellType();
			if (String.valueOf(celltype).equals("STRING"))
			{
				System.out.println(j+" "+""+i);
				System.out.println(sheet.getRow(j).getCell(i).getStringCellValue());
				expectedMonthList.add(sheet.getRow(j).getCell(i).getStringCellValue());
			}
			
			else if (String.valueOf(celltype).equals("NUMERIC")) {
				
				if (i==0) {
					System.out.println(j+ " "+" "+i);
					System.out.println(sheet.getRow(j).getCell(i).getNumericCellValue());
					expectedDayList.add(String.valueOf((long)sheet.getRow(j).getCell(i).getNumericCellValue()));
				}
			else if (i==2) {
				System.out.println(j+ " "+" "+i);
				System.out.println(sheet.getRow(j).getCell(i).getNumericCellValue());
				expectedYearList.add(String.valueOf((long)sheet.getRow(j).getCell(i).getNumericCellValue()));	
				
			}
		}
		}
	}
	}
	workbook.close();	
	
System.out.println(expectedDayList);
	System.out.println(expectedMonthList);
	System.out.println(expectedYearList);
}
}

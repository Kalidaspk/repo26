package datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAndLastRowLimition
{
	public static void main(String[] args) throws Throwable{
		
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis = new FileInputStream("./src/test/resourse/Facebook.xlsx");
			Workbook workBook = WorkbookFactory.create(fis);
			Sheet sheet = workBook.getSheet("dodlist");
			int firstRowIndex = sheet.getFirstRowNum();
			System.out.println(firstRowIndex);
			int lastRowIndex = sheet.getLastRowNum();
			System.out.println(lastRowIndex);
			workBook.close();
			
	
	}
}

package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLastCellLimitationRow 
{
	public static void main(String[] args)throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resourse/Facebook.xlsc");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("dodlist");
		Row dayRow = sheet.getRow(0);
		short firstDayCell = dayRow.getFirstCellNum();
		System.out.println(firstDayCell);
		short lastDayCell = dayRow.getLastCellNum();
		System.out.println(lastDayCell);
		workBook.close();
		
	}
}

package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class TeachMeProperlyCellType 
{
	public static void main(String[] args) throws Throwable{
		FileInputStream fis = new FileInputStream("./src/test/resourse/facebook.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("dodlist");
		CellType returnmeSomething = sheet.getRow(0).getCell(1).getCellType();
		System.out.println(returnmeSomething);
		//returnmeSomething.equals("STRING")
		if (String.valueOf(returnmeSomething).equals("STRING")) {
			System.out.println("boolean True");
			//returnmeSomething.equals("NUMERIC")
		}else if (String.valueOf(returnmeSomething).equals("NUMERIC")) {
			System.out.println("Boolean False");
		} 
		workBook.close();
	}
	}


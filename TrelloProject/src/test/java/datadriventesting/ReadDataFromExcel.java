package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable {
		// create the file inputStream object of java with the absolute path of the
		// address
		FileInputStream fis = new FileInputStream("./src/test/resourse/testdata.xlsx");
		// call the create() method from WrokbookFactory class of POI Library
		Workbook workbook = WorkbookFactory.create(fis);
		// call the getSheet() method by specifying the sheet name
		Sheet sheet = workbook.getSheet("Mydata");
		// call the getRow() method by specifying the row index value
		Row row = sheet.getRow(0);
		// call the getCell() method by specifying the cell index
		Cell cell = row.getCell(1);
		// Based on the type of the data call the appropriate method
		// long numericValue =(long)cell.getNumericCellValue();
		// System.out.println(numericValue);
		String cellValue = cell.getStringCellValue();
		// System.out.println( cellValue);
		workbook.close();

	}
}

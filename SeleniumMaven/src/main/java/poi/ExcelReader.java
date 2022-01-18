package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
public String excelreading(String filename,String sheetname,int rownumber,int Cellnumber) throws IOException {
	FileInputStream fi = new FileInputStream(filename);
	XSSFWorkbook workbook = new XSSFWorkbook(fi);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rownumber);
	Cell cell = row.getCell(Cellnumber);
	String value = cell.getStringCellValue();
	workbook.close();
	return value;
	
}
}

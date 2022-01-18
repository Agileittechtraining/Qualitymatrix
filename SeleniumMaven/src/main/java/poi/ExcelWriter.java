package poi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\Myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet1 = workbook.createSheet("Mysheet 1");
		Row row1 = sheet1.createRow(0);
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue("Hello This is created from POI");
		workbook.write(fo);
		workbook.close();
	}

}

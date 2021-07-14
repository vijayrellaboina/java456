package excelReadDemo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main (String[]args) throws IOException {
		
		FileInputStream fileInput= new FileInputStream("  ");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fileInput);
		XSSFSheet sheet= workbook.getSheet("sheet1");
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		String celldata= cell.getStringCellValue();
		System.out.println("celldata:"+ celldata);
		
	}
}

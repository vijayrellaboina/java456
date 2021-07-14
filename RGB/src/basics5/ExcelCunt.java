package basics5;

 

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelCunt{
		
		static int colCount;
		static int rowCount;

		public static void main(String[] args) throws Exception {
			FileInputStream fInput= new FileInputStream(System.getProperty("user.dir") + "\\testData\\book1.xlsx");
			XSSFWorkbook book= new XSSFWorkbook(fInput);
			XSSFSheet sheet= book.getSheet("Sheet1");
		    rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
			//System.out.println(rowCount);
		    XSSFRow row = sheet.getRow(0);
		    colCount = row.getLastCellNum();
		    System.out.println("Total Number of Columns in the excel is : "+colCount);
		    int rowCount = sheet.getLastRowNum()+1;
		    System.out.println("Total Number of Rows in the excel is : "+rowCount);

//			for (int i = 0; i < rowCount+1; i++) 
//			{
//	        XSSFRow rowData = sheet.getRow(i);
//	        for (int j = 0; j < rowData.getLastCellNum(); j++) {
//	            System.out.print(rowData.getCell(j).getStringCellValue()+"|| ");
//	        }
//	        System.out.println();
//			}
//			
//			printData(sheet, rowCount);	
			printData2(sheet, colCount, "password");	

		}

		public static void printData(XSSFSheet sheet, int colCount) {
			for (int i = 1; i < rowCount+1; i++) 
			{
	        XSSFRow rowData = sheet.getRow(i);
	            System.out.print(rowData.getCell(colCount).getStringCellValue());
	      
	        System.out.println();
	       
			}
			
		}
		public static void printData2(XSSFSheet sheet, int colCount, String colName) {
			for (int i = 0; i < colCount; i++) 
			{
	        XSSFRow rowData = sheet.getRow(0);
	         String ColData = rowData.getCell(i).getStringCellValue();
	      if(ColData.equals(colName))
	      {
	    	  printData(sheet, i);
	    	  
	    	  
	      }
	        System.out.println();
	       
	        
			}
	       
			}
}

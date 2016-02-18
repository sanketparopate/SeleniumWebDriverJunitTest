package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static String path;

	//This method is to set the File path and to open the Excel file
	//Pass Excel Path and SheetName as Arguments to this method
	public static void setExcelFile(String Path,String SheetName) throws Exception {
		path = Path;
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
	}

	//This method is to read the test data from the Excel cell
	//In this we are passing parameters/arguments as Row Num and Col Num
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
	}

	//This method is to get the count of the rows for a particular sheet
	//This Returns the row count with help of last row number
	public int getRowCount(){
		int rowCount = ExcelWSheet.getLastRowNum();
		rowCount = rowCount + 1;
		return rowCount;

	}
	
	//
	public static void writeResultListToExcel(Map<String, String> multiMap){
		        // Using XSSF for xlsx format, for xls use HSSF
		        Sheet resultSheet = ExcelWBook.createSheet("Results");
		        int rowIndex = 0;
		        
		        //adding Header to the file 
		        Row headerRow = resultSheet.createRow(rowIndex++);
		        headerRow.createCell(0).setCellValue("Course Title");
		        headerRow.createCell(1).setCellValue("Result");
		        
		        /*Iterator<Entry<String, String>> it = mapExistCourseTitle.entrySet().iterator();
		        while (it.hasNext()) {
		            Row row = resultSheet.createRow(rowIndex++);
		        	Map.Entry pair = (Map.Entry)it.next();
		        	int cellIndex = 0;
		        	//first place in row is name
		            row.createCell(cellIndex++).setCellValue(pair.getKey().toString());
		 
		            //second place in row is marks in maths
		            row.createCell(cellIndex++).setCellValue(pair.getValue().toString());
		        }*/
		        
		        //write this workbook in excel file.
		        try {
		            FileOutputStream fos = new FileOutputStream(path);
		            ExcelWBook.write(fos);
		            fos.close();
		 
		            System.out.println(path + " is successfully written");
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		 
		 
		    }
	
}
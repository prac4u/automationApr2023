package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\AprBatch\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getLastRowNum());
		
		System.out.println(row.getLastCellNum());
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			Row row1 = sheet.getRow(i);
			for( int j=0; j<row1.getLastCellNum();j++)
			{
				Cell cell1 = row1.getCell(j);
				System.out.println(cell1.getStringCellValue());
			}
			
		}

	}
	
//	static public int getNumberOfRows()
//	{
//		
//	}
//	
//	public static int getNumberOfCols()
//	{
//		
//	}
//	
//	public static List<String> getDataOfRow(int rownum)
//	{
//		
//	}
//	
//	public static Map<Integer, List<String>> getAllDataInMap()
//	{
//		
//	}
//	
//	public static Object[][] getAllDataInArry()
//	{
//	
//		
//	}
	
	

}

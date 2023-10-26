package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtil {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public ExcelReaderUtil(String fileName)
	{
		File file = new File(fileName);
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public int getNumOfRows()
	{
		return sheet.getLastRowNum();
	}
	
	public int getNumOfColumns()
	{
		Row row = sheet.getRow(1);
		return row.getLastCellNum();
	}
	
	public List<String> getDataOfRow(int rownum)
	{
		List<String> list = new ArrayList<>();
		
		Row row1 = sheet.getRow(rownum);
		for( int j=0; j<row1.getLastCellNum();j++)
		{
			Cell cell1 = row1.getCell(j);
			list.add(cell1.getStringCellValue());
		}
		
		return list;
	}

}

package week6Classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	private static int rowcount;
	private static int cellcount;

	public String[][] main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data folder/Createlead.xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		
		String[][] data = new String [rowcount][cellcount];
		
		int rowcount = ws.getLastRowNum();
		System.err.println(rowcount);
		
		int cellcount = ws.getRow(0).getLastCellNum();
		
		
		
		for (int i = 0; i < rowcount; i++) {
			
			for (int k = 0; k < cellcount; k++) {
				
				String cellVaue = ws.getRow(i).getCell(k).getStringCellValue();
				
				data [i-1][k] = cellVaue; 
				
				System.out.println(cellVaue);
				
				
			}
			
		}
		
	  wb.close();
	  return data;
		
		
		
	}

}

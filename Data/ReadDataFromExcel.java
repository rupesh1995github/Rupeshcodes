package Data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/Createlead.xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		
		int rowcount = ws.getLastRowNum();
		
		int cellcount = ws.getRow(0).getLastCellNum();
		
		
		for (int i = 0; i < rowcount; i++) {
			
			for (int k = 0; k < cellcount; k++) {
				
				String cellVaue = ws.getRow(i).getCell(k).getStringCellValue();
				
				System.out.println(cellcount);
				
			}
			
		}
		
	
		
		
		
	}

}

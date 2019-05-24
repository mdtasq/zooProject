
package TestUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import TestBase.TestBase;

public class TestUtil extends TestBase {
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;

	public static Object[][] getData(String sheetName) {
		try {
			fis = new FileInputStream("C:\\A STUFF\\data.xlsx");
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
sheet =workbook.getSheet(sheetName);
Object [][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

for(int i=0;i<sheet.getLastRowNum();i++) {
	for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
		data[i][j]= sheet.getRow(i+1).getCell(j).toString();
	}
	
}
return data;

//		sheet = workbook.getSheet(sheetName);
//
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
//				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
//			}
//		}
//		return data;
	}

	
}

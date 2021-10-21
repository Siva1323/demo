package HYR_TUTORIALS;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class HYR_ApachePOI {
	
	private static final String NUMERIC = null;
	private static final String BOOLEAN = null;
	private static final String STRING = null;
	public void Exceldata() throws Exception {
		  File file = new File ("D:\\Sai.xlsx");
		  FileInputStream fis = new FileInputStream(file);
		  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		  XSSFSheet sheet = workbook.getSheetAt(1);
		  
		  int rowCount = sheet.getPhysicalNumberOfRows();
		  
		  for(int i=0, i<rowcount, i++) {
		  XSSFRow row = sheet.getRow (i);
		  
		  int cellcount = row.getPhysicalNumberOfCells();
		  for (int j=0 ; j< cellcount; j++){
			  XSSFCell cell = row.getCell(j);
			  String cellValue = getCellValue(cell);
			  System.out.print("||"+cellValue);
		  }
		  System.out.println();
		  }
		  
		  workbook.close();
		  fis.close();
	  
		  public static String getCellValue(XSSFCell cell) {
			  switch (cell.getCellType()) {
			  case NUMERIC:
				  return String.valueOf(cell.getNumericCellValue());
			  case BOOLEAN:
				  return String.valueOf(cell.getBooleanCellValue());
			  case STRING:
				  return cell.getStringCellValue();
				 default:
					 return cell.getStringCellValue();
			  }
		  }
	


}

}

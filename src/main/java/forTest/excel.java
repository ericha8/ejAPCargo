package forTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
	public static void main(String[] args) {
		getRowCount();
	}
	
	public static void getRowCount() {
		try {
			
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Eclipse\\Selenium_Final_Activity\\excel");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows : " + rowCount);
		
		}catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}

}

package tests;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetData {
    @Test
	//@DataProvider(name="createLeadDataExcel")
	public Object[][] getCreateLeadDataExcel(String fileName) throws IOException
	{ 
		//Navigating to Excel File(Must be xlsx format for XSSFWorkbook for xls we can take HSSFWorkbook)
		//XSSFWorkbook wBook=new XSSFWorkbook("./TestData/CreateLeadData.xlsx"); 
		XSSFWorkbook wBook=new XSSFWorkbook("./TestData/"+fileName+".xlsx"); 
		
		
		//Navigating to sheet
		XSSFSheet sheet=wBook.getSheet("Sheet1");
		//get Row count and Column count and printing them
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row Count: "+ rowCount);
		System.out.println("Column Count: "+ colCount);
				
		Object[][] data=new Object[rowCount][colCount];
		
		for(int i=1; i<=rowCount; i++)    //0th row will contain the column names
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<colCount; j++)
			{
				XSSFCell cell=row.getCell(j); //TO reach the cell
				data[i-1][j]=cell.getStringCellValue();  //TO get the cell value
				System.out.println(data);
			}
		}
		wBook.close();
		return data;
	}
	
	@DataProvider(name="createLeadData")
	public static String[][] getCreateLeadData()
	{
		
		String data[][]=new String[2][3];
		data[0][0]="Cognizant";
		data[0][1]="Jyotirmayee";
		data[0][2]="Sahoo";
		data[1][0]="Cognizant";
		data[1][1]="Jyoti";
		data[1][2]="Bhuyan";
		return data;
		
	}
	
	@DataProvider(name="EditLeadData")
	public static Object[][] getEditLeadData()
	{
		
		Object data[][]=new Object[2][4];
		data[0][0]="Cognizant";
		data[0][1]="JM";
		data[0][2]="S";
		data[0][3]=2;
		data[1][0]="Cognizant";
		data[1][1]="JP";
		data[1][2]="B";
		data[1][3]=3;
		return data;
	
	}
}

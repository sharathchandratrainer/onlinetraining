package datadrivenExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelops 
{
	@Test
	public void excel() throws IOException
	{
		FileInputStream fi=new FileInputStream("F:\\onlineTraining\\Selenium\\src\\com\\orgHrm\\Testdata\\Empregdata.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
//		XSSFRow R=ws.getRow(3);
//		XSSFCell C=R.getCell(0);
//		
//		System.out.println(C.getStringCellValue());
		
		
		int Rc=ws.getLastRowNum();
		
		System.out.println(Rc);
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow R=ws.getRow(i);
			System.out.println(R.getLastCellNum());
			XSSFCell C=R.getCell(0);
			XSSFCell C1=R.getCell(1);
//			System.out.println(C.getStringCellValue());
//			System.out.println(C1.getStringCellValue());
			String f=C.getStringCellValue();
			String l=C1.getStringCellValue();
			
			System.out.println(f+"----"+l);
			
			R.createCell(2).setCellValue("Pass");
			
		}
		FileOutputStream fo=new FileOutputStream("F:\\onlineTraining\\Selenium\\src\\com\\orgHrm\\results\\empregout1.xlsx");
		wb.write(fo);
		wb.close();
	}

}

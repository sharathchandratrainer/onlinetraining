package datadrivenExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import functions.orgMaster;

public class datadriven 
{
	

	@Test
	public void excel() throws IOException
	{
		orgMaster om=new orgMaster();
		FileInputStream fi=new FileInputStream("F:\\onlineTraining\\Selenium\\src\\com\\orgHrm\\Testdata\\Empregdata.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int Rc=ws.getLastRowNum();
		
		System.out.println(Rc);
		om.org_Launch("http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		for (int i = 0; i <= Rc; i++) 
		{
			XSSFRow R=ws.getRow(i);
			System.out.println(R.getLastCellNum());
			XSSFCell C=R.getCell(0);
			XSSFCell C1=R.getCell(1);
			String f=C.getStringCellValue();
			String l=C1.getStringCellValue();
			
			System.out.println(f+"----"+l);
			
			String res=om.org_Empreg(f, l);
			XSSFCell c2=R.createCell(2);
			c2.setCellValue(res);
//			R.createCell(2).setCellValue(res);
			
		}
		FileOutputStream fo=new FileOutputStream("F:\\onlineTraining\\Selenium\\src\\com\\orgHrm\\results\\orgempregout.xlsx");
		wb.write(fo);
		wb.close();
		om.org_Logout();
		om.org_Close();
	}

}

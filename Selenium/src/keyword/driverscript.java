package keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import functions.orgMaster;

public class driverscript 
{

	@Test
	public void driver() throws IOException
	{
		orgMaster om=new orgMaster();
		String res=null;
		String xlpath="F:\\onlineTraining\\Selenium\\src\\com\\orgHrm\\Testdata\\Keyword.xlsx";
		String xlpath1="F:\\onlineTraining\\Selenium\\src\\com\\orgHrm\\results\\keyout.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		int tcrc=ws.getLastRowNum();
		int tsrc=ws1.getLastRowNum();
		
		System.out.println(tcrc+"---"+tsrc);
		
		for (int i = 1; i <= tcrc; i++)
		{
			String exec=ws.getRow(i).getCell(2).getStringCellValue();
			if (exec.equalsIgnoreCase("Y")) 
			{
				String tcid=ws.getRow(i).getCell(0).getStringCellValue();
				for (int j = 1; j <= tsrc; j++)
				{
					String tstcid=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcid.equalsIgnoreCase(tstcid)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key)
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrm.com");
							break;
							
						case "login":
							res=om.org_Login("Admin", "admin");
							
							break;
							
						case "logout":
							res=om.org_Logout();
							om.org_Close();
							break;
							
						case "Empreg":	
							
							res=om.org_Empreg("Sharath", "G");
							break;
							
						case "Usereg":	
							res=om.org_Userreg("Sharath G", "SharathchandraG", "SharathchandraG", "SharathchandraG");
							break;
							
						case "Ulogin":
							res=om.org_Login("SharathchandraG", "SharathchandraG");
							break;
						default:
							System.out.println("Select a proper option");
							break;
						}
						//test steps result updation
						ws1.getRow(j).createCell(4).setCellValue(res);
						//test case sheet result updation
						
						if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).createCell(3).setCellValue(res);
						}
						else
						{
							ws.getRow(i).createCell(3).setCellValue("FAIL");
						}
						
					}
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlpath1);
		wb.write(fo);
		wb.close();
		
	}
	
	
}

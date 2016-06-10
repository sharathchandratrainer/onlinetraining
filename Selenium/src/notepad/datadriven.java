package notepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
import functions.orgMaster;
import testng.orgmaster;

public class datadriven 
{
	@Test
	public void datadriven() throws IOException
	{
		
		orgMaster om=new orgMaster();
		
		om.org_Launch("http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		
		FileWriter fw=new FileWriter("E:\\Result.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		FileReader fr=new FileReader("E:\\Testdata.txt");
		BufferedReader br=new BufferedReader(fr);
		String x="";
		while ((x=br.readLine())!=null)
		{
			String[] xsplit=x.split("#");
			String f=xsplit[0];
			String l=xsplit[1];
			String res=om.org_Empreg(f, l);
			
			bw.write(x+"#"+res);
			bw.newLine();
		}
		br.close();
		bw.close();
		om.org_Logout();
		om.org_Close();
	}

}

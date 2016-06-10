package notepad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class dataread
{
	@Test
	public void note() throws IOException
	{
		FileReader fr=new FileReader("E:\\Testdata.txt");
		
		BufferedReader br=new BufferedReader(fr);
		String x="";
		while ((x=br.readLine())!=null)
		{
			System.out.println(x);
			
		}
		br.close();
	}

}

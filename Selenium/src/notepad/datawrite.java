package notepad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class datawrite {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("E:\\online.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi, I am learning notepad operations.");
		bw.newLine();
		bw.write("Hi Murali");
		bw.newLine();
		bw.write("Hi Priyanka");

		bw.close();
	}

}

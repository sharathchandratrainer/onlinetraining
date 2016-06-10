
public class DArrays {

	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][2];
		
		//to write the data int array
		
		s[0][0]="Selenium";
		
		s[1][1]=30000;
		
		//reading values into array
		//to find the length of the rows
		System.out.println(s.length);
		//to find the length of the columns 
		System.out.println(s[0].length);
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
				
			}
			
			
		}
		

	}

}

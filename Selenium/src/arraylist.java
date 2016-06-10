import java.util.ArrayList;


public class arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<Object>  s=new ArrayList<Object>();
		
		//writing the data into array list 
		
		s.add("Selenium");
		s.add('M');
		s.add(0, 20000);
		s.add(true);
		s.add(23455.544);
		
		
		//to find the length of the arraylist
		
		System.out.println(s.size());
		
		
		//reading the data from arraylist
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
			
			
		}
		
		

	}

}

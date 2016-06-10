import java.util.Scanner;


public class nestedif {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter c value");
		int c=sc.nextInt();
		
		if (a>b & a>c )
		{
			System.out.println("A is bigger");
			
		}
		else if (b>a & b>c) 
		{
			System.out.println("B is bigger");
			
		}
		else
		{
			System.out.println("C is bigger");
		}
		
		

	}

}

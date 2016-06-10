
public class reverse {

	public static void main(String[] args) 
	{
		String course="Qedge";
		String reverse="";
		int len=course.length();
		System.out.println(len);
		
		for (int i = len-1; i >= 0; i--) 
		{

			System.out.println(course.charAt(i));
			reverse=reverse+course.charAt(i);
		}
		System.out.println(reverse);

	}

}

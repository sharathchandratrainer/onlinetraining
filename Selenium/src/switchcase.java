
public class switchcase {

	public static void main(String[] args) 
	{
		String course="Qtp";
		
		switch (course) 
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "Qtp":
			System.out.println("You are slected Qtp");
			break;
		case "Manual":
			System.out.println("You are selected manual");
			break;

		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}

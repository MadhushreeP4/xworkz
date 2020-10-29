public class Place{
	
	public static String finder(int fromDistance)
	{
		System.out.println("Invoked finder");
	
		System.out.println("distance "+fromDistance);
		
		if(fromDistance==200)
		{
			System.out.println("Distance from gadag to ");
			return "Goa";
		}
		if(fromDistance==425)
		{
			System.out.println("Distance from gadag to ");
			return "Mysore";
		}
		if(fromDistance==640)
		{
			System.out.println("Distance from gadag to ");
			return "Kerala";
		}
		if(fromDistance==1930)
		{
			System.out.println("Distance from gadag to ");
			return "Delhi";
		}
		if(fromDistance>=100000)
		{
			System.out.println("Place :");
			return "place Not in earth";
		}
		return "place not found";
	}
}
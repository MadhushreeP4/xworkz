public class Country{
	
	public static void main(String[] ct)
	{
		System.out.println("main Invoked by JVM");
		
		countryName("India");
		countryName(null);
		
		String country="Russia";
		countryName(country);
		
		System.out.println("main method exit");
	}
	
	public static void countryName(String name)
	
	{
		System.out.println("Invoked countryName: "+name);
	}
	
}
public class CountryL
{
	public static void printingCountryNames(String[] names)
	{
		System.out.println("Invoked printingCountryNames");
		
		for(int mark=0;mark<names.length;mark++)
		{
			System.out.println("index value: "+mark);
			String Country=names[mark];
			System.out.println("country names: "+Country);
		}
	}
}
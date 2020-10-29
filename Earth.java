public class Earth{
	
	public static void rotate(int continents)
	{
		System.out.println("Invoked rotate");
		System.out.println("total continents: "+continents);
	}
	
	public static void rotate(int countries,String galaxy)
	{
		
		System.out.println("Invoked rotate with 2 parameters");
		System.out.println("int and String");
		System.out.println("total Countries : "+countries);
		System.out.println("Name of Galaxy: "+galaxy);
	}
	
	public static void rotate(char fLetterOfCountry,char lLetterOfCountry)
	{
		System.out.println("Invoked rotate with 2 parameters");
		System.out.println("char and char");
		System.out.println("First Letter of Our Country: "+fLetterOfCountry);
		System.out.println("Last Letter of our Country: "+lLetterOfCountry);
	}
	
	public static void rotate(String rotation,int star)
	{
		System.out.println("Invoked rotate with 2 parameters");
		System.out.println("String and int");
		System.out.println("Rotation of Earth : "+rotation);
		System.out.println("total stars in our galaxy: "+star);
	}
}
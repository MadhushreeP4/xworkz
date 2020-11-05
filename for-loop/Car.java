public class Car
{
	public static String[] carBrands()
	{
		System.out.println("Invoked carBrands");
		
		String[] brandsName={"Renault","Audi","BMW","Ferrari","Jaguar","Lamborghini","Mercedes","Roll Royce","Toyota","Maruti"};
		
		System.out.println("Array Size: "+brandsName.length);
	
		return brandsName;
	}
}
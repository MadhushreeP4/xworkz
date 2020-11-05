public class CarBrands
{
	public static void main(String[] types)
	{
		System.out.println("JVM Invoked main");
		String[] names=Car.carBrands();
		for(int time=0;time<names.length;time++)
		
		{
			System.out.println("Count: "+time);
			System.out.println("Car brand: "+names[time]);
		}
		
		System.out.println("EXIT :: main");
	}
}
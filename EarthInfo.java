public class EarthInfo
{
	public static void main(String[] values)
	{
		System.out.println("main Invoked by JVM");
		System.out.println("main method args length: "+values.length);
		
		Earth.rotate(7);
		
		Earth.rotate(195,"Milky way");
		
		Earth.rotate('I','A');
		
		Earth.rotate("West to East",1);
		
		System.out.println("EXIT :: main");
	}
}
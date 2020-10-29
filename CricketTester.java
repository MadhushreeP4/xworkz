public class CricketTester
{
	public static void main(String[] values)
	{
		System.out.println("main Invoked by JVM");
		System.out.println("main method args length: "+values.length);
		
		Cricket.ipl(20);
		
		Cricket.ipl(8,56);
		
		Cricket.ipl(1.3f,163.009758);
		
		Cricket.ipl(163.009758,1.3f);
		
		System.out.println("EXIT :: main");
	}
}
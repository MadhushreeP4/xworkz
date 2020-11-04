public class LoopTester{
	
	public static void main(String[] display)
	{
		System.out.println("JVM invoked main");
		
		boolean termination=true;
		
		for(byte start=0;termination;start++)
		{
			System.out.println("For Loop");
			System.out.println("value of start: "+start);
			if(start==4)
			{
				termination=false;
			}
		}
		
		System.out.println("EXIT :: main");
		
	}
}
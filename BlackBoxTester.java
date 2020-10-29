public class BlackBoxTester
{
	public static void main(String[] values)
	{
		System.out.println("main Invoked by JVM");
		System.out.println("main method args length: "+values.length);
		
		String dmsg="yet to find";
		String fmsg="Starting Engine";
		String kmsg="There is a Fog";
		
		boolean voice=true;
		boolean error=false;
		
		BlackBox.record(dmsg);
		
		BlackBox.record(voice,error);
		
		BlackBox.record(fmsg,2);
		
		BlackBox.record(44,kmsg);
		
		System.out.println("EXIT :: main");
	}
}
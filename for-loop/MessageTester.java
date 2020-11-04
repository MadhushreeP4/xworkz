public class MessageTester
{
	public static void main(String[] msgs)
	{
		System.out.println("JVM invoked main");
		
		Vtu.printMessage();
		
		System.out.println("********************************************************");
		
		String valurAtIndex0=msgs[0];
		int number=Integer.parseInt(valurAtIndex0);
		Vtu.printMessage(number);
		
		System.out.println("********************************************************");
		
		Vtu.groupMessagesAndLoop();
		
		System.out.println("EXIT :: main");
	}
}
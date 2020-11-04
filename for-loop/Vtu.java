public class Vtu
{
	public static void printMessage()
	{
		for(byte msg=0;msg<=4;msg++)
		{
			System.out.println("Shaping the Future");
		}
	}
	
	public static void printMessage(int loopSize)
	{
		for(int msg=0;msg<=loopSize;msg++)
		{
			System.out.println("Shaping the Future "+msg);
		}
	}
	
	public static void groupMessagesAndLoop()
	{
		System.out.println("Invoked groupMessagesAndLoop");
		
		String[] messages={"Good Morning","Updates are available","memory is full","Shut down the System","Battery is full"};
		
		System.out.println("message length: "+messages.length);
		
		for(int count=0;count<messages.length;count++)
		{
			System.out.println("count:"+count);
			String message=messages[count];
			System.out.println("messages: "+message);
		}
	}
}
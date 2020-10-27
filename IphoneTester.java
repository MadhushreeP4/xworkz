public class IphoneTester{
	
	public static void main(String[] test)
	{
		
		System.out.println("main is Invoked by JVM");
		
		boolean connect=Iphone.call();
		System.out.println("call connection: "+connect);
		
		String text=Iphone.message();
		System.out.println("Message: "+text);
		
		System.out.println("EXIT:: main");
		
	}
	
}
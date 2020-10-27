public class Iphone{
	
	public static boolean call()
	{
		System.out.println("Invoked call");
		boolean connected=true;
		return connected;
	}
	
	public static String message()
	{
		System.out.println("Invoked message");
		String msg="Morning";
		return msg;
	}
	
	public static byte charge(double volts)
	{
		System.out.println("Invoked charge");
		if(volts>3)
		{
			System.out.println("volt is greater than 3, the volt is: "+volts);
			return 100;
		}
		if(volts<3 && volts>0)
		{
			System.out.println("volt is lesser than 3, the volt is: "+volts);
			return 0;
		}
		return -1;
	}
}
public class PredefinedTester
{
	public static void main(String[] values)
	{
		System.out.println("JVM Invoked main");
		
		byte v1=Predefined.baseByte;
		System.out.println("Default value of byte = "+v1);
		
		short v2=Predefined.baseShort;
		System.out.println("Default value of short = "+v2);
		
		int v3=Predefined.baseInt;
		System.out.println("Default value of int = "+v3);
		
		long v4=Predefined.baseLong;
		System.out.println("Default value of long = "+v4);
		
		float v5=Predefined.baseFloat;
		System.out.println("Default value of float = "+v5);
		
		double v6=Predefined.baseDouble;
		System.out.println("Default value of double = "+v6);
		
		boolean v7=Predefined.baseBoolean;
		System.out.println("Default value of boolean = "+v7);
		
		char v8=Predefined.baseChar;
		System.out.println("Default value of char = "+v8);
		
		String v9=Predefined.baseString;
		System.out.println("Default value of String = "+v9);
		
		String[] v10=Predefined.baseArray;
		System.out.println("Default value of array = "+v10);
		
		System.out.println("EXIT :: main");
		
	}
}
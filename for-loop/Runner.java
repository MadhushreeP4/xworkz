public class Runner
{
	public static void main(String[] names)
	{
		System.out.println("JVM invoked main");
		
		System.out.println("Program to print all the arguments of the main");
		System.out.println("by making use of For loop,which is dynamic");
		
		for(int loop=0;loop<names.length;loop++)
		{
			System.out.println("Loop Number: "+loop);
			String mainMethodArg=names[loop];
			System.out.println("Main method Arg: "+mainMethodArg);
		}
		
		System.out.println("EXIT :: main");
	}
}
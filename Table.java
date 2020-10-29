public class Table{
	
	public static void holding(String thing)
	{
		System.out.println("Invoked holding");
		System.out.println("arg thing: "+thing);
	}
	
	public static void holding(String something,String noOfPlates)
	{
		System.out.println("Invoked holding with 2 parameters");
		System.out.println("string and String");
		System.out.println("arg1 something: "+something);
		System.out.println("arg2 noOfPlates: "+noOfPlates);
	}
	
	public static void holding(String something,int noOfPlates)
	{
		System.out.println("Invoked holding with 2 parameters");
		System.out.println("string and Int");
		System.out.println("arg1 something: "+something);
		System.out.println("arg2 noOfPlates: "+noOfPlates);
	}
	
	public static void holding(int noOfPlates,String something)
	{
		System.out.println("Invoked holding with 2 parameters");
		System.out.println("Int and String");
		System.out.println("arg1 noOfPlates: "+noOfPlates);
		System.out.println("arg2 something: "+something);
	}
}
public class BlackBox{
	
	public static void record(String cause)
	{
		System.out.println("Invoked record");
		System.out.println("reason: "+cause);
	}
	
	public static void record(boolean crewvoice,boolean piloterror)
	{
		System.out.println("Invoked record with 2 parameters");
		System.out.println("String and String");
		System.out.println("crew voice recorded: "+crewvoice);
		System.out.println("pilot error: "+piloterror);
	}
	
	public static void record(String firstMsg,int types)
	{
		System.out.println("Invoked record with 2 parameters");
		System.out.println("String and int");
		System.out.println("First msg: "+firstMsg);
		System.out.println("black box types: "+types);
	}
	
	public static void record(int data,String lastMsg)
	{
		System.out.println("Invoked record with 2 parameters");
		System.out.println("int and String");
		System.out.println("Number of people: "+data);
		System.out.println("Last Message: "+lastMsg);
	}
}
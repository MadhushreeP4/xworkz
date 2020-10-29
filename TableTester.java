public class TableTester
{
	public static void main(String[] values)
	{
		System.out.println("main Invoked by JVM");
		System.out.println("main method args length: "+values.length);
		
		String book="Comic";
		
		Table.holding(book);
		
		Table.holding(book,"box");
		
		Table.holding(book,44);
		
		Table.holding(44,book);
		
		System.out.println("EXIT :: main");
	}
}
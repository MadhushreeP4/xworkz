public class ResultConsole{
	
	public static void main(String[] value)
	{
		System.out.println("main Invoked by JVM");
		
		String ResultInString=value[0];
		double Re=Double.parseDouble(ResultInString);
		
		String R1=Result.resultDefinition(Re);
		System.out.println("Grade: "+R1);
		
		System.out.println("EXIT :: main");
	}
}
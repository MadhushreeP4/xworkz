public class ResultUpdate{
	public static void main(String[] update)
	{
		System.out.println("main Invoked by JVM");
		{
			String percentage=Result.resultDefinition(80.83);
			System.out.println("Grade: "+percentage);
		}
	}
}
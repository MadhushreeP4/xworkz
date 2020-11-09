public class MainTester
{
	public static void main(String[] team)
	{
		System.out.println("JVM Invoked main");
		
		String t1=team[0];
		Mainargument converted=Mainargument.valueOf(t1);
		
		System.out.println("Team name: "+converted);
		
		System.out.println("EXIT :: main");
	}
	public static void teamName(Mainargument name)
	{
		System.out.println("Team: "+name);
	}
}
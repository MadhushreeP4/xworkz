public class Cricket{
	
	public static void ipl(int over)
	{
		System.out.println("Invoked ipl");
		System.out.println("total overs: "+over);
	}
	
	public static void ipl(int teams,int matches)
	{
		System.out.println("Invoked ipl with 2 parameters");
		System.out.println("int and int");
		System.out.println("Number of teams : "+teams);
		System.out.println("Number of Matches: "+matches);
	}
	
	public static void ipl(float bat,double ball)
	{
		System.out.println("Invoked ipl with 2 parameters");
		System.out.println("float and double");
		System.out.println("avg weight of Bat in Kgs: "+bat);
		System.out.println("avg weightof ball in gms: "+ball);
	}
	
	public static void ipl(double ball,float bat)
	{
		System.out.println("Invoked ipl with 2 parameters");
		System.out.println("double and float");
		System.out.println("avg weight of ball in gms: "+ball);
		System.out.println("avg weight of bat in Kgs: "+bat);
	}
}
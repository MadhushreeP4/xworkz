public class Result{
	public static String resultDefinition(double result)
	{
		System.out.println("Invoking resultDefinition ");
		
		if(result>80 && result<=100)
		{
			System.out.println("Result is: "+result);
			return "Distinction";
		}
		
		if(result>67 && result<=80)
		{
			System.out.println("Result is: "+result);
			return "first class";
		}
		
		if(result>52 && result<=65)
		{
			System.out.println("Result is: "+result);
			return "Second class";
		}
		
		if(result>36 && result<=150)
		{
			System.out.println("Result is: "+result);
			return "Third class";
		}
		
		if(result<35)
		{
			System.out.println("Result is: "+result);
			return "Fail";
		}
		return "Nothing";
	}
}
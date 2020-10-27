public class HumanAge{
	
	public static String ageDefinition(int age)
	{
		System.out.println("Invoked ageDefinition");
		
		if(age>0 && age<5)
		{
			System.out.println("age is: "+age);
			return "child";
		}
		
		if(age>4 && age<13)
		{
			System.out.println("age is: "+age);
			return "kid";
		}
		
		if(age>12 && age<20)
		{
			System.out.println("age is: "+age);
			return "teen";
		}
		
		if(age>19 && age<45)
		{
			System.out.println("age is: "+age);
			return "adult";
		}
		
		if(age>44 && age<115)
		{
			System.out.println("age is: "+age);
			return "old";
		}
		
		return "dead";
	}
}
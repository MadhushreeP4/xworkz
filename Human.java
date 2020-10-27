public class Human{
	public static void main(String[] decide)
	{
		System.out.println("main is Invoked by JVM");
		
		String person=HumanAge.ageDefinition(2);
		System.out.println("Human is "+person);
		
		String person2=HumanAge.ageDefinition(8);
		System.out.println("Human is "+person2);
		
		String person3=HumanAge.ageDefinition(16);
		System.out.println("Human is "+person3);
		
		String person4=HumanAge.ageDefinition(24);
		System.out.println("Human is "+person4);
		
		String person5=HumanAge.ageDefinition(70);
		System.out.println("Human is "+person5);
		
		String person6=HumanAge.ageDefinition(122);
		System.out.println("Human is "+person6);
		
		System.out.println("Exit:: main");
	}
}
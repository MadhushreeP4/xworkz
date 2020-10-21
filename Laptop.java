public class Laptop{
	public static void main(String[] be)
	{
		System.out.println("Invoked by JVM");
		
		arrayOfBooleanTypes();
		
		System.out.println("End of main method by JVM");
	}
	
	public static void arrayOfBooleanTypes()
	{
		System.out.println("Invoking method arrayOfBooleanTypes");
		
		boolean fastestThingInWorldIsLaser=true;
		boolean earthHasOneMoon=true;
		boolean atomsArenotNeutralInNature=false;
		boolean jupiterCirclesTheSun=false;
		
		boolean statements[]={fastestThingInWorldIsLaser,earthHasOneMoon,atomsArenotNeutralInNature,jupiterCirclesTheSun};
		
		int numberOfStatements=statements.length;
		System.out.println("Number of Statements: "+numberOfStatements);
		
		boolean elementAtIndex0=statements[0];
		System.out.println("Element at Index0: "+elementAtIndex0);
		
		boolean elementAtIndex1=statements[1];
		System.out.println("Element at Index1: "+elementAtIndex1);
	}
}

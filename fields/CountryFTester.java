public class CountryFTester
{
	public static void main(String[] words)
	{
		System.out.println("JVM Invoked main");
		
		String name=CountryF.country;
		System.out.println("country name: "+name);
		
		int pr=CountryF.populationRank;
		System.out.println("Population Rank: "+pr);
		
		String alterN=CountryF.alternativeName;
		System.out.println("alternative name: "+alterN);
		
		boolean statement=CountryF.indiaIs7thLargest;
		System.out.println("India is 7th Largest : "+statement);
		
		float value=CountryF.populationInBillions;
		System.out.println("Population in Billions: "+value);
		
		System.out.println("*****************UPDATED*****************");
		
		CountryF.country="France";
		System.out.println("Updated country name: "+CountryF.country);
		
		CountryF.populationRank=22;
		System.out.println("Updated population Rank: "+CountryF.populationRank);
		
		CountryF.alternativeName="the French Republic";
		System.out.println("Updated alternative name: "+CountryF.alternativeName);
		
		CountryF.indiaIs7thLargest=false;
		System.out.println("France is 7th Largest : "+CountryF.indiaIs7thLargest);
		
		CountryF.populationInBillions=0.067f;
		System.out.println("Population in Billions: "+CountryF.populationInBillions);
		
		System.out.println("EXIT :: main");
	}
}
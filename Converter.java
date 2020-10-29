public class Converter{
	
	public static void main(String[] values)
	{
		System.out.println("main Invoked by JVM");
		
		System.out.println("Converting String to other Primitives");
		
		String doorNo="88";
		byte convertedDoorNo=Byte.parseByte(doorNo);
		System.out.println("String to byte: "+convertedDoorNo);
		
		String price="800";
		short convertedPrice=Short.parseShort(price);
		System.out.println("String to short: "+convertedPrice);
		
		String salary="60000";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("String to Integer: "+convertedSalary);
		
		String population="1300000000";
		long convertedPopulation=Long.parseLong(population);
		System.out.println("String to Integer: "+convertedPopulation);
		
		String percentage="80.83";
		float convertedPercentage=Float.parseFloat(percentage);
		System.out.println("String to Float: "+convertedPercentage);
		
		String cgpa="7.25";
		double convertedCgpa=Double.parseDouble(cgpa);
		System.out.println("String to Double: "+convertedCgpa);
		
		System.out.println("EXIT :: main");
	}
}
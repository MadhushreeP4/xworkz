public class AddressTester
{
	public static void main(String[] value)
	{
		System.out.println("JVM Invoked main");
		
		short door=Address.doorNo;
		System.out.println("Door Number: "+door);
		
		String st=Address.street;
		System.out.println("Street: "+st);
		
		String ct=Address.city;
		System.out.println("City: "+ct);
		
		int pc=Address.pinCode;
		System.out.println("Pin code: "+pc);
		
		System.out.println("EXIT :: main");
	}
	
}
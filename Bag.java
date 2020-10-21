public class Bag{
	public static void main(String[] em)
	{
		System.out.println("Invoked by JVM");
		
		arrayOfEmails();
		
		System.out.println("End of main method by JVM");
	}
	
	public static void arrayOfEmails()
	{
		System.out.println("Invoking arrayOfEmails");
		
		String contactEmail="contact.xworkz@gmail.com";
		String subscribingEmail="subscribe.xworkz@gmail.com";
		String hrEmail="vinay.xworkz@gmail";
		
		String[] emails={contactEmail,subscribingEmail,hrEmail,"akshara.xworkz@gmail"};
		
		int sizeOfArray=emails.length;
		System.out.println("Number of Arrays: "+emails.length);
		
		String elementAtIndex0=emails[0];
		System.out.println("element at index 0: "+elementAtIndex0);
		
	}
}
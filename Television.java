public class Television{
	
	public static void main(String[] channels)
	{
		
		System.out.println("main method is Invoked by JVM");
		
		int size=channels.length;
		System.out.println("Number of Channels :"+size);
		
		Remote.change(channels[1]);
		// passed Ndtv History NG FYI in console
		
		System.out.println("Exit main method");
	}
}
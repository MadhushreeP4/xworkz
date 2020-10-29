public class PlaceFinder{
	
	public static void main(String[] km)
	{
		System.out.println("main Invoked by JVM");
	
		String distInString=km[0];
		
	    int distInInt=Integer.parseInt(distInString) ;
		String Distance=Place.finder(distInInt);
		
		System.out.println(Distance);
		
		System.out.println("Exit:: main");

	}
}
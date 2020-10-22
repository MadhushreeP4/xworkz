public class Excm{
	
	public static void main(String[] cm)
	{
		System.out.println("main is Invoked by JVM");
		
		String[] ministersArray=
		{
			"BSY",
			"HDK",
			"Siddaramaiah",
			"SM Krishna"
		};
		chiefMinisters(ministersArray);
		
		chiefMinisters(null);
		
		System.out.println("exit main");
	}
	
	public static void chiefMinisters(String[] names)
	{
		
		System.out.println("chiefMinisters: "+names);
		
		int size=names.length;
		System.out.println(size);
		
		System.out.println("Chief Minister at index0 :"+names[0]+" "+names[1]+" "+names[2]+" "+names[3]);
		System.out.println("Chief Minister at index1 :"+names[0]);
		System.out.println("Chief Minister at index2 :"+names[1]);
		
	}
	
}
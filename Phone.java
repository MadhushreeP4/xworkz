public class Phone{
	public static void main(String[] ap)
	{
		System.out.println("Invoked by JVM");
		
		arrayOfPercentage();
		
		System.out.println("End of main method");
	}
	
	public static void arrayOfPercentage()
	{
		System.out.println("Invoking method Percentage");
		
		float sslc=90.56f;
		float puc=80.83f;
		float degree=7.25f;
		
		float percentages[]={sslc,puc,degree};
		
		int sizeOfArray=percentages.length;
		System.out.println("total number of percentages: "+percentages.length);
		
		float elementAtIndex0=percentages[0];
		System.out.println("Element at Index0: "+elementAtIndex0);
		
		float elementAtIndex1=percentages[1];
		System.out.println("Element at Index1: "+elementAtIndex1);
		
		float elementAtIndex2=percentages[2];
		System.out.println("Element at Index2: "+elementAtIndex2);
	}
	
}
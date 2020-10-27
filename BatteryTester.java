public class BatteryTester{
	public static void main(String[] battery)
	{
		System.out.println("JVM Invoked main");
		
		byte percentage=Iphone.charge(8);
		System.out.println("Charge inPercentage: "+percentage);
		
		byte percentage1=Iphone.charge(2);
		System.out.println("Charge inPercentage: "+percentage1);
		
		byte percentage2=Iphone.charge(-4);
		System.out.println("Charge inPercentage: "+percentage2);
		
		System.out.println("EXIT:: main");
	}
}
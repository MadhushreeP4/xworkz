public class MobileTester
{
	public static void main(String[] value)
	{
		System.out.println("JVM Invoked main");
		
		String mode=Mobile.getUnlock();
		System.out.println("mode of Unlock: "+mode);
		
		Mobile.setUnlock(value[0]);
				
		System.out.println("EXIT :: main");
	}
}
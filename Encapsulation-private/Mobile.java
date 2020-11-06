public class Mobile
{
	private static String unlock="PIN";
	
	public static String getUnlock()
	{
		return unlock;
	}
	
	public static void setUnlock(String newUnlock)
	{
		if(newUnlock.equals("face") || newUnlock.equals("fingerprint") || newUnlock.equals("pattern") || newUnlock.equals("password"))
		{
			System.out.println("new Unlock method: "+newUnlock);
			unlock=newUnlock;
		}
		else
		{
			System.out.println("cannot change unlock method");
		}
	}
}
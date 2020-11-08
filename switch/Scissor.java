public class Scissor
{
	public static void main(String[] clothes)
	{
		System.out.println("invoked main, doing switch");
		String argAtIndex0=clothes[0];
		int switchArg=Integer.parseInt(argAtIndex0);
		switch(switchArg)
		{
			case 1 :
			System.out.println("case one is matched");
			break;
			case 2 :
			System.out.println("case two is matched");
			break;
			case 3 :
			System.out.println("case three is matched");
			break;
			default :
			System.out.println("no case  is matched, so executing default");
			break;
		}
		System.out.println("EXIT :: main");
	}
}
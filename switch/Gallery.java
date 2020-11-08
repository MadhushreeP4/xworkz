public class Gallery
{
	public static void main(String[] photos)
	{
		System.out.println("invoked main, doing switch");
		
		String storeIn=photos[0];
		System.out.println("storeIn value from arg "+storeIn);
		switch(storeIn)
		{
			case "Private":
				System.out.println("store images in private folder");
				System.out.println("stored on Nov 8");
				break;
			case "Public":
				System.out.println("store images in public folder");
				System.out.println("stored on Nov 8");
				break;
			case "Cloud":
				System.out.println("store images in cloud");
				System.out.println("stored on Nov 8");
			   break;
			default:
				System.out.println("cannot store images");
		}
		System.out.println("EXIT:: main, doing switch");
	}
}
public class InstituteTester
{
	public static void main(String[] photos)
	{
		System.out.println("invoked main, doing switch and enum");

		InstitueFinder.lowestAndBestUsingString("Xworkz");
		
		InstitueFinder.lowestAndBestUsingEnum(Institute.JSPIDERS);
		
		//String instituteName="JSPIDERS";
		//Institute enumInstituteName=Institute.valueOf(instituteName);
		//InstitueFinder.lowestAndBestUsingEnum(enumInstituteName);

		System.out.println("EXIT :: main, doing switch and enum");
	}
}
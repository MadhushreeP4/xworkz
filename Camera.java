public class Camera{
	public static void main(String[] ab)
	{
		System.out.println("Invoked by JVM");
		
		arrayOfLetters();
		
		System.out.println("End of main method by JVM");
	}
	
	public static void arrayOfLetters()
	{
		System.out.println("Invoking array of characters");
	
		char firstLetter='A';
		char secondLetter='B';
		char thirdLetter='c';
		char fourthLetter='D';
		char fifthLetter='E';
		char sixthLetter='F';
		char seventhLetter='G';
		char eighthLetter='H';
		char ninthLetter='I';
		char lastLetter='Z';
		
		char letters[]={firstLetter,secondLetter,thirdLetter,fourthLetter,fifthLetter,sixthLetter,seventhLetter,eighthLetter,ninthLetter,lastLetter};
		
		int sizeOfArray=letters.length;
		System.out.println("Number of Letters in the Array: "+sizeOfArray);
		
		char elementAtIndex4=letters[4];
		System.out.println("Letter at Index4: "+elementAtIndex4);
		
		char elementAtIndex6=letters[6];
		System.out.println("Letter at Index6: "+elementAtIndex6);
		
		char elementAtIndex8=letters[8];
		System.out.println("Letter at Index8: "+elementAtIndex8);
	}
}
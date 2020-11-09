public class Tester
{
	public static void main(String[] info)
	{
		System.out.println("JVM Invoked main");
		
		Teams[] allTeams=Teams.values();
		Captains[] allCaptains=Captains.values();
		TeamHigh[] highScore=TeamHigh.values();
		TeamLow[] lowScore=TeamLow.values();
		Won[] trophy=Won.values();
		
		System.out.println("Length of enum Teams: "+allTeams.length+" "+"length of enum Captains: "+allCaptains.length+" "+"length of enum TeamHigh: "+highScore.length);
		System.out.println("Length of enum lowScore: "+lowScore.length+" "+"length of enum Won: "+trophy.length);
		
		System.out.println("	");
		for(int index=0;index<allTeams.length;index++)
		{	
			Teams team=allTeams[index];
			System.out.println("teams: " + team);
			
			Captains captain=allCaptains[index];
			System.out.println("Captains: " + captain);
		}
		
		System.out.println("	");
		for(int index1=0;index1<highScore.length;index1++)
		{
			System.out.println("index " + index1);
			
			TeamHigh high=highScore[index1];
			System.out.println("players with high scores: " + high);
		}
		
		System.out.println("	");
		for(int index2=0;index2<lowScore.length;index2++)
		{
			TeamLow low=lowScore[index2];
			System.out.println("teams who have not won ipl: " + low);
		}
		
		System.out.println("	");
		for(int index3=0;index3<lowScore.length;index3++)
		{
			Won won=trophy[index3];
			System.out.println("teams who won ipl: " + won);
		}
		System.out.println("EXIT :: main");
	}
}		
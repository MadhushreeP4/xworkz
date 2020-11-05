public class FieldMain
{
	public static void main(String[] values)
	{
		System.out.println("JVM Invoked main");
		
		System.out.println("	All About Cricket	");
		
		String v1=FieldOne.name1;
		byte v2=FieldOne.teams1;
		int v3=FieldOne.minMoney;
		boolean v4=FieldOne.escn;
		short v5=FieldOne.players1;
		
		System.out.println("type: "+v1+"	"+"Total teams: "+v2+"	"+"Minimum Money for a player: "+v3+"	"+"ESCN: "+v4+"	"+"Total players in IPL: "+v5);
		System.out.println("	");
		
		String v6=FieldTwo.name2;
		boolean v7=FieldTwo.escn;
		byte v8=FieldTwo.players2;
		int v9=FieldTwo.captainPrice2;
		float v10=FieldTwo.amountLeftInCr2;
		
		String v11=FieldThree.name3;
		boolean v12=FieldThree.playOff3;
		byte v13=FieldThree.players3;
		int v14=FieldThree.captainPrice3;
		float v15=FieldThree.amountLeftInCr3;
		
		System.out.println("Team names:			"+v6+"			"+v11);
		System.out.println("ESCN:				"+v7+"		"+"qualified for playoff:	"+v12);
		System.out.println("total No Players:		"+v8+"			"+v13);
		System.out.println("Captains Price:			"+v9+"		"+v14);
		System.out.println("Amount left In Cr:		"+v10+"			"+v15);
		
		System.out.println("	");
		
		String v16=FieldFour.name4;
		boolean v17=FieldFour.playOff4;
		byte v18=FieldFour.players4;
		int v19=FieldFour.captainPrice4;
		float v20=FieldFour.amountLeftInCr4;
		
		String v21=FieldFive.name5;
		boolean v22=FieldFive.playOff5;
		byte v23=FieldFive.players5;
		int v24=FieldFive.captainPrice5;
		float v25=FieldFive.amountLeftInCr5;
		
		System.out.println("Team names:			"+v16+"			"+v21);
		System.out.println("qualified for playoff:		"+v17+"			"+v22);
		System.out.println("total No Players:		"+v18+"			"+v23);
		System.out.println("Captains Price:			"+v19+"		"+v24);
		System.out.println("Amount left In Cr:		"+v20+"			"+v25);
		
		System.out.println("	");
		System.out.println("EXIT :: main");
	}
}
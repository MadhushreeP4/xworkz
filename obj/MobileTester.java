package com.xworkz.obj;

import com.xworkz.obj.mobile.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		Mobile.battery="lithium-ion battery";
		
		Mobile mob1=new Mobile();
		mob1.modelName="Nokia C3";
		mob1.price="7499";
		mob1.colorOfModel="Slate Grey";
		mob1.yearOfRelease="04/08/2020";
		mob1.displayInfo();
		
		System.out.println(" ");
		
		Mobile mob2=new Mobile();
		mob2.modelName="Nokia 5.3";
		mob2.price="12499";
		mob2.colorOfModel="Charcol";
		mob2.yearOfRelease="24/07/2020";
		mob2.displayInfo();		
		System.out.println(" ");
		
		Mobile mob3=new Mobile();
		mob3.modelName="Nokia 6.2";
		mob3.price="12168";
		mob3.colorOfModel="Ceramic Grey";
		mob3.yearOfRelease="05/09/2019";
		mob3.displayInfo();
		System.out.println(" ");
		
		Mobile mob4=new Mobile();
		mob4.modelName="Nokia 7.2";
		mob4.price="16399";
		mob4.colorOfModel="Ice Blue";
		mob4.yearOfRelease="06/09/2019";
		mob4.displayInfo();
		System.out.println(" ");
		
		
		Mobile mob5=new Mobile();
		mob5.modelName="Nokia 8.1";
		mob5.price="14999";
		mob5.colorOfModel="Night Red";
		mob5.yearOfRelease="20/12/2018";
		mob5.displayInfo();
		System.out.println(" ");
		
		Mobile mob6=new Mobile();
		mob6.modelName="Nokia 9 PureView";
		mob6.price="37999";
		mob6.colorOfModel="Night Blue";
		mob6.yearOfRelease="25/02/2019";
		mob6.displayInfo();
		System.out.println(" ");
		
		Mobile mob7=new Mobile();
		mob7.modelName="Nokia 8 Sirocco";
		mob7.price="29990";
		mob7.colorOfModel="Black";
		mob7.yearOfRelease="30/04/2018";
		mob7.displayInfo();
		System.out.println(" ");
		
		Mobile mob8=new Mobile();
		mob8.modelName="Nokia Lumina 635";
		mob8.price="45676";
		mob8.colorOfModel="Bright Orange";
		mob8.yearOfRelease="May 2014";
		mob8.displayInfo();
		System.out.println(" ");
		
		Mobile mob9=new Mobile();
		mob9.modelName="Nokia 108";
		mob9.price="3999";
		mob9.colorOfModel="Bright Red";
		mob9.yearOfRelease="September 2013";
		mob9.displayInfo();
		System.out.println(" ");
		
		Mobile mob10=new Mobile();
		mob10.modelName="Nokia 105";
		mob10.price="1149";
		mob10.colorOfModel="White";
		mob10.yearOfRelease="03/06/2015";
		mob10.displayInfo();
		
	}

}

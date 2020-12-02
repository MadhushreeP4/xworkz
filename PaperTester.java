package com.xworkz.copies.init;


public class PaperTester {

	public static void main(String[] args) {
		
		Paper paper=new Paper(15.1f,0.1f,"white");
		System.out.println("brand: "+paper.getBrand());
		System.out.println("paper width: "+paper.height+"cm");
		System.out.println("paper height: "+paper.width+"cm");
		System.out.println("paper color: "+paper.color);
	
		
		

	}

}

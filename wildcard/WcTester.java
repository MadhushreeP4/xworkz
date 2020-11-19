package com.xworkz.wildcard;

import com.xworkz.wildcard.events.*;

public class WcTester {

	public static void main(String[] args) {
		System.out.println("jvm invoked main");
		Online.number();
		Offline.value();
		System.out.println("EXIT :: main");

	}

}

//	Task 2
//1.	Void.class
//2.	StringIndexOutOfBoundsException.class
//3.	RunTimeException.class
//4.	NullPointerException.class
//5.	NumberFormatException.class
//6.	IndexOutOfBoundsException.class
//7.	Error.class
//8.	Enum.class
//9.	Class.class
//10.	ArrayIndexOutOfBoundsException.class*/
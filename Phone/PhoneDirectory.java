package com.xworkz.Phone;

public class PhoneDirectory {
	
	private static long[] numbers = {9876543210L,9182736450L,9081726354L,71234567890L};
	
	public static void search(long number) {
		System.out.println("Invoked search");
		System.out.println("Total numbers in directory" + numbers.length);
		System.out.println("arg1 :" + number);
		
		boolean numberFound = false;
		for (int count = 0; count < numbers.length; count++) {
			long no = numbers[count];
			if (number==numbers[count]) {
				numberFound = true;
				break;
			} 
			else {
				numberFound = false;
			}
		}
		if (numberFound) {
			System.out.println("Number is found ");
		} 
		else {
			System.out.println("Number is not found");
		}
		System.out.println("EXIT search");
	}
	public static int totalNumbers() {
		return numbers.length;
	}
}

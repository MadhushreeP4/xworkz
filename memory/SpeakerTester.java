package com.xworkz.memory;

import com.xworkz.memory.speaker.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		
		info();

	}
	public static void info(){
		
		Speaker speaker=new Speaker();
		System.out.println(speaker.thing);
		System.out.println(speaker.brand);
	}

}

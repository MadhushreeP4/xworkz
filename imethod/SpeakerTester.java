package com.xworkz.imethod;

import com.xworkz.imethod.speaker.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		
		Speaker speaker=new Speaker("Gray",8);
		System.out.println(speaker.getCompanyName());
		System.out.println(speaker.isConnected());
		
		speaker.onOrOff();
		
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.decreaseVolume();
		
		speaker.onOrOff();
		
		speaker.increaseVolume();
		speaker.decreaseVolume();
		
		speaker.onOrOff();
		
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.increaseVolume();
		
	}

}

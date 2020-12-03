package com.xworkz.imethod.speaker;

public class Speaker {
	
	private String companyName="JBL";
	private String color;
	private int batteryBackupInhours;
	
	//to control functionalities
	public boolean connected;
	public int maxSpeakerVolume=4;
	public int minSpeakerVolume=0;
	public int currentVolume=0;
	
	public Speaker(String color,int batteryBackupInhours){
		this.color=color;
		this.batteryBackupInhours=batteryBackupInhours;
		System.out.println("color: "+this.color);
		System.out.println("battery backup: "+this.batteryBackupInhours);
	}
	
	public void onOrOff(){
		if(this.connected==false){
			this.connected=true;
			System.out.println("Speaker is On");
		}
		else{
			this.connected=false;
			System.out.println("Speaker is Off");
		}
	}
	
	public void increaseVolume(){
		if(this.connected==true){
			
			if(currentVolume<4){
				this.currentVolume=this.currentVolume+1;
				System.out.println(this.currentVolume);
			}
			else{
				System.out.println("max Volume reached");
			}
		}
		else{
			System.out.println("cant increase volume,Speaker is Off");
		}
		
	}
	public void decreaseVolume(){
		if(this.connected==true){
			
			if(currentVolume>0){
				this.currentVolume=this.currentVolume-1;
				System.out.println(this.currentVolume);
			}
			else{
				System.out.println("min volume reached");
			}
		}
		else{
			System.out.println("cant decrease volume,Speaker is off");
		}
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getColor() {
		return color;
	}

	public int getBatteryBackupInhours() {
		return batteryBackupInhours;
	}

	public boolean isConnected() {
		return connected;
	}
	

}

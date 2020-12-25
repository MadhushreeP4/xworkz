package com.xworkz.computer.types;

public class Laptop extends Computer{
	
	protected String processor;
	
	public boolean mobility(){
		System.out.println("Invoked mobility in class Laptop");
		boolean carry=true;
		return carry;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String getProcessor() {
		return processor;
	}

}

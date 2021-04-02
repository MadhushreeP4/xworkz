package com.xworkz.init.component;

public class SoftwareComponent {
	
	private String name;
	private String vendor;
	private String version;
	private String type;
	
	public SoftwareComponent(String name, String vendor) {
		super();
		System.out.println("created param constructor "+name+" "+vendor);
		this.name = name;
		this.vendor = vendor;
	}
	
	public void setVersion(String version) {
		System.out.println("invoked setVersion");
		this.version = version;
	}
	
	public void setType(String type) {
		System.out.println("invoked setType");
		this.type = type;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getType() {
		return type;
	}

}

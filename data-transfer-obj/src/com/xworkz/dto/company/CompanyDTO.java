package com.xworkz.dto.company;

public class CompanyDTO {
	private String name;
	private String ceo;
	private String location;
	private String type;
	private String webSite;
	private String founded;

	public CompanyDTO(String founded) {
		this.founded=founded;
	}

	public CompanyDTO(String name, String ceo, String location,String type) {
		System.out.println("CompanyDTO constructor");
		this.name = name;
		this.ceo = ceo;
		this.location = location;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;

	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

}

package com.xworkz.solution.dto;

public class AlcoholDTO {
	
	private String name;
	private String brandName;
	private int alcoholContent;
	
	public AlcoholDTO() {
		System.out.println("Created AlcoholDTO");
	}

	public AlcoholDTO(String name, String brandName, int alcoholContent) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.alcoholContent = alcoholContent;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", alcoholContent=" + alcoholContent + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals");
		
		if(obj==null)
			return false;
		if(obj instanceof AlcoholDTO){
			AlcoholDTO dto=(AlcoholDTO)obj;
			if(this.brandName.equals(dto.getBrandName())){
				System.out.println("Brand is there");
				return true;
			}
		}
		
		return false;
	}

	public String getName() {
		return name;
	}

	public String getBrandName() {
		return brandName;
	}

	public int getAlcoholContent() {
		return alcoholContent;
	}
	
	

}

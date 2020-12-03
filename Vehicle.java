package cons.com.xworkz.constructor.vehicle;

public class Vehicle {
	private String mfgDate;
	private String company;
	private int chasisNo;
	private String color;
	private String ownerName;


	public Vehicle(String mfgDate,String company,int chasisNo) {
		this.mfgDate=mfgDate;
		this.company=company;
		this.chasisNo=chasisNo;
	}


	public String getMfgDate() {
		return mfgDate;
	}


	public String getCompany() {
		return company;
	}


	public int getChasisNo() {
		return chasisNo;
	}


	public void setColor(String color) {
		this.color = color;
		System.out.println("vehicle color: "+color);
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("company owner: "+ownerName);
	}

}

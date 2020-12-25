package com.xworkz.computer;

import com.xworkz.computer.types.Computer;
import com.xworkz.computer.types.Desktop;
import com.xworkz.computer.types.Laptop;

public class ComputerTester {

	public static void main(String[] args) {

		Computer computer = new Desktop();
		
		System.out.println("Desktop object from type Computer");
		computer.display();
		computer.setColor("Gray");
		System.out.println(computer.getColor());
		computer.setPrice(49999.75);
		System.out.println(computer.getPrice());
		computer.setGraphics(true);
		System.out.println(computer.isGraphics());
		computer.Updatecolor("Black");
		System.out.println(" ");

		Computer computer2 = new Laptop();
		System.out.println("Laptop object from type Computer");
		System.out.println(computer2.getColor());
		System.out.println(computer2.getPrice());
		System.out.println(computer2.isGraphics());
		computer2.Updatecolor("Blue");
		System.out.println(" ");

		Desktop desktop = new Desktop();
		desktop.setMemory("4GB");
		System.out.println(desktop.getMemory());
		System.out.println(desktop.getColor());
		System.out.println(" ");

		Laptop laptop = new Laptop();
		laptop.setProcessor("Intel");
		System.out.println(laptop.getProcessor());
		laptop.mobility();
		System.out.println(" ");
		
		if (computer instanceof Laptop) {
			
			Laptop refLaptop = (Laptop) computer;
			refLaptop.setColor("white");
			System.out.println(refLaptop.getColor());

		}
		else{
			System.out.println("convertion is not possible");
		}

	}

}

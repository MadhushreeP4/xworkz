package com.xworkz.engineering;

import com.xworkz.engineering.engineer.CIVILEngineer;
import com.xworkz.engineering.engineer.CSEngineer;
import com.xworkz.engineering.engineer.ECEEngineer;
import com.xworkz.engineering.engineer.EEEEngineer;
import com.xworkz.engineering.engineer.Engineer;
import com.xworkz.engineering.engineer.ISEngineer;
import com.xworkz.engineering.engineer.MECHEngineer;

public class EngineerTester {

	public static void main(String[] args) {

		Engineer engineer = new Engineer();

		System.out.println(engineer.getBranch());
		System.out.println(engineer.getUSN());
		engineer.problemSolving();
		System.out.println(" ");

		Engineer engineer2 = new CSEngineer();
		engineer2.problemSolving();
		System.out.println(" ");

		Engineer engineer3 = new ECEEngineer();
		engineer3.problemSolving();
		System.out.println(" ");

		Engineer engineer4 = new EEEEngineer();
		engineer4.problemSolving();
		System.out.println(" ");

		Engineer engineer5 = new CIVILEngineer();
		engineer5.problemSolving();
		System.out.println(" ");

		Engineer engineer6 = new MECHEngineer();
		engineer6.problemSolving();
		System.out.println(" ");

		Engineer engineer7 = new ISEngineer();
		engineer7.problemSolving();

	}

}

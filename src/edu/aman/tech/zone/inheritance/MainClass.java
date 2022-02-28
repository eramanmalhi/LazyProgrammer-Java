package edu.aman.tech.zone.inheritance;

public class MainClass {

	public static void main(String[] args) {
		CustomBiCycle custBiCycle=new CustomBiCycle(5, 20, 3);
		System.out.println(custBiCycle.displayDetails());
		custBiCycle.speedUp(10);
		System.out.println(custBiCycle.displayDetails());
	}

}

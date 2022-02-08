package edu.aman.tech.zone.inheritance;

public class CustomBiCycle extends BiCycle {

	private int height;

	public void setHeight(int height) {
		this.height = height;
	}

	public String displayDetails() {
		return super.displayDetails() + "\nHeight:" + this.height;
	}

	public CustomBiCycle(int gears, int speed, int height) {
		super(gears, speed);
		System.out.println("Param Constructor Called in CustomBiCycle");
		this.height = height;
	}
}

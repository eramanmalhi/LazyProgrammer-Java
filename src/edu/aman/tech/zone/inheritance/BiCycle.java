package edu.aman.tech.zone.inheritance;

public class BiCycle {
	private int gears;
	private int speed;

	public String displayDetails() {
		return "Number of Gears:" + this.gears + "\nCurrent Speed:" + this.speed;
	}

	public void speedUp(int value) {
		this.speed += value;
	}

	public void slowDown(int value) {
		this.speed -= value;
	}
	public BiCycle(int gears, int speed) {
		System.out.println("Param Constructor Called in BiCycle");
		this.gears=gears;
		this.speed=speed;
	}
}

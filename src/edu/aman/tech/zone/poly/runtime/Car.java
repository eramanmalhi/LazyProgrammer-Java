package edu.aman.tech.zone.poly.runtime;
class Vehicle{
	public void display() {
		System.out.println("Have Tyres");
	}
}
public class Car extends Vehicle{

	@Override
	public void display() {
		System.out.println("Have 4 Tyres");
	}
	public static void main(String[] args) {
		Vehicle car=new Car();
		car.display();
	}

}

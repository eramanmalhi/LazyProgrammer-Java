package edu.aman.tech.zone.memoryallocation;

public class StackMemoryDemo {

	public static void function1() {
		function2();
	}

	public static void function2() {
		int num1=20;
		function3();
	}

	public static void function3() {
		int num=10;
		System.out.println("Hello There!!!");
	}

	public static void main(String[] args) {
		function1();
	}

}

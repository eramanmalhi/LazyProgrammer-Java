package edu.aman.tech.zone.poly.compile;

public class MethodOverloading {
	public static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public static void multiply(double a, double b) {
		System.out.println(a*b);
	}
	public static void multiply(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		multiply(5, 9);
		multiply(5.5, 4.5);
		multiply(2, 3, 4);
	}
}

package edu.lazy.programmer.arrays;

public class DemoArraysException {

	public static void main(String[] args) {
		String names[]=new String[3];
		names[0]="Aman";
		names[1]="Karan";
		names[2]="Amit";
		//NullPointerException
		System.out.println(names[2].length());
		//ArrayIndexOutOfBoundsException
		System.out.println(names[3]);
	}

}

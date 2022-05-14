package edu.lazy.programmer.misc;

public class Quiz {

	public static void main(String[] args) {
		int Integer = 99;
		char String = 'A';
		System.out.println(Integer);
		System.out.println(String);
		short x = 10;
		//x = x * 5;
		System.out.println(x);
		String[] names=new String[3];
		names[0]="A";
		names[1]="B";
		names[2]="C";
		for (String name : names) {
			System.out.println(name);
		}
		test1(names);
		System.out.println(names[1]);
	}
	
	public static void test1(String[] n) {
		n[1]="Z";
	}

}


package edu.lazy.programmer.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Interview {
	public static void main(String[] args) {
		String[] names1 = new String[3];
		System.out.println("Initial HashCode of 1st Array:"+names1.hashCode());
		String[] names2 = new String[10];
		System.out.println("Initial HashCode of 2nd Array:"+names2.hashCode());
		names1 = names2;
		System.out.println("Final HashCode of 1st Array:"+names1.hashCode());

	}
}

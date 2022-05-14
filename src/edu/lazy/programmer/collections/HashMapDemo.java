package edu.lazy.programmer.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> employees = new HashMap<>();
		employees.put(1, "Mike");
		employees.put(2, "John");
		employees.put(3, "Bob");
		System.out.println(employees);

		for (Map.Entry<Integer, String> entry : employees.entrySet()) {
			System.out.println("Employee ID: " + entry.getKey() + 
					", Employee Name: " + entry.getValue());
		}
		employees.remove(1);
		System.out.println(employees);
		employees.put(2, "UpdatedName");
		System.out.println(employees);
		employees.clear();
		System.out.println(employees);


	}

}

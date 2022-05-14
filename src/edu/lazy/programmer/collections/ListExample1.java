package edu.lazy.programmer.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		//Declaring list
		List<String> names=new ArrayList<>();
		//Adding elements
		names.add("Mike");
		names.add("John");
		System.out.println("First List of Names:"+names);
		System.out.println("---------------------------------------");
		List<String> names2=new ArrayList<>();
		names2.add("Chris");
		System.out.println("Second List of Names:"+names2);
		System.out.println("---------------------------------------");
		//Appending one list to another
		names.addAll(names2);
		System.out.println("Merged List of Names:"+names);
		System.out.println("---------------------------------------");
		//Converting an Array to List
		String[] array={"Java","Python","C++"};  
		List<String> languages=Arrays.asList(array);
		System.out.println("List Converted from Array:"+languages);	
	}

}

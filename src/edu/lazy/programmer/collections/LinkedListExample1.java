package edu.lazy.programmer.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		System.out.println(list);
		list.addFirst("Orange");
		list.addLast("Kiwi");
		System.out.println(list);
		list.offer("Mango");
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.pollLast());
		System.out.println(list);
		
		//Synchronize the LinkedList
		
		List<String> names = Collections.synchronizedList(new LinkedList());
		names.add("Mike");
		names.add("John");
		System.out.println(names);
		Set<String> set=new HashSet<>();
		set.add(null);
		System.out.println(set);
		
		Object[] arr=new String[5]; 
		arr[0]="Hello";
		arr[1]=123;
		System.out.println(arr);			
		
	}

}

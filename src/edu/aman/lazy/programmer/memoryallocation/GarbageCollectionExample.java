package edu.aman.lazy.programmer.memoryallocation;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionExample {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> l = new ArrayList<>();
		int i = 0;
		while (true) {
			l.add(Integer.valueOf(i));
			if (i > 10000) {
				l = new ArrayList<>();
				i = 0;
			}
			i++;
			Thread.sleep(10);
		}

	}

}

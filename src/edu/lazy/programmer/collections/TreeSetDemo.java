package edu.lazy.programmer.collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("H");
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("A");
		treeSet.add("Z");
		System.out.println("TreeSet:"+treeSet);
		System.out.println("Ceiling Element to E is "+treeSet.ceiling("E"));
		System.out.println("Floor Element to F is "+treeSet.floor("F"));
		System.out.println("Higher Element to B is "+treeSet.higher("B"));
		System.out.println("Lower Element to B is "+treeSet.lower("B"));
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		Iterator<String> it=treeSet.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		NavigableSet<String> navSet=treeSet.descendingSet();
		System.out.println(navSet);
		
		System.out.println(treeSet.pollFirst()+" Set After pollFirst:"+treeSet);
		System.out.println(treeSet.pollLast()+" Set After pollLast:"+treeSet);
	}

}

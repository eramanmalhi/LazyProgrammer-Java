package edu.aman.lazy.programmer.memoryallocation;

import java.util.ArrayList;
import java.util.List;

public class TestMemoryAllocation {

	public static void main(String[] args) {
		System.out.println("Start");
		List<Student> sts=new ArrayList<Student>();
		List<String> l=new ArrayList<>();
		l.add("C");
		for(int i=0;i<100000;i++)
		{
			Student s=new Student(1L, "Name:"+i, l);
			sts.add(s);
		}
		sts=null;
		System.out.println("End");
	}

}

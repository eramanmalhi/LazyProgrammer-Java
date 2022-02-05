package edu.aman.tech.zone.innerclasses.part1;

import edu.aman.tech.zone.innerclasses.part1.OuterClass.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		outer.heyThere();
		
		/*
		 * InnerClass inner=outer.new InnerClass(); inner.hello();
		 */
		
		OuterClass.InnerClass inner=new InnerClass();
		inner.hello();
	}

}

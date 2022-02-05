package edu.aman.tech.zone.constructors;

public class ConstructorOverloading {
	Long id;
	String name;
	public ConstructorOverloading() {}
	public ConstructorOverloading(Long id) {
		this.id=id;
		this.name="Default Name";
	}
	public ConstructorOverloading(String name) {
		this.name=name;
		this.id=1L;
	}
	public static void main(String[] args) {
		ConstructorOverloading obj1=new ConstructorOverloading();
		System.out.println(obj1.id+":"+obj1.name);
		ConstructorOverloading obj2=new ConstructorOverloading(101L);
		System.out.println(obj2.id+":"+obj2.name);
		ConstructorOverloading obj3=new ConstructorOverloading("Aman Tech Zone");
		System.out.println(obj3.id+":"+obj3.name);
	}

}

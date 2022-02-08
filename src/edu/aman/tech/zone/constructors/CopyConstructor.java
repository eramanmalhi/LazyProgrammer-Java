package edu.aman.tech.zone.constructors;

public class CopyConstructor {
	Long number;
	String title;

	public CopyConstructor(Long number, String title) {
		super();
		this.number = number;
		this.title = title;
	}

	public CopyConstructor(CopyConstructor cp) {
		this.number = cp.number;
		this.title = cp.title;
	}

	public static void main(String[] args) {
		CopyConstructor obj1=new CopyConstructor(101L, "MyBook");
		System.out.println(obj1.title+":"+obj1.number+":"+obj1.hashCode());
		CopyConstructor obj2=new CopyConstructor(obj1);
		System.out.println(obj2.title+":"+obj2.number+":"+obj2.hashCode());
		CopyConstructor obj3=obj1;
		System.out.println(obj3.title+":"+obj3.number+":"+obj3.hashCode());
		obj3.number=200L;
		System.out.println("Number for obj3:"+obj3.number);
		System.out.println("Number for obj1:"+obj1.number);
	}

}

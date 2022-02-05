package edu.aman.tech.zone.constructors;

public class ConstructorChaining {
	private Long id;
	private String name;
	
	public ConstructorChaining() {
		this(101L);
		System.out.println("No-Arg Constructor Called");
	}
	public ConstructorChaining(long id) {
		this(id, "Aman Tech Zone");
		System.out.println("Constructor with ID Called");
	}
	public ConstructorChaining(long id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("Constructor with ID and Name Called");
	}
	public static void main(String[] args) {
		ConstructorChaining obj=new ConstructorChaining();
	}

}

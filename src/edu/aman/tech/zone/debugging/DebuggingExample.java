package edu.aman.tech.zone.debugging;

public class DebuggingExample {

	public static String sayHello(String name) {
		String msg="Hello "+name;
		return msg;
	}
	public static void main(String[] args) {
		String message=sayHello("Aman Tech Zone");
		System.out.println(message);
	}

}

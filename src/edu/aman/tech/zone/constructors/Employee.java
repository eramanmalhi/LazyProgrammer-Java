package edu.aman.tech.zone.constructors;

//No-Arg Constructor Example
public class Employee {
	private String employeeName;

	public Employee() {
		System.out.println("No-Arg Constructor Called");
		this.employeeName = "Aman Tech Zone";
	}

	public void displayEmployeeName()
	{
		System.out.println(this.employeeName);
	}
}

package edu.aman.tech.zone.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Student s=new Student();
		s.setStudentId(1);
		s.setStudentName("Aman");
		s.setCollegeName("ABC College");
		System.out.println(s.getStudentId()+":"+s.getStudentName()+":"+s.getCollegeName());
		//Compilation error as member is private and cannot be accessed directly
		/* System.out.println(s.studentId); */ 
		
	}

}

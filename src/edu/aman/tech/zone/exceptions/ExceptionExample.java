package edu.aman.tech.zone.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
		System.out.println("Enter Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int[] arr=new int[3];
		try {
		System.out.println("Division Result: "+num1/num2);
		System.out.println(arr[4]);
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException in Logic: "+e.getLocalizedMessage());
		}catch (Exception e) {
			System.out.println("Exception in Logic: "+e.getLocalizedMessage());
		}finally {
			System.out.println("Finally");
		}
		}catch (Exception e) {
			System.out.println("Exception in Logic Outer");
		}
		System.out.println("Some other logic");
		System.out.println("End of Program");
	}

}

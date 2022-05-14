package edu.lazy.programmer.arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,6,7,8,9,0};
		print(numbers);
		int cloneNumbers[]=numbers.clone();
		print(cloneNumbers);
		System.out.println(numbers.equals(cloneNumbers));
	}
	public static void print(int arr[]) {
		for (int i : arr) {
		System.out.print(i+" ");	
		}
		System.out.println("");
	}
	
	public static void print(int arr[][]) {
		System.out.println("2D Array");
		for (int row = 0; row < arr.length; row++) {
		    for (int col = 0; col < arr[row].length; col++) {
		       System.out.print(arr[row][col]+" ");
		    }
		    System.out.println("");
		 }
		System.out.println("");
	}
}

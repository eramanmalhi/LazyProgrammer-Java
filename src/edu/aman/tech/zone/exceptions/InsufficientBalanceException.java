package edu.aman.tech.zone.exceptions;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Custom Exception");
		System.out.println(Constants.INSUFFICIENT_BALANCE);
	}

}

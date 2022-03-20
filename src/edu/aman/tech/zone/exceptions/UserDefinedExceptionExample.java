package edu.aman.tech.zone.exceptions;

public class UserDefinedExceptionExample {

	private int balance;
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	public void validateBalance() throws InsufficientBalanceException
	{
		if(this.balance<2000)
			throw new InsufficientBalanceException();
	}
	public static void main(String[] args) {
		UserDefinedExceptionExample obj=new UserDefinedExceptionExample();
		obj.setBalance(1000);
		try {
			obj.validateBalance();
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}

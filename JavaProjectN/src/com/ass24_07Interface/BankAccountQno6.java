package com.ass24_07Interface;
//6.Create an interface Account having methods- deposit(), withdraw() and aboutBank() (abountBank()
//is a static method). Create two classes Saving and Current which implement the Account interface.
//Call the methods of Saving and Current classes in main method.,create a new method in Account interface- 
//takeLoan() (takeLoan() is a default method). takeLoan() method would be implemented by Saving class only. 
//Call the methods of Saving and Current classes in main method.

interface Account
{
	public abstract void deposit();
	public abstract void withdraw();
	static void aboutBank()
	{
		System.out.println("Bank name is HDFC");
		System.out.println("Branch in Pune");
	}
	default void takeLoan()
	{
		System.out.println("Take loan from bank");
	}
}
class Saving implements Account
{

	@Override
	public void deposit() {
		System.out.println("deposit amount in saving account");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw amount from saving account");
	}
	public void takeLoan()
	{
		System.out.println("loan for saving account");
	}
	
}
class Current implements Account
{

	@Override
	public void deposit() {
		System.out.println("deposit amount in current account");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw amount from current account");
	}
}
public interface BankAccountQno6 {
	public static void main(String[] args) {
		Account ac = new Saving();
		ac.deposit();
		ac.withdraw();
		ac.takeLoan();
		Account ac1 = new Current();
		ac1.deposit();
		ac1.withdraw();
	}
}

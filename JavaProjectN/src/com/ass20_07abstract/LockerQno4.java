package com.ass20_07abstract;
//4)You need to create a locker with contents like money, jewellery and pin_code. The contents of the
//locker must not be accessible to anybody outside.

abstract class Locker
{
	private int money;
	private String jwellary;
	private int pinCode;
	
	public abstract void locker();
	public void display()
	{
		System.out.println("Private Locker");
	}
}
class Person extends Locker
{
	public void locker()
	{
		System.out.println("owner can accessible locker");
	}
}

public class LockerQno4 {

	public static void main(String[] args) {
		Locker l=new Person();
		l.display();
		l.locker();
	}

}

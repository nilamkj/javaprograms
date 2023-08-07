package com.polymorphism;

class Calculator
{
	public Object add()
	{
		return 12.3;
	}

	public Vehicle1 v1()

		{
		return new Vehicle1();
		}
}

class SimpleCalculator extends Calculator
{
	public String add()
	{
		return "Hello";
	}
	public Car c()
	{
		return new Car();
	}
}
public class NonprimitiveOverriding {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add();
		SimpleCalculator s1=new SimpleCalculator();
		String m=s1.add();
		System.out.println(m);
		Car a=s1.c();
		System.out.println(a);
	}

}

package com.polymorphism;

class Vehicle1
	{
		public void drive()
		{
			System.out.println("Inside parent class");
		}
	}

class Car extends Vehicle1
{
	@Override
	public void drive()
	{
		System.out.println("Inside child class");
	}
}
public class Vehicles {
		
	public static void main(String[] args) {
		Vehicle1 v=new Vehicle1();
		v.drive();
		
		Car c=new Car();
		c.drive();
		
		Vehicle1 v1=new Car();
		v1.drive();
		
	}

}

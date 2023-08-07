package com.ass24_07Interface;
//5.Write a Java program to create an interface Flyable with a method called fly_obj(). Create 
//three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. 
//Implement the fly_obj() method for each of the three classes.

interface Flyable
{
	public void fly_obj();
	
}
class Spacecraft implements Flyable
{
	public void fly_obj()
	{
		System.out.println("Spacecraft is flyable");
	}
}
class Airplane implements Flyable
{
	public void fly_obj()
	{
		System.out.println("Airplane is flyable");
	}

}
class Helicopter implements Flyable
{
	public void fly_obj()
	{
		System.out.println("Helicopter is flyable");
	}

}
public class FlyableQno5 {

	public static void main(String[] args) {
		Flyable f=new Spacecraft();
		f.fly_obj();
		f=new Airplane();
		f.fly_obj();
		f=new Helicopter();
		f.fly_obj();
		
	}

}

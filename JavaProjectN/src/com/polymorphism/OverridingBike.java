package com.polymorphism;
//5)WAP to create class Bike with fields color ,speed and  method bikeInfo() which is show color 
//and speed of bike .create class Pulsar which extends Bike implement bikeInfo() differently child 

class Bike
{
	String color;
	int speed;
	
	public void bikeInfo()
	{
		System.out.println("Color of bike is black");
		System.out.println("Speed of bike is 80");
	}
}
class Pulsar extends Bike
{
	@Override
	public void bikeInfo()
	{
		System.out.println("Color of bike is red");
		System.out.println("Speed of bike is 90");
	}

}
public class OverridingBike {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.bikeInfo();
		
		Pulsar p=new Pulsar();
		p.bikeInfo();
		
		Bike b1=new Pulsar();
		p.bikeInfo();
	}

}

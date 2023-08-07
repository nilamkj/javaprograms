package com.ass_methodoverriding;
//3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,stop()
//run() all method return string type of value. Create class car which extends Vehicle implement 
//accelerate(long mph)differently in car class.

class Vehicle
{
	public void accelerate(long mph)
	{
		System.out.println(mph);
	}
	public String stop()
	{
		return "Stop";
	}
	public String run()
	{
		return "Run";
	}

}
class Car extends Vehicle
{
	@Override
	public void accelerate(long mph)
	{
		System.out.println(mph);
	}
}

public class VehicleOverriding {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.accelerate(120);
		
		Car c2=new Car();
		c2.accelerate(150);
		
				
		String m=c2.stop();                                              
		System.out.println(m);
		
		String r=c2.run();
		System.out.println(r);
		


	}

}

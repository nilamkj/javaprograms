package com.ass_methodoverriding;

public class Car1 {
	
	String carName="i20";
	String carColor="Red";
	
	Car1()
	{
		System.out.println("Car");
	}
	public Car1(String carName,String carColor)
	{
		this.carName=carName;
		this.carColor=carColor;
	}
	public void show(String carName,String carColor)
	{
		System.out.println("car name= "+carName+" car color= "+carColor);
	}
}
class BMW extends Car1
{
	String color="Black";
	int speed=120;
	
	public void showDetails(String color,int speed)
	{
		System.out.println("BMW speed= "+speed+" Color= "+super.carColor);
	}
	

	

}

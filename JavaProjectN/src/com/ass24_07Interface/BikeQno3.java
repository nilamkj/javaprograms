package com.ass24_07Interface;
//3.	Create interfaces Bike and Scooty, both of which have two methods- offer() and details() 
//(details() is default method). Create a new class BuySomething which implements both interfaces. 
//To remove ambiguity, create a method details() in BuySomething class as well in which call the details()
//method of both interfaces. Call the methods of BuySomething class in main method.

interface Bike
{
	 void offer();
	 
	default void details()
	{
		System.out.println("Bike Details Method");
	}

}
interface Scooty
{
	 void offer();
	
	default void details()
	{
		System.out.println("Scooty Details Method");
	}
}
class BuySomething implements Bike,Scooty
{
	
	public void offer()
	{
		System.out.println("Offer for Bike and Scooty");
	}
	public void details()
	{
		Bike.super.details();
		Scooty.super.details();
		System.out.println("Details of Both Bike and Scooty");
	}
}

public class BikeQno3 {

	public static void main(String[] args) {
		BuySomething bs=new BuySomething();
		bs.details();

	}

}

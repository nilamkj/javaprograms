package com.abstractdemo;

abstract class Mobile
{
		private String modelName;
		private double price;
		
		public abstract void call() ;
		
		public void display()
		{
			System.out.println("Mobile calling method");
		}
}
class Basic extends Mobile
{
	@Override
	public void call()
	{
		System.out.println("Basic mobile calling ");
	} 
}
abstract class Android extends Mobile
{
	public abstract void call();
}

class Oneplus extends Android
{
	@Override
	public void call()
	{
		System.out.println("Oneplus mobile calling ");
	} 

}
public class TestAbstractDemo2 {

	public static void main(String[] args) {
		Mobile m=new Basic();
		m.call();
		m.display();
		
		Android a=new Oneplus();
		a.call();
		a.display();
	}

}

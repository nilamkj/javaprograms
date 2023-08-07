package com.ass24_07Interface;
//1.	Write a program to create a interface  named shape. In this class we have three sub classes 
//circle, triangle and square each class has two member function named draw () and erase (). Create 
//these using polymorphism concepts.


interface Shape
{
	void draw();
	void erase();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Circle is draw");
	}
	public void erase()
	{
		System.out.println("Circle is erase");
	}
}
class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("Triangle is draw");
	}
	public void erase()
	{
		System.out.println("Triangle is erase");
	}
}
class Square implements Shape
{
	public void draw()
	{
		System.out.println("Square is draw");
	}
	public void erase()
	{
		System.out.println("Square is erase");
	}
}

public interface ShapePolymorQno1 {
	public static void main(String []args)
	{
		Circle c=new Circle();
		c.draw();
		c.erase();
		
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		
		Square s=new Square();
		s.draw();
		s.erase();
	}
}

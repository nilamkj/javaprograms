package com.ass19_07inheritance;
//6.	Create a class ‘rectangle’ that contains ‘length’ and ‘width’ as data members. From this class 
//derive a class named ‘box’ that has additional data member ‘depth’. The members of the class ‘rectangle’
//should consists of a constructor and a method area(). The ‘box’ should have a constructor. Write a program
//to implement this.

class Rectangle
{
	int length;
	int width;
	
	Rectangle()
	{
		//Implicit super constructor Rectangle() is undefined. Must explicitly invoke another constructor
	}
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public void area()
	{
		System.out.println("Area of Rectangle: "+(length*width));
	}
}
class Box extends Rectangle
{
	int depth;
	
	Box(int depth)
	{
		this.depth=depth;
	}
	public void depth()
	{
		System.out.println("Depth of Box: "+depth);
	}
}


public class RectangleBox {

	public static void main(String[] args) {
		Rectangle ra=new Rectangle(6,5);
		ra.area();
		
		Box bx1=new Box(10);
		bx1.depth();
	}

}

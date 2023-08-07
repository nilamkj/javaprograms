package com.polymorphism;
//4)WAP to create class shape with method draw().create class circle,
//square, Rectangle which extends Shape implement draw() differently in each child.

class Shape
{
	public int draw()
	{
		System.out.println("Shape class");
		return 0;
	}
}
class circle extends Shape
{
	public int draw()
	{
		System.out.println("circle class");
		return 0;
	}

}
class Square extends Shape
{
	public int draw()
	{
		System.out.println("square class");
		return 0;
	}
}
class Rectangle extends Shape
{
	@Override
	public int draw()
	{
		System.out.println("Rect class");
		return 10;//we can write any value after return
	}
}


public class DTypeOverriding {

	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.draw();
		
		Rectangle r=new Rectangle();
		r.draw();
		
		Shape s2=new Rectangle();
		s2.draw();
		
		int ans=s1.draw();
		System.out.println(ans);
	}
}


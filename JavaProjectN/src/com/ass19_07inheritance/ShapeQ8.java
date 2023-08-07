package com.ass19_07inheritance;

//8.Create shape class and show example of dynamic dispatching using child classes

class Shape
{
	public void show()
	{
		System.out.println("Different Shapes");
	}
}

class Circle extends Shape
{
	public void show()
	{
		System.out.println("This is Circle");
	}
}
class Square extends Shape
{
	public void show()
	{
		System.out.println("This is Square");
	}
}
class Triangle extends Shape
{
	public void show()
	{
		System.out.println("This is Triangle");
	}

}
public class ShapeQ8 {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.show();
		Circle c=new Circle();
		c.show();
		
		Square sq=new Square();
		sq.show();
		
		Triangle t=new Triangle();
		t.show();
		System.out.println("-------------");
		Shape sh;
		sh=s;
		s.show();
		sh=c;
		sh=sq;
		sh=t;
		sh.show();
		
	
	}

}

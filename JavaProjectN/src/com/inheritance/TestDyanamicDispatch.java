package com.inheritance;
class Fruit
{
	public void color()
	{
		System.out.println("Fruit Green");
	}
}
class Apple extends Fruit
{
	public void color()
	{
		System.out.println("Apple:red");
	}
}
class Banana extends Fruit
{
	public void color()
	{
		System.out.println("Banana:Yellow");
	}
}
public class TestDyanamicDispatch {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.color();
		Apple a=new Apple();
		a.color();
		Banana b=new Banana();
		b.color();
		
		System.out.println("---------------------");
		Fruit ft;
		ft=f;
		
		f.color();
		ft=a;
		ft=b;
		ft.color();
	}

}

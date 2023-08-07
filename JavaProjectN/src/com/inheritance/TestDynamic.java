package com.inheritance;

class Mobile
{
	public void msg()
	{
		System.out.println("Basic msg() method");
	}
}
class Basic extends Mobile
{
	public void msg()
	{
		System.out.println("Basic msg() method");
	}
	public void player()
	{
		System.out.println("Player method from child class");
	}

}
class Android extends Mobile
{
	public void msg()
	{
	System.out.println("Android msg() method");
	}
	public void notification()
	{
		System.out.println("Android notification method");
	}
}
public class TestDynamic {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.msg();
		
		//
		Mobile m2=new Basic();//upcasting or runtime polymorphism or dynamic dispatch
		m2.msg();
		
		m2=new Android();
		m2.msg();
		
		Basic b1=new Basic();
		b1.msg();
		b1.player();
	}
}


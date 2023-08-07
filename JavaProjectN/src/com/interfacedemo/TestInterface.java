package com.interfacedemo;

interface Printable
{
	int a=10;
	void showMsg();   //by default public abstract 
}
class Print implements Printable
{
	public void showMsg()
	{
		System.out.println("Printing Msg");
	}
}

public interface TestInterface 
{
	public static void main(String []args)
	{
		Print p=new Print();
		p.showMsg();
		
		Printable p1=new Print();
				p1.showMsg();
	}
}

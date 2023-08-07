package com.ass24_07Interface;
//2.	Write a program to create interface named test. In this interface the member function is square. 
//Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use
//the object of arithmetic class.

interface Test
{
	void square(int a);
}
class Arithmatic implements Test
{
	public void square(int s)
	{
		System.out.println(s*s);
	}
}
public interface ArithmaticQ2 {
public static void main(String []args)
{
	Arithmatic a=new Arithmatic();
	a.square(4);
}
}

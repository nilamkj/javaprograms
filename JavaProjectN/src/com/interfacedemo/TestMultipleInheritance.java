package com.interfacedemo;

interface intA
{
	void m1();
}
interface intB
{
	void m2();
}

class SimpleChild implements intA,intB
{
	public void m1()
	{
		System.out.println("m1 method from intA");
	}
	public void m2()
	{
		System.out.println("m2 method from intB");
	}
}
public interface TestMultipleInheritance 
{
	public static void main(String[]args)
	{
	SimpleChild sc=new SimpleChild();
	sc.m1();
	sc.m2();
	}
}

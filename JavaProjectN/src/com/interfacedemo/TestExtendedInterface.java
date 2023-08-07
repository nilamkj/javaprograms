package com.interfacedemo;

interface Mobile
{
	void call();
}
interface Basic extends Mobile
{
	void msg();
}
class Nokia implements Basic
{
	public void msg()
	{
		System.out.println("Nokia phone msg method");
	}
	public void call()
	{
		System.out.println("Nokia phone call method");
	}
}
public interface TestExtendedInterface
{
	public static void main(String []args)
	{
		Nokia n=new Nokia();
		n.call();
		n.msg();
	}
}

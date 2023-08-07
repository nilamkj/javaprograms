package com.inheritance;

class Flower
{
	public static void fragrance()
	{
		System.out.println("Flower Method");
	}
}

class Rose extends Flower
{
	public static void fragrance()
	{
		System.out.println("Rose Method");
	}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		Flower f=new Rose();
		f.fragrance();//method hiding because of using static methods
	}

}

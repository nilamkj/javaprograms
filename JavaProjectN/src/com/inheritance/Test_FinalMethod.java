package com.inheritance;

class Os
{
	public void coding()
	{
		System.out.println("code method in parent class");
	}
	public final void display()
	{
		System.out.println("Final method");
	}
}
class Windows extends Os
{
	public void coding()
	{
		System.out.println("Window coding");
	}
//	public void display()      //Cannot override the final method from Os
	{
		System.out.println(" method");
	}
}
public class Test_FinalMethod {

	public static void main(String[] args) {
		
	}

}

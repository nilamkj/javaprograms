package com.inheritance;

final class Employee
{
	//employee can not be extends
}
//class Manager extends Employee
//{
	//The type Person cannot subclass the final class Employee
//}
public class Test_final_keyword {

	final int v=2023;
	final int num;
	static final int x;
	static  
	{
		x=20;
	}
	static
	{
		//x=67  //can not reassign
	}
	
	public Test_final_keyword()
	{
		num=1212;
	}
	public Test_final_keyword(String str)
	{
		num=765;
	}
	public static void main(String[] args) {
		int a=10;
		a++;
		System.out.println(a);
		
		final int b;
		b=10;
		int c=a+b;
		
		System.out.println(b);
		System.out.println(c);
		
		Test_final_keyword t=new Test_final_keyword();
			System.out.println(t.v);

	}

}

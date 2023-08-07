package com.inheritance;

class Person
{
	protected String name;
	protected int age;
	protected String email;
	protected String contact;
	
	Person(String name,int age,String email,String contact)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.contact=contact;
	}
	public void show()
	{
		System.out.println("Name\t:"+name);
		System.out.println("age\t:"+age);
		System.out.println("email\t:"+email);
		System.out.println("contact\t:"+contact);
	}
}

class Teacher extends Person
{
	String degree;
	double salary;
	
	Teacher(String name,int age,String email,String contact,String degree,double salary)
	{
		super(name,age,email,contact);
		this.degree=degree;
		this.salary=salary;
	}
	public void show()
	{
		super.show();
		System.out.println("Degree\t:"+degree);
		System.out.println("Salary\t:"+salary);
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		Teacher t=new Teacher("Neha",25,"neha@gmail.com","123456789","B.tech",30000);
		t.show();

	}

}

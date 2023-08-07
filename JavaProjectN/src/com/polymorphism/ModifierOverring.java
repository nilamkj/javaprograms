package com.polymorphism;

class Person
{
	public void eat()
	{
		System.out.println("Parent class method");
	}
}

class Student extends Person
{
	@Override
	public void eat()
	{
		System.out.println("Child class method");
	}
}

public class ModifierOverring {

	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		
		Student s=new Student();
		s.eat();
		
		Person p1=new Student();
		p1.eat();
	}

}

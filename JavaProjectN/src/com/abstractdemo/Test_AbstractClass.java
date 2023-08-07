package com.abstractdemo;

abstract class Animal
{
	public String name;
	Animal(String name)
	{
		this.name=name;
	}
	public abstract void makeSound();
	
		public void eat()
		{
			System.out.println("Animal is eating");
		}
}
class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}
	public void makeSound()
	{
		System.out.println(name+" barks");
	}
}
class Cat extends Animal
{
	Cat(String name)
	{
		super(name);
	}
	public void makeSound()
	{
		System.out.println(name+" meow");
	}
}

public class Test_AbstractClass {

	public static void main(String[] args) {
		Animal a=new Dog("rocky");
		a.eat();
		a.makeSound();
		
		a=new Cat("mani");
		a.eat();
		a.makeSound();

		//Animal a1=new Animal();    //Cannot instantiate the type Animal
		//a1.eat();
	}

}

package com.ass_methodoverriding;

//8)WAP to create class Person with method readScript().create class Actor which 
//extends Person implement readScript() differently in child.

class Person
{
	String name="Neha";
	public void readScript()
	{
		System.out.println("Person name: "+name);
		System.out.println("Person read the script");
	}
}
class Actor extends Person
{
	public void readScript()
	{
		String name="Anaya";
		System.out.println("Actor name: "+name);
		System.out.println("Actor read the script");
	}
}
public class PersonOverriding {

	public static void main(String[] args) {
		Person p=new Person();
		p.readScript();
		
		Actor a=new Actor();
		a.readScript();
	}

}
